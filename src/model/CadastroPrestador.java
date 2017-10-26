/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Prestador;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;
import model.ArquivoPrestador;

/**
 *
 * @author alekatao
 */
public class CadastroPrestador {
    
    private List<Prestador> prestadores;
    
    
     /**
     * Cria objeto com dados obtidos de outras fontes
     * 
     * @param data List com vetor de String contendo do prestador
     */
    public CadastroPrestador(List<Prestador> data) {
        prestadores = data;
    }
    
    /**
     * Obtem um Prestador
     * 
     * @return um vetor de string com os dados do prestador
     */
    public Prestador getPrestador() {

        return prestadores.get(0);
    }
    
    
}
