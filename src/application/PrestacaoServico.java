package application;

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
     * Construtor da PrestacaoServico
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
     * @return String codigo
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * 
     * @param codigo String
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Time inicio
     */
    public Time getInicio() {
        return this.inicio;
    }

    /**
     * @param inicio Time
     */
    public final void setInicio(Time inicio) {
        this.inicio = inicio;
    }

    /**
     * @return Time fim
     */
    public Time getFim() {
        return this.fim;
    }

    /**
     * @param fim Time
     */
    public final void setFim(Time fim) {
        this.fim = fim;
    }

    /**
     * @return Servico servico
     */
    public Servico getServico() {
        return servico;
    }

    /**
     * @param servico Servico
     */
    public final void setServico(Servico servico) {
        this.servico = servico;
    }

    /**
     * @return Prestador prestador
     */
    public Prestador getPrestador() {
        return prestador;
    }

    /**
     * @param prestador Prestador
     */
    public final void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    /**
     * @return Cliente cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente Cliente
     */
    public final void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
}