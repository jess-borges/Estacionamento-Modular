package PacotePrincipal;

public class VagaEspecial extends Vaga{
	public VagaEspecial(){
		super();
		super.setPreco(6.0);
		/*Fazer isso em todas as subclasses, com os valores da especificacao*/
	}
	
	
	@Override
	public String tipoVaga(){
		return new String("NE");
		/*Fazer isso em todas as subclasses*/
	}
}