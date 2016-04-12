package PacotePrincipal;

public class VagaVeiculoPequeno extends Vaga{
	public VagaVeiculoPequeno(){
		super(); 
		super.setPreco(6.0);
	}
	
	@Override
	public String tipoVaga(){
		return new String("VP");
	}
}
