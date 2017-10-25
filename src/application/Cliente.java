package application;

import java.util.Date;

/**
 * 
 * @author guilherme
 */
public class Cliente extends Pessoa {

    private String cpf;

    /**
     * Construtor do cliente
     * @param codigo identificador da pessoa
     * @param nome nome do cliente
     * @param email email do cliente
     * @param telefone telefone do cliente
     * @param sexo sexo do cliente
     * @param dataNascimento data de nascimento do cliente
     * @param cpf cpf do cliente
     */
    public Cliente(String codigo, String nome, String email, String telefone, char sexo, Date dataNascimento, String cpf) {
        super(codigo, nome, email, telefone, sexo, dataNascimento);
        this.setCpf(cpf);
    }

    /**
     * Get cpf
     * @return String cpf
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * Set cpf
     * @param cpf cpf do cliente
     */
    public final void setCpf(String cpf) {
        this.cpf = cpf;
    } 
}
