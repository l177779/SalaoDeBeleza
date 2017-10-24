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
     * 
     * @param codigo
     * @param data
     * @param valor 
     */
    public Compra(String codigo,Date data, double valor) {
        setCodigo(codigo);
        setData(data);
        setValor(valor);
    }

    
    
    /**
     * 
     * @return 
     */
    public String getCodigo() {
        return codigo;
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
     * @return 
     */
    public Date getData() {
        return data;
    }

    /**
     * 
     * @param data 
     */
    public final void setData(Date data) {
        this.data = data;
    }

    /**
     * 
     * @return 
     */
    public double getValor() {
        return valor;
    }

    /**
     * 
     * @param valor 
     */
    public final void setValor(double valor) {
        this.valor = valor;
    }
}
