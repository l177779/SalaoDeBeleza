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
    public Cliente(String nome, String cpf, String email, String telefone, char sexo, Date dataNascimento) {
        super(nome, email, telefone, sexo, dataNascimento);
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

    /**
     * Sobreescrita do metodo toString para retornar os dados basicos do cliente
     * @return String dadosBasicosCliente
     */
    @Override
    public String toString() {
        return "Cliente{" + "nome = " + nome + ", telefone = " + telefone + " email = " + email +"}";
    }
}