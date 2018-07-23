
public class TestaCarro {

	public static void main(String[] args) {
		Carro Mustang = new Carro();
		Mustang.cor = "Preto";
		Mustang.modelo = "Mustang";
		Mustang.velocidadeAtual = 0;
		Mustang.velocidadeMaxima = 100;
		
		//Criar Motor
		Motor v = new Motor();
		v.setPotencia(45);
		v.setTipo("v");
		
		//Ligar carro
		Mustang.ligaCarro();
		
		//Acelera o carr
		Mustang.acelera(95.5);
		
		System.out.println(Mustang.velocidadeAtual);
		System.out.println(v.getPotencia() + " Cavalos de potência");
		System.out.println(v.getTipo());

	}

}
