package PacotePrincipal;

public class VagaVeiculoGrande extends Vaga{

	public VagaVeiculoGrande(){
		super();
		super.setPreco(8.0);
	}
	
	
	@Override
	public String tipoVaga(){
		return new String("VG");
	}
}
