package libs;

import java.util.Date;
import java.util.List;

public class Servico {
	private long codServico;
	private String descricao;
	private Date dataCriacao;
	private int duracao;
	//private List<Prestador> prestadores;
	
	public long getCodServico() {
		return codServico;
	}
	public void setCodServico(long codServico) {
		this.codServico = codServico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	/*public List<Prestador> getPrestadores() {
		return prestadores;
	}
	public void setPrestadores(List<Prestador> prestadores) {
		this.prestadores = prestadores;
	}*/
}
