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
public class Produto extends ItemVenda {

    private double qtdeEstoque; 

    /**
     * Construtor de produto
     * @param codigo identificador do produto
     * @param descricao descricao do produto
     * @param preco preco do produto
     * @param qtdeEstoque quantidade do produto em estoque
     */
    public Produto(String codigo, String descricao, double preco, double qtdeEstoque) {
        super(codigo, descricao, preco);
        this.setQtdeEstoque(qtdeEstoque);       
    }

    /**
     * @return double qtdeEstoque
     */
    public double getQtdeEstoque() {
        return this.qtdeEstoque;
    }

    /**
     * @param qtdEstoque double
     */
    public final void setQtdeEstoque(double qtdEstoque) {
        this.qtdeEstoque = qtdEstoque;
    }

    /**
     * Sobreescrita do metodo toString para retornar os dados basicos do produto
     * @return String dadosBasicosProduto
     */
    @Override
    public String toString() {
        return "Produto{" + "codigo = " + codigo + ", descrição = " + descricao + ", preco = " + preco +", quantidade em estoque =" + qtdeEstoque + "}";
    }
}