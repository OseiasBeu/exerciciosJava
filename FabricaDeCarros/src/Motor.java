
public class Motor {
	private int potencia;
	private String tipo;
	
	public int getPotencia() {
		return potencia;
	}
	public int setPotencia(int cavalos) {
		return potencia += cavalos;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String setTipo(String marca) {
		return tipo += marca;
	}
}
