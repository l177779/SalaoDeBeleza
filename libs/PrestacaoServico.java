/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs;

import java.sql.Time;

/**
 *
 * @author guilherme
 */
public class PrestacaoServico {

    private String codigo;
    private Time inicio;
    private Time fim;
    private Servico servico;
    private Prestador prestador;
    private Cliente cliente;
    
    /**
     * 
     * @param codigo
     * @param inicio
     * @param servico
     * @param prestador 
     * @param cliente 
     */
    public PrestacaoServico(String codigo, Time inicio, Servico servico, Prestador prestador, Cliente cliente) {
        this.setCodigo(codigo);
        this.setInicio(inicio);
        this.setFim(null);
        this.setServico(servico);
        this.setCliente(cliente);
        this.setPrestador(prestador);
    }
    
    /**
     * 
     * @param codigo
     * @param inicio
     * @param fim
     * @param servico
     * @param prestador
     * @param cliente 
     */
    public PrestacaoServico(String codigo, Time inicio, Time fim, Servico servico, Prestador prestador, Cliente cliente) {
        this(codigo, inicio, servico, prestador, cliente);
        this.setFim(fim);
    }

    /**
     * 
     * @return 
     */
    public String getCodigo() {
        return this.codigo;
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
    public Time getInicio() {
        return this.inicio;
    }

    /**
     * 
     * @param inicio 
     */
    public final void setInicio(Time inicio) {
        this.inicio = inicio;
    }

    /**
     * 
     * @return 
     */
    public Time getFim() {
        return this.fim;
    }

    /**
     * 
     * @param fim 
     */
    public final void setFim(Time fim) {
        this.fim = fim;
    }

    public Servico getServico() {
        return servico;
    }

    public final void setServico(Servico servico) {
        this.servico = servico;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public final void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public final void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
