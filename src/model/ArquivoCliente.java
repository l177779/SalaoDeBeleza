/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Inicial;
//import model.CadastroCliente;

/**
 *
 * @author alekatao
 */


/**
 * Esta classe provê acesso aos dados persistentes com os dados de Cliente. Se arquivo
 * serializado existe, é utilizado. Caso contrário, os dados são lidos do arquivo CSV.
 *
 */
public class ArquivoCliente {
    Logger LOGGER = Logger.getLogger(Inicial.class.getName());
    private static final String CSV_FILENAME = "Cliente.csv";
    private static final String SERIAL_FILENAME = "CLIENTE.dat";
    private final Path arquivoCsv;
    private final Path arquivoSerializado;
    
    
    /**
     * Constrói objeto ArquivoCliente, inicializando informações sobre arquivos.
     */
    public ArquivoCliente() {
        LOGGER.setLevel(Level.INFO);
        arquivoCsv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivoSerializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
    }
    
     /**
     * Carrega os dados do disco para um objeto CadastroCliente. Se arquivo serializado existe, é utilizado.
     *
     * @return Referência para objeto com dados de Clientes.
     * 
     */
    public CadastroCliente load() {
        if (Files.exists(arquivoSerializado)) {
            LOGGER.info("Usando serializado " + arquivoSerializado.toString());
            return loadSerialized();
        } else {
            LOGGER.info("Usando " + arquivoCsv.toString());
            return new CadastroCliente(loadAllFromCsv());
        }
    }
    
     /**
     * Salva os dados em formato serializado.
     *
     * @param dados Referência para objeto com dados pré-carregados
     */
    public void save(CadastroCliente dados) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    Files.newOutputStream(arquivoSerializado));
            os.writeObject(dados);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "save", ex);
        }
    }
    
    private List<String[]> loadAllFromCsv() {
        
        List<String[]> dados = new ArrayList<>();

        BufferedReader source;
        try {
            source = Files.newBufferedReader(arquivoCsv,
                    StandardCharsets.UTF_8);
            String header = source.readLine();
            String line = null;

            while ((line = source.readLine()) != null) {
                String cliente[] = new String[7];
                cliente = getClienteFromLine(line);
                dados.add(cliente);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArquivoCliente.class.getName()).
                    log(Level.SEVERE, "loadAllFromCsv", ex);
        }
        return dados;
    }
    
    private String[] getClienteFromLine(String line) {
        return line.split(",");
    }

    private CadastroCliente loadSerialized() {
        ObjectInputStream is;
        CadastroCliente dados = null;
        try {
            is = new ObjectInputStream(Files.newInputStream(arquivoSerializado));
            dados = (CadastroCliente) is.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            LOGGER.log(Level.SEVERE, "loadSerialized", ex);
        }
        return dados;
    }

}
