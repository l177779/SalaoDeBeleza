/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Prestador;
import java.util.List;

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