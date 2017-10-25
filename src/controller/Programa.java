/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import model.ArquivoPessoa;
import model.CadastroPessoa;
import view.Menu;

/**
 *
 * @author guilherme
 */
public class Programa {
    
    
    /**
     * 
     * @param nome 
     */
    public void start(String nome){
        Salao.setNome("Vicellis");
        boasVindas();
        
        telaInicial();
        
        despedida();
    }   

    /**
     * Método pega escolha do menu e
     * chama proxima "tela" de acordo com a opção selecionada
     */
    private void telaInicial() {
    
        int escolha = -1;
        
        escolha = selecionarOpcoes("Menu Principal", Arrays.asList("Cadastros", "Venda", "Compra", "Consultas","Sair"));
        
        switch(escolha){
            case 1: 
                telaCadastros();
                break;
            case 2: 
                telaVenda();
                break;
            case 3: 
                telaCompra();
                break;
            case 4: 
                telaConsultas();
                break;
            case 0:
                break;
        }
    }
    
    /**
     * 
     */
    private void telaCadastros(){
        int escolha = -1;
        
        escolha = selecionarOpcoes("Cadastros", Arrays.asList("Cadastrar Cliente", "Cadastrar Produto", "Cadastrar Serviço", "Cadastrar Fornecedor"));
        
        switch(escolha){
            case 1: 
            break;
            case 2: 
            break;
            case 3: 
            break;
            case 4: 
        }
    }
    
    /**
     * 
     */
    private void telaVenda(){
        
    }
    
    /**
     * 
     */
    private void telaCompra(){

    }
    
    /**
     * 
     */
    private void telaConsultas(){
        int escolha = -1;
        
        escolha = selecionarOpcoes("Consultas", Arrays.asList("Consultar Clientes", "Consultar Produtos", "Consultar Serviços", "Consultar Fornecedores"));
        
        switch(escolha){
            case 1: 
                ArquivoPessoa arq = new ArquivoPessoa();
                CadastroPessoa obj = arq.load();
                String pessoa[] = new String[7];
                System.out.println("Teste de Arquivo");
                pessoa = obj.getPessoa();
                
                System.out.println(Arrays.toString(pessoa));
                arq.save(obj);
            break;
            case 2: 
            break;
            case 3: 
            break;
            case 4: 
        }
    }
    
    /**
     * Exibe menu com opções a serem selecionadas
     * Verifica se a opção é válida e retorna-a
     * @param opcoes
     * @return 
     */
    private int selecionarOpcoes(String titulo, List<String> opcoes){
        
        //cria menu, utilizado provisóriamente enquanto não aprendemos interfaces gráficas
        Menu menu;
        menu = new Menu(titulo, opcoes);
        
        int op = -1;
        
        do{
            menu.exibir();

            try{
                op = menu.getEscolha();

                if(!menu.trataEscolha(op)){                    
                    op = -1;
                }

            }catch(Exception e){            
                System.out.println("Houve um erro, tente novamente, se o erro persistir, entre em contato!");
                op = -1;
            }
        }while(op == -1);
        
        return op;
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
