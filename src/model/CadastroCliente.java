/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
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
    public String[] getCliente(int index) {
        return clientes.get(index);
    }
    
    /**
     * Obtem a lista Cliente
     * 
     * @return uma lista Clientes
     */
    public List<Cliente> getListaCliente() {
        int i = 0;
        List<Cliente> lista = new ArrayList<>();
        
        for (i = 0; i < clientes.size(); i++){
            String str[] = new String[7];
            str = clientes.get(i);
//            Cliente cliente = new Cliente(str[1], str[2], str[3], str[4], str[5].charAt(0), str[6]);
            lista.add(new Cliente(str[1], str[2], str[3], str[4], str[5].charAt(0), str[6]));
        }
        return lista;
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
    public void insereCliente(Cliente cliente) {
        String str[] = new String[7];
        str[0] = cliente.getCodigo();
        str[1] = cliente.getNome();
        str[2] = cliente.getCpf();
        str[3] = cliente.getEmail();
        str[4] = cliente.getTelefone();
        str[5] = Character.toString(cliente.getSexo());
        str[6] = cliente.getDataNascimento();
        clientes.add(str);
    }
    
}