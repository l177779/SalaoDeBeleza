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
     * Get codigo
     * @return String codigo
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * Set codigo
     * @param codigo identificador do agendamento
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Get codigo do cliente que está realizando o agendamento
     * @return String codigoCliente
     */
    public String getCodigoCliente() {
        return this.codigoCliente;
    }
    
    /**
     * Set codigo do cliente que está realizando o agendamento
     * @param cliente identificador do cliente
     */
    public final void setCodigoCliente(String cliente) {
        this.codigoCliente = cliente;
    }
    
    /**
     * Get codigo da agenda em que será inserido o agendamento
     * @return String codigoAgenda
     */
    public String getCodigoAgenda() {
        return this.codigoAgenda;
    }
    
    /**
     * Set codigo da agenda em que será inserido o agendamento
     * @param codigoAgenda identificador da agenda
     */
    public final void setCodigoAgenda(String codigoAgenda) {
        this.codigoAgenda = codigoAgenda;
    }
    
    /**
     * Get data do agendamento
     * @return Date dataAgendamento
     */
    public Date getData() {
        return this.data;
    }

    /**
     * Set data
     * @param data data do agendamento
     */
    public final void setData(Date data) {
        this.data = data;
    }  

    /**
     * Get hora do agendamento
     * @return Time horaAgendamento
     */
    public Time getHora() {
        return this.hora;
    }

    /**
     * Set hora
     * @param hora hora do agendamento
     */
    public final void setHora(Time hora) {
        this.hora = hora;
    }         

    /**
     * Get confirmacao do agendamento
     * @return Boolean confirmado
     */
    public Boolean isConfirmado() {
        return this.confirmado;
    }

    /**
     * Set confirmado
     * @param confirmado boolean que representa o status do agendamento
     */
    public final void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }
}
