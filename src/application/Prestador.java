package application;

import java.util.Date;

/**
 * 
 * @author guilherme
 */
public class Prestador extends Pessoa {

    private double comissao;

   /**
    * 
    * @param codigo
    * @param nome
    * @param email
    * @param telefone
    * @param sexo
    * @param dataNascimento
    * @param comissao
    */
    public Prestador(String nome, String email, String telefone, char sexo, Date dataNascimento, double comissao) {
        super(nome, email, telefone, sexo, dataNascimento);        
        this.setComissao(comissao);
    }
    
    /**
     * 
     * @return double
     */
    public double getComissao() {
        return comissao;
    }

    /**
     * 
     * @param comissao 
     */
    public final void setComissao(double comissao) {
        this.comissao = comissao;
    }
         
}
