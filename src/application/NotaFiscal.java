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
     * @return String numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero numero da NotaFiscal
     */
    public final void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return double valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor valor da NotaFiscal
     */
    public final void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return Date data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data data da NotaFiscal
     */
    public final void setData(Date data) {
        this.data = data;
    }
}