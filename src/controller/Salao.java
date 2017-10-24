/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author guilherme
 */
public class Salao {
    
    private static String nome;
    private static String endereco;
    private static String telefone;
    
    /**
     * 
     * @return 
     */
    public static String getNome() {
        return Salao.nome;
    }

    /**
     * 
     * @param nome 
     */
    public final static void setNome(String nome) {
        Salao.nome = nome;
    }        

    /**
     * 
     * @return 
     */
    public static String getEndereco() {
        return endereco;
    }

    /**
     * 
     * @param endereco 
     */
    public static void setEndereco(String endereco) {
        Salao.endereco = endereco;
    }

    /**
     * 
     * @return 
     */
    public static String getTelefone() {
        return telefone;
    }

    /**
     * 
     * @param telefone 
     */
    public static void setTelefone(String telefone) {
        Salao.telefone = telefone;
    }
}
