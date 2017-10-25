/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Menu {
    
    private List<String> opcoes;
    private String titulo;

    /**
     * Construtor
     * @param titulo
     * @param opcoes 
     */
    public Menu(String titulo, List<String> opcoes) {
        setTitulo(titulo);
        setOpcoes(opcoes);        
    }
    
    /**
     * 
     */
    public void exibir(){
        
        System.out.println("\n**** "+getTitulo()+" ****");
        System.out.println("Escolha uma opção: ");
                
        int i = 0;
        for (String op : opcoes) {
            if("Sair".equals(op) || "Voltar".equals(op)){
                System.out.println("0 - "+op);
            }else{
                System.out.println((++i)+" - "+op);
            }
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
        }finally{
            return escolha;
        }
    }
    
    public boolean trataEscolha(int escolha){        
        return escolha >= 0 && escolha <= this.opcoes.size();
    }
    
    /**
     * 
     * @return 
     */
    public List<String> getOpcoes() {
        return opcoes;
    }

    /**
     * 
     * @param opcoes 
     */
    public final void setOpcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    /**
     * 
     * @return 
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * @param titulo 
     */
    public final void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
