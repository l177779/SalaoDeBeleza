/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;
import model.ArquivoPessoa;

/**
 *
 * @author alekatao
 */
public class CadastroPessoa {
    
    private List<String[]> pessoas;
    
    
     /**
     * Cria objeto com dados obtidos de outras fontes
     * 
     * @param data List com vetor de String contendo da Pessoa
     */
    public CadastroPessoa(List<String[]> data) {
        pessoas = data;
    }
    
    /**
     * Obtem uma pessoa
     * 
     * @return um vetor de string com os dados da pessoa
     */
    public String[] getPessoa() {
        return pessoas.get(0);
    }
    
    
}
