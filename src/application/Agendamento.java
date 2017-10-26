package application;

import java.sql.Time;
import java.util.Date;

/**
 * 
 * @author guilherme
 */
public class Agendamento {

    private String codigo;
    private String codigoCliente;
    private String codigoAgenda;
    private Date data;
    private Time hora;
    private Boolean confirmado;

    /**
     * Construtor do agendamento
     * @param codigo identificador do agendamento
     * @param codigoCliente identificador do cliente que está realizando o agendamento
     * @param codigoAgenda identificador da agenda em que o agendamento será inserido
     * @param data data do agendamento
     * @param hora hora do agendamento
     * @param confirmado status do agendamento (confirmado ou pendente)
     */
    public Agendamento(String codigo, String codigoCliente, String codigoAgenda, Date data, Time hora, Boolean confirmado) {
        setCodigo(codigo);
        setCodigoCliente(codigoCliente);
        setCodigoAgenda(codigoAgenda);
        setData(data);
        setHora(hora);
        setConfirmado(confirmado);
    }

    /**
     * @return String codigo
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * @param codigo String
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String codigoCliente
     */
    public String getCodigoCliente() {
        return this.codigoCliente;
    }

    /**
     * @param cliente String
     */
    public final void setCodigoCliente(String cliente) {
        this.codigoCliente = cliente;
    }

    /**
     * @return String codigoAgenda
     */
    public String getCodigoAgenda() {
        return this.codigoAgenda;
    }

    /**
     * @param codigoAgenda String
     */
    public final void setCodigoAgenda(String codigoAgenda) {
        this.codigoAgenda = codigoAgenda;
    }

    /**
     * @return Date dataAgendamento
     */
    public Date getData() {
        return this.data;
    }

    /**
     * @param data Date
     */
    public final void setData(Date data) {
        this.data = data;
    }  

    /**
     * @return Time horaAgendamento
     */
    public Time getHora() {
        return this.hora;
    }

    /**
     * @param horaAgendamento Time
     */
    public final void setHora(Time horaAgendamento) {
        this.hora = horaAgendamento;
    }         

    /**
     * @return Boolean confirmado
     */
    public Boolean isConfirmado() {
        return this.confirmado;
    }

    /**
     * @param confirmado Boolean
     */
    public final void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }
}