/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Menu {
    
    private String[] opcoes;

    /**
     * 
     * @param opcoes 
     */
    public Menu(String[] opcoes) {
        setOpcoes(opcoes);        
    }

    /**
     * 
     * @return 
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * 
     * @param opcoes 
     */
    public final void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }
    
    public void exibir(){
        System.out.println("Escolha uma opção: ");
        
        for(int i = 0; i < opcoes.length; i++){            
            System.out.println((i+1)+"- "+opcoes[i]);
        }
    }
    
    /**
     *
     * @return
     * @throws NumberFormatException
     * @throws Exception
     */
    public int getEscolha() throws Exception {
        
        //cria scanner para pegar opção selecionada
        Scanner s;
        s = new Scanner(System.in);
        
        int escolha = -1;
                
        try{
            escolha = s.nextInt();
        }catch(Exception e){
            throw new Exception();            
        }
        
        return escolha;
    }
    
    public boolean trataEscolha(int escolha){        
        return escolha >= 0 && escolha <= this.opcoes.length;
    }
}
