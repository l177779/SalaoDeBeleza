/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import application.Produto;
import java.util.Scanner;
import view.Menu;

/**
 *
 * @author guilherme
 */
public class Salao {
    
    private String nome;
    
    /**
     * 
     * @param nome 
     */
    public void start(String nome){
        setNome(nome);
        boasVindas();
        
        //cria menu, utilizado provisóriamente enquanto não aprendemos interfaces gráficas
        Menu menu;
        String[] opcoes = {"Cadastros","Venda","Compra","Consultas"};
        menu = new Menu(opcoes);
       
        int op;
        
        menu.exibir();
        
        try{
            op = menu.getEscolha();
            
            if(menu.trataEscolha(op)){
                System.out.println("Boa escolha, continuaremos amanhã!");
            }

        }catch(Exception e){            
            System.out.println("Houve um erro, tente novamente, se o erro persistir, entre em contato!");
        }
        
        
    }
    
    /**
     * 
     */
    private void boasVindas(){
        System.out.println("********************* Bem vindo ao salão de beleza "+getNome()+"! *********************");
    }

    /**
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome 
     */
    public final void setNome(String nome) {
        this.nome = nome;
    }        
}
