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
    private int numero;
    private double valor;
    private Date data;

    public NotaFiscal(int numero, double valor, Date data) {
        setNumero(numero);
        setValor(valor);
        setData(data);
    }

    public int getNumero() {
        return numero;
    }

    public final void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public final void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public final void setData(Date data) {
        this.data = data;
    }
    
}
