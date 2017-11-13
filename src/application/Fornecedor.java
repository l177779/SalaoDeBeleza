package application;

/**
 *
 * @author guilherme
 */
public class Fornecedor extends Pessoa {

    private String cnpj;

    /**
     * Construtor do fornecedor
     * @param nome
     * @param email
     * @param telefone
     * @param sexo
     * @param dataNascimento    
     */
    public Fornecedor(String nome, String email, String telefone, char sexo, String dataNascimento, String cnpj) {
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
     * @param cnpj String
     */
    public final void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}