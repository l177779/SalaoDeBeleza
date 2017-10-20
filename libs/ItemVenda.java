/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs;

/**
 *
 * @author guilherme
 */
public abstract class ItemVenda {
    
    protected String codigo;
    protected String descricao;
    protected double preco;

    /**
     * 
     * @param codigo
     * @param descricao
     * @param preco 
     */
    public ItemVenda(String codigo, String descricao, double preco) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setPreco(preco);
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
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * 
     * @param descricao 
     */
    public final void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * 
     * @return double
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * 
     * @param preco 
     */
    public final void setPreco(double preco) {
        this.preco = preco;
    }
    
}
