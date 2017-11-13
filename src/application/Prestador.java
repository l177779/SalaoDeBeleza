package application;

/**
 * 
 * @author guilherme
 */
public class Prestador extends Pessoa {

    private double comissao;

   /**
    * Construtor do prestador
    * @param nome nome do prestador
    * @param email email do prestador
    * @param telefone telefone do prestador
    * @param sexo sexo do prestador
    * @param dataNascimento data de nascimento do prestador
    * @param comissao porcentagem de comissao referente ao prestador
    */
    public Prestador(String nome, String email, String telefone, char sexo, String dataNascimento, double comissao) {
        super(nome, email, telefone, sexo, dataNascimento);        
        this.setComissao(comissao);
    }

    /**
     * 
     * @return double comissao
     */
    public double getComissao() {
        return comissao;
    }

    /**
     * @param comissao double
     */
    public final void setComissao(double comissao) {
        this.comissao = comissao;
    }
}