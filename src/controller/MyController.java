/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author guilherme
 */
public class MyController {
    
    private static final Logger LOGGER = Logger.getLogger(Programa.class.getName());
    
    /**
     * 
     * @param args 
     */
    public static void main(String args[]){
                
        FileHandler fh = null;
        try {
            fh = new FileHandler("log-acesso.txt");
            fh.setLevel(Level.FINE);
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(MyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        LOGGER.addHandler(fh);    
        
        try{
            Programa prog;
            prog = new Programa();

            LOGGER.log(Level.INFO, "Entrou no sistema às: {0}", new SimpleDateFormat("HH:mm - dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
            
            prog.start("Vicellis");
            
            LOGGER.log(Level.INFO, "Saiu do sistema às: {0}", new SimpleDateFormat("HH:mm - dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
            
        }catch(Exception ex){
            LOGGER.log(Level.SEVERE, ex.getMessage());
            System.out.println("Algo deu errado, esse programa será finalizado.");
        }
        
    }
}
