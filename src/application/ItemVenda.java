/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author guilherme
 */
public abstract class ItemVenda {

    protected String codigo;
    protected String descricao;
    protected double preco;

    /**
     * Construtor do ItemVenda
     * @param codigo identificador do ItemVenda
     * @param descricao descricao do ItemVenda
     * @param preco preco do ItemVenda
     */
    public ItemVenda(String codigo, String descricao, double preco) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    /**
     * Get codigo
     * @return String codigo
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * Set codigo
     * @param codigo identificador do ItemVenda
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Get descricao
     * @return String descricao
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Set descricao
     * @param descricao descricao do ItemVenda
     */
    public final void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Get preco
     * @return double preco
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * Set preco
     * @param preco preco do ItemVenda
     */
    public final void setPreco(double preco) {
        this.preco = preco;
    }
}