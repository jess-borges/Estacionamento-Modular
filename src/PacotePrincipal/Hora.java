package PacotePrincipal;

public class Hora {
	private int horas;
	private int minutos;
	
	public Hora(){
		this(0, 0);
	}
	
	public Hora(int horas, int minutos){
		this.horas = horas;
		this.minutos = minutos;
	}
	
	public Hora(String str){
		String[] vet;
		try{
			vet = str.split(":");
			setHora(Integer.parseInt(vet[0]));
			setMinutos(Integer.parseInt(vet[1]));
		}catch(IndexOutOfBoundsException e){
			System.out.println("Erro de formatacao na entrada");
			setHora(0);
			setMinutos(0);
		}
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public static int getIntervaloMinutos(Hora entrada, Hora saida){
		int intervalo;
		intervalo = (saida.horas*60 + saida.minutos )- (entrada.horas*60 + entrada.minutos);		
		return intervalo;
	}
	
	public void setHora (int intervaloMinutos){
		this.setMinutos(intervaloMinutos % 60);
		intervaloMinutos = intervaloMinutos - this.getMinutos();
		this.setHoras(intervaloMinutos/60);
	}
	
	@Override
	public String toString(){
		String string = Integer.toString(this.horas) + ":" + Integer.toString(this.minutos);
		/* testar se dá certo */
		return string;
	}
}
