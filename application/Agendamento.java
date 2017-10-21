package application;

import java.sql.Time;
import java.util.Date;

/**
 * 
 * @author guilherme
 */
public class Agendamento {

    private String codigo;
    private Date data;
    private Time hora;
    private Boolean confirmado;

    /**
     * 
     * @param codigo
     * @param data
     * @param hora
     * @param confirmado 
     */
    public Agendamento(String codigo, Date data, Time hora, Boolean confirmado) {
        setCodigo(codigo);
        setData(data);
        setHora(hora);
        setConfirmado(confirmado);
    }

    /**
     * 
     * @return 
     */
    public String isCodigo() {
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
    public Date getData() {
        return this.data;
    }

    /**
     * 
     * @param data 
     */
    public final void setData(Date data) {
        this.data = data;
    }  

    /**
     * 
     * @return 
     */
    public Time getHora() {
        return this.hora;
    }

    /**
     * 
     * @param hora 
     */
    public final void setHora(Time hora) {
        this.hora = hora;
    }         

    /**
     * 
     * @return 
     */
    public Boolean isConfirmado() {
        return this.confirmado;
    }

    /**
     * 
     * @param confirmado 
     */
    public final void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }
}
