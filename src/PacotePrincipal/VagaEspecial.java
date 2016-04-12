package PacotePrincipal;

public class VagaEspecial extends Vaga{
	public VagaEspecial(){
		super();
		super.setPreco(6.0);
	}
	
	
	@Override
	public String tipoVaga(){
		return new String("NE");
	}
}