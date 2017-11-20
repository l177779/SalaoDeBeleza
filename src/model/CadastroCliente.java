/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Cliente;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author alekatao
 */
public class CadastroCliente implements Serializable{
    
    private List<String[]> clientes;

     /**
     * Cria objeto com dados obtidos de outras fontes
     * 
     * @param data List com vetor de String contendo do prestador
     */
    public CadastroCliente(List<String[]> data) {
        clientes = data;
    }

    /**
     * Obtem um Cliente
     * 
     * @return um vetor de string com os dados do cliente
     */
    public String[] getCliente() {
        return clientes.get(0);
    }
    
    /**
     * Obtem o numero de clientes
     * 
     * @return um inteiro dcom o numero de clientes
     */
    public int getQuantidadeClientes() {
        return clientes.size();
    }
    
     /**
     * Adiciona um Cliente na lista
     * 
     * @return 
     */
    public void insereCliente(String[] cliente) {
        clientes.add(cliente);
    }
    
}