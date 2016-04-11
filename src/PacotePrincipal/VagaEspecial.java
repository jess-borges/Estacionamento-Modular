package PacotePrincipal;

public class VagaEspecial extends Vaga{
	public VagaEspecial(){
		super();
		super.setPreco(6.0);
		/*Fazer isso em todas as subclasses, com os valores da especificacao*/
	}
	
	@Override
	public Nota calculaNota(String horaSaida){
		Hora saida = new Hora(horaSaida);
		Nota nota = new Nota(this, saida);
		return nota;
	}
	
	@Override
	public String toString(){
		return new String("NE");
		/*Fazer isso em todas as subclasses*/
	}
}