package application;

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
    protected String dataNascimento;
    protected boolean status;

    /**
     * Construtor de Pessoa
     * @param nome nome da pessoa
     * @param email email da pessoa
     * @param telefone telefone da pessoa
     * @param sexo sexo da pessoa
     * @param dataNascimento data de nascimento da pessoa
     */
    public Pessoa(String nome, String email, String telefone, char sexo, String dataNascimento) {               
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
        this.setAtivo(true);
    }       

    /**
     * @return String codigo
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * @param codigo String
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome String
     */
    public final void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email String
     */
    public final void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String telefone
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * @param telefone String
     */
    public final void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return char sexo
     */
    public char getSexo() {
        return this.sexo;
    }

    /**
     * @param sexo char
     */
    public final void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return Date dataNascimento
     */
    public String getDataNascimento() {
        return this.dataNascimento;
    }

    /**
     * @param dataNascimento Date
     */
    public final void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }    

    /**
     * @param status boolean
     */
    public final void setAtivo(boolean status) {
        this.status = status;
    }

    /**
     * @return boolean status
     */   
    public boolean isAtivo(){
        return this.status;
    }
}