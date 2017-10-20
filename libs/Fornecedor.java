/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs;

import java.util.Date;

/**
 *
 * @author guilherme
 */
public class Fornecedor extends Pessoa {

    private String cnpj;
    
    /**
     * 
     * @param codigo
     * @param nome
     * @param email
     * @param telefone
     * @param sexo
     * @param dataNascimento    
     */
    public Fornecedor(String codigo, String nome, String email, String telefone, char sexo, Date dataNascimento, String cnpj) {
        super(codigo,nome,email,telefone,sexo,dataNascimento);
        this.setCnpj(cnpj);
    }        

    /**
     * 
     * @return String
     */
    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * 
     * @param cnpj 
     */
    public final void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }   
    
}
