package libs;

import java.util.Date;

public class Agendamento {
	private long codAgendamento;
	private Date dataHora;
	private Agenda agenda;
	private Cliente cliente;
	private Prestador prestador;
	private Servico servico;
	private Boolean confirmado;
	
	public long getCodAgendamento() {
		return codAgendamento;
	}
	public void setCodAgendamento(long codAgendamento) {
		this.codAgendamento = codAgendamento;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public Agenda getAgenda() {
		return agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Prestador getPrestador() {
		return prestador;
	}
	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Boolean getConfirmado() {
		return confirmado;
	}
	public void setConfirmado(Boolean confirmado) {
		this.confirmado = confirmado;
	}
}
