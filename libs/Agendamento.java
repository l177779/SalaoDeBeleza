package libs;

import java.sql.Time;
import java.util.Date;

public class Agendamento {

    private String codigo;
    private Date data;
    private Time hora;
    private Cliente cliente;
    private Prestador prestador;
    private Servico servico;
    private Boolean confirmado;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }  

    public Time getHora() {
        return this.hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }  
    
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prestador getPrestador() {
        return this.prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Servico getServico() {
        return this.servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Boolean getConfirmado() {
        return this.confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }
}
