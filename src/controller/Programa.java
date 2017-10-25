/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import application.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                    
        int escolha = selecionarOpcoes("Menu Principal", Arrays.asList("Cadastros", "Venda", "Compra", "Consultas","Sair"));
        
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
                //sai apenas
                break;
        }
    }
    
    /**
     * 
     */
    private void telaCadastros(){        
        
        int escolha = selecionarOpcoes("Cadastros", Arrays.asList("Cadastrar Cliente"/*, "Cadastrar Produto", "Cadastrar Serviço", "Cadastrar Fornecedor"*/,"Voltar"));
        
        switch(escolha){
            case 1:
                try{
                    telaCadastroCliente();
                }catch(ParseException ex){
                    Logger LOGGER = Logger.getLogger(Programa.class.getName());
                    LOGGER.log(Level.SEVERE, "Houve um erro ao cadastrar o cliente, a data informada não é válida");                    
                }
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4:
                break;
            case 0:
                telaInicial();
                break;
        }
    }
    
    /**
     * 
     * @throws java.text.ParseException
     */
    public void telaCadastroCliente() throws ParseException {
        
        Scanner reader = new Scanner(System.in);
        
        String nome;
        String email;
        String telefone;
        char sexo;
        String dataString;
        String CPF;
        
        System.out.println("Digite o nome do cliente:");
        nome = reader.nextLine();
        
        System.out.println("Digite o cpf do cliente: ");
        CPF = reader.nextLine();
        
        System.out.println("Digite o email do cliente:");
        email = reader.nextLine();
        
        System.out.println("Digite o telefone do cliente:");
        telefone = reader.nextLine();
        
        //ta dando erro aqui
        /*System.out.println("Digite o sexo do cliente:");*/
        //sexo = reader.next().charAt(0);
        
        /*System.out.println("Digite a data de nascimento do cliente:");
        dataString = reader.nextLine();*/
        dataString = "11/08/1998";
        
        Cliente cli = new Cliente(nome,CPF,email,telefone,'M',new SimpleDateFormat("dd/MM/yyyy").parse(dataString));
        
        System.out.println(cli.toString());
    }
    
    /**
     * 
     */
    private void telaVenda(){
        System.out.println("There isn't nothing here.");
    }
    
    /**
     * 
     */
    private void telaCompra(){
        System.out.println("There isn't nothing here.");
    }
    
    /**
     * 
     */
    private void telaConsultas(){
        int escolha = selecionarOpcoes("Consultas", Arrays.asList("Consultar Clientes", "Consultar Produtos", "Consultar Serviços", "Consultar Fornecedores"));
        
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
