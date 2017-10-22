/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.*;


/**
 *
 * @author guilherme
 */
public class MyController {
    
    /**
     * 
     * @param args 
     */
    public static void main(String args[]){
       
        try{
            Salao vicellis;
            vicellis = new Salao();
            vicellis.start("Vicellis");
        }catch(Exception e){
            
        }
        
    }
}
