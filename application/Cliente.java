package application;

import java.util.Date;

/**
 * 
 * @author guilherme
 */
public class Cliente extends Pessoa {

    private String tipoCliente;

    /**
     * 
     * @param codigo
     * @param nome
     * @param email
     * @param telefone
     * @param sexo
     * @param dataNascimento
     * @param tipoCliente 
     */
    public Cliente(String codigo, String nome, String email, String telefone, char sexo, Date dataNascimento, String tipoCliente) {
        super(codigo, nome, email, telefone, sexo, dataNascimento);
        this.setTipoCliente(tipoCliente);
    }

    /**
     * 
     * @return String
     */
    public String getTipoCliente() {
        return this.tipoCliente;
    }

    /**
     * 
     * @param tipoCliente 
     */
    public final void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    } 
}
