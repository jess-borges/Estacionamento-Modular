package PacotePrincipal;

public class Hora {
	private int horas;
	private int minutos;
	
	public Hora(){
		this.horas = 0;
		this.minutos = 0;
	}
	
	@Override
	public String toString(){		
		String string = Integer.toString(this.horas) + ":" + Integer.toString(this.minutos);
		/* testar se dá certo */
	}
	
	public getIntervaloMinutos(Hora hora){
		int horas, minutos;
		minutos = this.minutos - hora.minutos;
		horas = this.horas - hora.horas;
		minutos = minutos + 60*horas;
		return minutos;
	}
}
