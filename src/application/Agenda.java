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
    private String codigoPrestador;
    private List<Agendamento> agendamentos;   

    /**
     * Construtor da agenda
     * @param codigo identificador da agenda
     * @param codigoPrestador codigo do prestador dono da agenda
     * @param agendamentos lista de agendamentos de servicos do prestador
     */
    public Agenda(String codigo, String codigoPrestador, List<Agendamento> agendamentos) {
        setCodigo(codigo);
        setCodigoPrestador(codigoPrestador);
        setAgendamentos(agendamentos);
    }

    /**
     * Get codigo
     * @return String codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set codigo
     * @param codigo identificador da agenda
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Get prestador
     * @return String codigoPrestador
     */
    public String getCodigoPrestador() {
        return codigoPrestador;
    }

    /**
     * Set prestador
     * @param prestador codigo do prestador dono da agenda
     */
    public final void setCodigoPrestador(String prestador) {
        this.codigoPrestador = prestador;
    }

    /**
     * Get agendamentos
     * @return List agendamentos
     */
    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    /**
     * Set agendamentos
     * @param agendamentos lista de agendamentos de servicos do prestador
     */
    public final void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }   
}