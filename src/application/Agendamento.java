package application;

/**
 * 
 * @author guilherme
 */
public class Agendamento {

    private String codigoCliente;
    private String codigoAgenda;
    private String data;
    private String hora;
    private Boolean confirmado;

    /**
     * Construtor do agendamento
     * @param codigoCliente identificador do cliente que está realizando o agendamento
     * @param codigoAgenda identificador da agenda em que o agendamento será inserido
     * @param data data do agendamento
     * @param hora hora do agendamento
     * @param confirmado status do agendamento (confirmado ou pendente)
     */
    public Agendamento(String codigoCliente, String codigoAgenda, String data, String hora, Boolean confirmado) {
        setCodigoCliente(codigoCliente);
        setCodigoAgenda(codigoAgenda);
        setData(data);
        setHora(hora);
        setConfirmado(confirmado);
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
    public String getData() {
        return this.data;
    }

    /**
     * @param data Date
     */
    public final void setData(String data) {
        this.data = data;
    }  

    /**
     * @return Time horaAgendamento
     */
    public String getHora() {
        return this.hora;
    }

    /**
     * @param horaAgendamento Time
     */
    public final void setHora(String horaAgendamento) {
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