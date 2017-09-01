import java.util.Date;

public class Agenda {
	private long codAgenda;
	private Date dataHora;
	private Boolean ocupado;
	
	public long getCodAgenda() {
		return codAgenda;
	}
	public void setCodAgenda(long codAgenda) {
		this.codAgenda = codAgenda;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public Boolean getOcupado() {
		return ocupado;
	}
	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
}
