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
     * 
     * @param qtde
     * @param preco
     * @param codigoProduto 
     * @param codigoCompra 
     */
    public ItemCompra(int qtde, double preco, String codigoProduto, String codigoCompra) {
        setQtde(qtde);
        setPreco(preco);
        setCodigoProduto(codigoProduto);
        setCodigoCompra(codigoCompra);
    }
    
    /**
     * 
     * @return 
     */
    public int getQtde() {
        return qtde;
    }
    
    /**
     * 
     * @param qtde 
     */
    public final void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * 
     * @return 
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * 
     * @param codigoProduto 
     */
    public final void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * 
     * @return 
     */
    public String getCodigoCompra() {
        return codigoCompra;
    }

    /**
     * 
     * @param codigoVenda 
     */
    public final void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    /**
     * 
     * @return 
     */
    public double getPreco() {
        return preco;
    }

    /**
     * 
     * @param preco 
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
