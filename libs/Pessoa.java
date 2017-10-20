package libs;

import java.util.Date;

/**
 *
 * @author guilherme
 */
public abstract class Pessoa {    
    protected String codigo;
    protected String nome;
    protected String email;    
    protected String telefone;
    protected char sexo;
    protected Date dataNascimento;
    protected boolean status;

    /**
     *
     * @param codigo
     * @param nome
     * @param email
     * @param telefone
     * @param sexo
     * @param dataNascimento
     */
    public Pessoa(String codigo, String nome, String email, String telefone, char sexo, Date dataNascimento) {               
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
        this.setAtivo(true);
    }       

    /**
     * 
     * @return String
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * 
     * @param codigo 
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * 
     * @return String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * 
     * @param nome 
     */
    public final void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return String
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 
     * @param email 
     */
    public final void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return String
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * 
     * @param telefone 
     */
    public final void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * 
     * @return 
     */
    public char getSexo() {
        return this.sexo;
    }

    /**
     * 
     * @param sexo 
     */
    public final void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * 
     * @return Date
     */
    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    /**
     * 
     * @param dataNascimento 
     */
    public final void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }    

    /**
     * 
     * @param status 
     */
    public final void setAtivo(boolean status) {
        this.status = status;
    }
    
    /**
     * 
     * @return boolean
     */   
    public boolean isAtivo(){
        return this.status;
    }
    
}