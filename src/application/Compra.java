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
public class Compra {

    private String codigo;
    private Date data;
    private double valor;

    /**
     * Construtor de compra
     * @param codigo identificador da compra
     * @param data data da compra
     * @param valor valor da compra
     */
    public Compra(String codigo,Date data, double valor) {
        setCodigo(codigo);
        setData(data);
        setValor(valor);
    }

    /**
     * @return String codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo String
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Date dataCompra
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data Date
     */
    public final void setData(Date data) {
        this.data = data;
    }

    /**
     * @return double valorCompra
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor double
     */
    public final void setValor(double valor) {
        this.valor = valor;
    }
}