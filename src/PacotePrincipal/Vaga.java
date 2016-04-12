package PacotePrincipal;

public abstract class Vaga {
	private double preco = 0;
	private boolean ocupada;
	private Hora horaEntrada;
	private Veiculo veiculo;
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public Hora getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Hora horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public final Nota calculaNota(String horaSaida){
		Hora saida = new Hora(horaSaida);
		Nota nota = new Nota(this, saida);
		return nota;
	}
	
	public abstract String tipoVaga();
}
