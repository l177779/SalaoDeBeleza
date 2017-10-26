/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Prestador;
import controller.Programa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CadastroPrestador;

/**
 * Esta classe provê acesso aos dados persistentes com os dados de Prestador. Se arquivo
 * serializado existe, é utilizado. Caso contrário, os dados são lidos do arquivo CSV.
 *
 */
public class ArquivoPrestador {
    Logger LOGGER = Logger.getLogger(Programa.class.getName());
    private static final String CSV_FILENAME = "Prestador.csv";
    private static final String SERIAL_FILENAME = "Prestador.dat";
    private final Path arquivoCsv;
    private final Path arquivoSerializado;
    
    
    /**
     * Constrói objeto ArquivoPrestador, inicializando informações sobre arquivos.
     */
    public ArquivoPrestador() {
        LOGGER.setLevel(Level.INFO);
        arquivoCsv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivoSerializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
    }
    
     /**
     * Carrega os dados do disco para um objeto CadastroPrestador. Se arquivo serializado existe, é utilizado.
     *
     * @return Referência para objeto com dados de Prestadores.
     * 
     */
    public CadastroPrestador load() {
        if (Files.exists(arquivoSerializado)) {
            LOGGER.info("Usando serializado" + arquivoSerializado.toString());
            return loadSerialized();
        } else {
            LOGGER.info("Usando " + arquivoCsv.toString());
            return new CadastroPrestador(loadAllFromCsv());
        }
    }
    
     /**
     * Salva os dados em formato serializado.
     *
     * @param dados Referência para objeto com dados pré-carregados
     */
    public void save(CadastroPrestador dados) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    Files.newOutputStream(arquivoSerializado));
            os.writeObject(dados);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "save", ex);
        }
    }
    
    private List<Prestador> loadAllFromCsv() {
        
    List<Prestador> dados = new ArrayList<>();

        BufferedReader source;
        try {
            source = Files.newBufferedReader(arquivoCsv,
                    StandardCharsets.UTF_8);
            String header = source.readLine();
            String line = null;

            while ((line = source.readLine()) != null) {
                Prestador prestador = getPrestadorFromLine(line);

                dados.add(prestador);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArquivoPrestador.class.getName()).
                    log(Level.SEVERE, "loadAllFromCsv", ex);
        }
        return dados;
    }
    
    private Prestador getPrestadorFromLine(String line) {

        String str[] = new String[8];
        str = line.split(",");

        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data = formato.parse(str[5]);
        } catch (ParseException ex) {
            LOGGER.log(Level.SEVERE, "Parse String to Date", ex);
        }
        Prestador prestador = new Prestador(str[1], str[2], str[3], str[4].charAt(0), data, Double.parseDouble(str[7]));

        return prestador;
    }


    private CadastroPrestador loadSerialized() {
        ObjectInputStream is;
        CadastroPrestador dados = null;
        try {
            is = new ObjectInputStream(Files.newInputStream(arquivoSerializado));
            dados = (CadastroPrestador) is.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            LOGGER.log(Level.SEVERE, "loadSerialized", ex);
        }
        return dados;
    }

}
