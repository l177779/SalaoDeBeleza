/**
 * Contem funcoes basicas utilizadas pelo metodo principal
 */
package controller;

import application.Cliente;
import application.Prestador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ArquivoPrestador;
import model.CadastroPrestador;
import application.Salao;

/**
 *
 * @author guilherme
 */
public class Programa {
    /**
     * Exibe mensagem de boas vindas
     */
    public void boasVindas(){
        System.out.println("********************* Bem vindo ao salão de beleza " + Salao.getNome() + "! *********************");
    }

    /**
     * Exibe mensagem de despedida
     */
    public void despedida(){
        System.out.println("********************* O salão " + Salao.getNome() + " agradece, volte sempre! *********************");
    }
}
