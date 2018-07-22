package cacaNiquel;


public class Pontuador {
	private int[] sorteios = new int[7];
	private int[] contagem;
	
	public Resultado calcular() {
		Resultado resultado = new Resultado();
		String[] valores = Rolo.getValores();
		
		//Fazer os sorteios
		for(int i=0; i < sorteios.length; i++) {
			sorteios[i] = sortear(valores.length);
		}
		
		//Inicializar vetor de contagem
		contagem = new int[valores.length];
		for(int i=0; i < valores.length; i++) {
			contagem[i]=0;
		}
		
		//Contar valores sorteados
		for(int i=0; i < sorteios.length; i++) {
			int valorSorteado = sorteios[i];
			contagem[valorSorteado]++;
		}
		
		resultado.pontos = calcularPontuacao();
		resultado.valores = new String[sorteios.length];
		
		//Preencher resultados
		for(int i=0; i<sorteios.length;i++) {
			int posicaoSorteada = sorteios[i];
			String valor = valores[posicaoSorteada];
			resultado.valores[i] = valor;
		}

		return resultado;		
	}
	
	private int calcularPontuacao() {
		int maiorContagem = 0;
		int maiorValor = 0;
		
		for(int i =0; i < contagem.length; i++) {
			if(contagem[i] > maiorContagem) {
				maiorValor = i;
				maiorContagem = contagem[i];
			}			
		}
		if(maiorContagem >=3) {
			if(maiorValor == Rolo.getValorEspecial()) {
				return 5000;
			}
			return 1000;
		}
		
		if(maiorContagem ==2) {
			return 100;
		}
			
		return 0;
	}
	
	private int sortear(int maximo) {
		return (int) Math.floor(Math.random()* maximo);
	}

}
