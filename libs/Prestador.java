package libs;

import java.util.List;

public class Prestador extends Pessoa {
    private long codPrestador;
    private Boolean ativo;
    private List<Agenda> agenda;

    public Prestador(Pessoa pessoa) {
        super(pessoa);
        this.setAtivo(true);
        this.setCodPrestador(12);
    }

    public long getCodPrestador() {
        return codPrestador;
    }
    public void setCodPrestador(long codPrestador) {
            this.codPrestador = codPrestador;
    }
    public Boolean getAtivo() {
            return ativo;
    }
    public void setAtivo(Boolean ativo) {
            this.ativo = ativo;
    }
    public List<Agenda> getAgenda() {
            return agenda;
    }
    public void setAgenda(List<Agenda> agenda) {
            this.agenda = agenda;
    }
}
