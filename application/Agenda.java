/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;

/**
 *
 * @author guilherme
 */
public class Agenda {
    
    private String codigo;    
    private Prestador prestador;
    private Cliente cliente;
    private List<Servico> servicos;
    private List<Agendamento> agendamentos;   

    /**
     * 
     * @param codigo
     * @param prestador
     * @param cliente
     * @param servicos
     * @param agendamentos 
     */
    public Agenda(String codigo, Prestador prestador, Cliente cliente, List<Servico> servicos, List<Agendamento> agendamentos) {
        setCodigo(codigo);
        setPrestador(prestador);
        setCliente(cliente);
        setServicos(servicos);
        setAgendamentos(agendamentos);
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
    public Prestador getPrestador() {
        return prestador;
    }

    /**
     * 
     * @param prestador 
     */
    public final void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    /**
     * 
     * @return 
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * 
     * @param cliente 
     */
    public final void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * 
     * @return 
     */
    public List<Servico> getServicos() {
        return servicos;
    }

    /**
     * 
     * @param servicos 
     */
    public final void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    /**
     * 
     * @return 
     */
    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    /**
     * 
     * @param agendamentos 
     */
    public final void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
    
}
