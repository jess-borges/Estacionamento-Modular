package PacotePrincipal;

public class Nota {
	private Hora intervalo;
	private double preco;
	private String tipoVaga;
	
	public Nota(){
		this.intervalo = new Hora();
		this.preco = 0.0;
		this.tipoVaga = new String("");
	}
	
	public Nota(Vaga vaga, Hora saida){
		int intervaloMin;
		double tarifa;
		
		this.tipoVaga = vaga.toString();
		intervaloMin = Hora.getIntervaloMinutos(vaga.getHoraEntrada(), saida);
		tarifa = vaga.getPreco()/60;
		this.preco = tarifa*((double)intervaloMin);
		this.intervalo.setHora(intervaloMin);
	}
	
	@Override
	public String toString(){
		String str = new String("");
		str.concat(tipoVaga);
		str.concat(";");
		str.concat(this.intervalo.toString());
		str.concat(";");
		str.concat(String.format("%.2f", preco));
		return str;
	}
}
