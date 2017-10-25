/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;

/**
 *
 * @author guilherme
 */
public class NotaFiscal {

    private String numero;
    private double valor;
    private Date data;

    /**
     * Construtor de NotaFiscal
     * @param numero numero da NotaFiscal
     * @param valor valor da NotaFiscal
     * @param data data de emissão da NotaFiscal
     */
    public NotaFiscal(String numero, double valor, Date data) {
        setNumero(numero);
        setValor(valor);
        setData(data);
    }

    /**
     * Get numero
     * @return String numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Set numero
     * @param numero numero da NotaFiscal
     */
    public final void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Get valor
     * @return double valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Set valor
     * @param valor valor da NotaFiscal
     */
    public final void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Get data
     * @return Date data
     */
    public Date getData() {
        return data;
    }

    /**
     * Set data
     * @param data data da NotaFiscal
     */
    public final void setData(Date data) {
        this.data = data;
    }
}