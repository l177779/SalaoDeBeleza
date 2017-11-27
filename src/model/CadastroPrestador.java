/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import application.Prestador;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alekatao
 */
public class CadastroPrestador implements Serializable{

    private List<String[]> prestadores;

     /**
     * Cria objeto com dados obtidos de outras fontes
     * 
     * @param data List com vetor de String contendo do prestador
     */
    public CadastroPrestador(List<String[]> data) {
        prestadores = data;
    }

    /**
     * Obtem um Prestador
     * 
     * @return um vetor de string com os dados do prestador
     */
    public String[] getPrestador(int index) {
        return prestadores.get(index);
    }

    /**
     * Obtem a lista Prestadores
     * 
     * @return uma lista prestadores
     */
    public List<Prestador> getListaPrestador() {
        int i = 0;
        List<Prestador> lista = new ArrayList<>();
        
        for (i = 0; i < prestadores.size(); i++){
            String str[] = new String[8];
            str = prestadores.get(i);
            lista.add(new Prestador(str[1], str[2], str[3], str[4].charAt(0), str[5], Double.parseDouble(str[7])));
            
        }
        return lista;
    }
    
     /**
     * Adiciona um Prestador na lista
     * 
     * @return 
     */
    public void inserePrestador(Prestador prestador) {
        String str[] = new String[7];
        str[0] = prestador.getCodigo();
        str[1] = prestador.getNome();
        str[2] = prestador.getEmail();
        str[3] = prestador.getTelefone();
        str[4] = Character.toString(prestador.getSexo());
        str[5] = prestador.getDataNascimento();
        str[6] = Double.toString(prestador.getComissao());
        
        prestadores.add(str);
    }
    
    
}