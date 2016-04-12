package PacotePrincipal;

public class Veiculo {
	private int tipo;
	private String placa;
	
	public Veiculo (String placa, String tipo){
		this.placa = new String(placa);
		if (tipo.compareTo("VP") == 0){
			this.tipo = 1;
		}
		if (tipo.compareTo("MT") == 0){
			this.tipo = 2;
		}
		if (tipo.compareTo("VG") == 0){
			this.tipo = 3;
		}
		if (tipo.compareTo("NE") == 0){
			this.tipo = 4;
		}
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
