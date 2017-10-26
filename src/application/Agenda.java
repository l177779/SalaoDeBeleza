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
     * @return String codigoPrestador
     */
    public String getCodigoPrestador() {
        return codigoPrestador;
    }

    /**
     * @param prestador String
     */
    public final void setCodigoPrestador(String prestador) {
        this.codigoPrestador = prestador;
    }

    /**
     * @return List agendamentos
     */
    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    /**
     * @param agendamentos List
     */
    public final void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }   
}