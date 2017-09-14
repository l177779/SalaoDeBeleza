public class Cliente extends Pessoa {
	private String tipoCliente;

	public Cliente(Cliente cliente) {
		super(cliente);
		this.setTipoCliente(cliente.tipoCliente);
	}
	
	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	public boolean cadastrar(Cliente cliente){
		if (cliente != null){
			//insert DB
		}
		return true;
	}
	
	public boolean editar(Cliente cliente){
		if (cliente != null){
			//update DB
		}
		return true;
	}
	
	public Cliente consultar(String nome){
		if (nome != null){
			//select DB
			Cliente cliente;
			Cliente cli = new Cliente(cliente);
		}
		return cli;
	}
}
