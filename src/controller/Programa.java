/**
 * Contem funcoes basicas utilizadas pelo metodo principal
 */
package controller;

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
