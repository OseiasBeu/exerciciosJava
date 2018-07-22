package cacaNiquel;

public class Jogo {

	public static void main(String[] args) {
		Pontuador pontuador = new Pontuador();
		
		Resultado resultado = pontuador.calcular();
		
		Visor.processar(resultado);

		
	}

}	
