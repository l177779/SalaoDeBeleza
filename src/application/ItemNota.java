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
public class ItemNota {

    private int qtde;
    private double preco;
    private String codigoItemVenda;
    private String codigoNotaFiscal;

    /**
     * Construtor do ItemNota
     * @param qtde
     * @param preco
     * @param codigoItemVenda
     * @param codigoNotaFiscal 
     */
    public ItemNota(int qtde, double preco, String codigoItemVenda, String codigoNotaFiscal) {
        setQtde(qtde);
        setPreco(preco);
        setCodigoItemVenda(codigoItemVenda);
        setCodigoNotaFiscal(codigoNotaFiscal);
    }

    /**
     * @return int quantidade
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * @param qtde quantidade do ItemNota
     */
    public final void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * @return double preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco preco do ItemNota
     */
    public final void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return String codigoItemVenda
     */
    public String getCodigoItemVenda() {
        return codigoItemVenda;
    }

    /**
     * @param codigoItemVenda codigo do ItemVenda
     */
    public final void setCodigoItemVenda(String codigoItemVenda) {
        this.codigoItemVenda = codigoItemVenda;
    }

    /**
     * @return String codigoNotaFiscal
     */
    public String getCodigoNotaFiscal() {
        return codigoNotaFiscal;
    }

    /**
     * @param codigoNotaFiscal codigo da NotaFiscal
     */
    public final void setCodigoNotaFiscal(String codigoNotaFiscal) {
        this.codigoNotaFiscal = codigoNotaFiscal;
    }
}