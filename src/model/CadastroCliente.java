/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Cliente;
import java.util.List;

/**
 *
 * @author alekatao
 */
public class CadastroCliente {

    private List<Cliente> clientes;

     /**
     * Cria objeto com dados obtidos de outras fontes
     * 
     * @param data List com vetor de String contendo do prestador
     */
    public CadastroCliente(List<Cliente> data) {
        clientes = data;
    }

    /**
     * Obtem um Cliente
     * 
     * @return um vetor de string com os dados do cliente
     */
    public Cliente getCliente() {
        return clientes.get(0);
    }
}