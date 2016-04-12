package PacotePrincipal;

public class VagaMoto extends Vaga{

	public VagaMoto(){
		super();
		super.setPreco(3.5);
	}
	
	@Override
	public String tipoVaga(){
		return new String("MT");
	}
}
