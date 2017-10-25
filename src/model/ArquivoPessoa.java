/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Pessoa;
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
import model.CadastroPessoa;

/**
 * Esta classe provê acesso aos dados persistentes com os dados de Pessoa. Se arquivo
 * serializado existe, é utilizado. Caso contrário, os dados são lidos do arquivo CSV.
 *
 * @author alekatao
 */


public class ArquivoPessoa {
    private static final Logger LOG = Logger.getLogger(ArquivoPessoa.class.getName());
    private static final String CSV_FILENAME = "Pessoa.csv";
    private static final String SERIAL_FILENAME = "Pessoa.dat";
    private final Path arquivoCsv;
    private final Path arquivoSerializado;
    
    
    /**
     * Constrói objeto ArquivoPessoa, inicializando informações sobre arquivos.
     */
    public ArquivoPessoa() {
        LOG.setLevel(Level.INFO);
        arquivoCsv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivoSerializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
    }
    
     /**
     * Carrega os dados do disco para um objeto CadastroPessoa. Se arquivo serializado existe, é utilizado.
     *
     * @return Referência para objeto com dados de IDH de todos os municípios.
     * @see IdhBrasil
     */
    public CadastroPessoa load() {
        if (Files.exists(arquivoSerializado)) {
            LOG.info("Usando " + arquivoSerializado.toString());
            return loadSerialized();
        } else {
            LOG.info("Usando " + arquivoCsv.toString());
            return new CadastroPessoa(loadAllFromCsv());
        }
    }
    
     /**
     * Salva os dados em formato serializado.
     *
     * @param dados Referência para objeto com dados pré-carregados
     */
    public void save(CadastroPessoa dados) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    Files.newOutputStream(arquivoSerializado));
            os.writeObject(dados);
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, "save", ex);
        }
    }
    
    private List<String[]> loadAllFromCsv() {
        
    List<String[]> dados = new ArrayList<>();

        BufferedReader source;
        try {
            source = Files.newBufferedReader(arquivoCsv,
                    StandardCharsets.ISO_8859_1);
            String header = source.readLine();
            String line = null;
            while ((line = source.readLine()) != null) {
                String pessoa[] = new String[7];
                pessoa = getPessoaFromLine(line);
                dados.add(pessoa);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArquivoPessoa.class.getName()).
                    log(Level.SEVERE, "loadAllFromCsv", ex);
        }
        return dados;
    }
    
    private String[] getPessoaFromLine(String line) {
        return line.split(";");
    }
    


    private CadastroPessoa loadSerialized() {
        ObjectInputStream is;
        CadastroPessoa dados = null;
        try {
            is = new ObjectInputStream(
                    Files.newInputStream(arquivoSerializado));
            dados = (CadastroPessoa) is.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            LOG.log(Level.SEVERE, "loadSerialized", ex);
        }
        return dados;
    }

}
