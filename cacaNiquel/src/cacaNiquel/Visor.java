package cacaNiquel;

public class Visor {
	public static void processar(Resultado resultado) {
		
		System.out.println("Sua pontuação foi: " + resultado.pontos);
		System.out.println("\n");
		System.out.println("Os resultados sorteados foram:");
		for(String valor : resultado.valores) {
			System.out.println(valor);
		}
	}
}
