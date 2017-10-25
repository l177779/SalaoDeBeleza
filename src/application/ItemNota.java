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
     * Get quantidade
     * @return int quantidade
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * Set quantidade
     * @param qtde quantidade do ItemNota
     */
    public final void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * Get preco
     * @return double preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Set preco
     * @param preco preco do ItemNota
     */
    public final void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Get codigo do ItemVenda
     * @return String codigoItemVenda
     */
    public String getCodigoItemVenda() {
        return codigoItemVenda;
    }

    /**
     * Set codigo do ItemVenda
     * @param codigoItemVenda codigo do ItemVenda
     */
    public final void setCodigoItemVenda(String codigoItemVenda) {
        this.codigoItemVenda = codigoItemVenda;
    }

    /**
     * Get codigo da NotaFiscal
     * @return String codigoNotaFiscal
     */
    public String getCodigoNotaFiscal() {
        return codigoNotaFiscal;
    }

    /**
     * Set codigo da NotaFiscal
     * @param codigoNotaFiscal codigo da NotaFiscal
     */
    public final void setCodigoNotaFiscal(String codigoNotaFiscal) {
        this.codigoNotaFiscal = codigoNotaFiscal;
    }
}