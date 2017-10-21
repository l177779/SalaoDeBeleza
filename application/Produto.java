/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class Produto extends ItemVenda {
    
    private double qtdEstoque; 
    
    /**
     * 
     * @param codigo
     * @param descricao
     * @param preco 
     * @param qtdEstoque 
     */
    public Produto(String codigo, String descricao, double preco, double qtdEstoque) {
        super(codigo, descricao, preco);
        this.setQtdEstoque(qtdEstoque);       
    }

    /**
     * 
     * @return double
     */
    public double getQtdEstoque() {
        return this.qtdEstoque;
    }

    /**
     * 
     * @param qtdEstoque 
     */
    public final void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
}
