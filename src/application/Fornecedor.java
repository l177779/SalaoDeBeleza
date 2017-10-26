/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;

/**
 *
 * @author guilherme
 */
public class Fornecedor extends Pessoa {

    private String cnpj;

    /**
     * Construtor do fornecedor
     * @param codigo
     * @param nome
     * @param email
     * @param telefone
     * @param sexo
     * @param dataNascimento    
     */
    public Fornecedor( String nome, String email, String telefone, char sexo, Date dataNascimento, String cnpj) {
        super(nome,email,telefone,sexo,dataNascimento);
        this.setCnpj(cnpj);
    }

    /**
     * @return String cnpj
     */
    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * @param cnpj cnpj do fornecedor
     */
    public final void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}