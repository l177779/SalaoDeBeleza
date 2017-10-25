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
public class ItemCompra {

    private int qtde;
    private double preco;
    private String codigoProduto;
    private String codigoCompra;

    /**
     * Construtor do ItemCompra
     * @param qtde quantidade de items comprados
     * @param preco preco do item da compra
     * @param codigoProduto identificador do produto comprado
     * @param codigoCompra identificador da compra
     */
    public ItemCompra(int qtde, double preco, String codigoProduto, String codigoCompra) {
        setQtde(qtde);
        setPreco(preco);
        setCodigoProduto(codigoProduto);
        setCodigoCompra(codigoCompra);
    }

    /**
     * Get quantidade de items
     * @return int quantidade
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * Set quantidade de items
     * @param qtde quantidade de items
     */
    public final void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * Get codigo do produto
     * @return String codigoProduto
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * Set codigo do produto
     * @param codigoProduto codigo do produto
     */
    public final void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * Get codigo da compra
     * @return String codigoCompra
     */
    public String getCodigoCompra() {
        return codigoCompra;
    }

    /**
     * Set codigo da compra
     * @param codigoCompra codigo da compra
     */
    public final void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    /**
     * Get preco do ItemCompra
     * @return double precoItemCompra
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Set preco do ItemCompra
     * @param preco preco do ItemCompra
     */
    public final void setPreco(double preco) {
        this.preco = preco;
    }
}