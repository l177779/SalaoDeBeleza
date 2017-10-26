/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import application.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class Programa {
    /**
     * 
     * @param nome 
     */
    public void start(String nome) throws ParseException{
        Salao.setNome("Vicellis");
        boasVindas();
        
        try{
            Cliente cli = new Cliente("Guilherme","47577220876","gg.dossantos@hotmail.com","19982534663",'M',new SimpleDateFormat("dd/MM/yyyy").parse("11/08/1998"));        
            Cliente cli2 = new Cliente("José","47577220876","gg.dossantos@hotmail.com","19982534663",'M',new SimpleDateFormat("dd/MM/yyyy").parse("11/08/1998"));
            
            System.out.println("Clientes cadastrados: \n");
            System.out.println(cli.toString());
            System.out.println(cli2.toString());
            
        }catch(ParseException ex){
            Logger LOGGER = Logger.getLogger(Programa.class.getName());
            LOGGER.log(Level.SEVERE, "Houve um erro ao cadastrar os clientes.");
        }
        despedida();
    }   
    
    /**
     * Exibe mensagem de boas vindas
     */
    private void boasVindas(){
        System.out.println("********************* Bem vindo ao salão de beleza "+Salao.getNome()+"! *********************");
    }

    /**
     * Exibe mensagem de despedida
     */
    private void despedida(){
        System.out.println("********************* O salão "+Salao.getNome()+" agradece, volte sempre! *********************");
    }
    
}
