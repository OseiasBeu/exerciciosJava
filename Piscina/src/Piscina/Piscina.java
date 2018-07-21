package Piscina;
import java.util.Scanner;

/**
 * Crie um programa que recebe as três dimensões de uma piscina
 * (largura, comprimento, profundidade) e retorne a sua capacidade
 * em litros.
 * omo calcular o volume de sua piscina:
 *  1 - Piscina retangular: 
 *  Comprimento (metros) x Largura (metros) x Profundidade Média 
 *  (A profundidade média é calculada pela:
 *   somatória da altura do lado mais raso com a altura do lado mais fundo dividido por 2) 
 *    = valor em m³ (1 m³ = 1.000 litros).
 */


public class Piscina {

	public static void main(String[] args) {

		Scanner tela = new Scanner(System.in);
		double largura=0, profundidade =0, comprimento = 0;
		
		System.out.println("Digite a Largura da piscina: ");
		largura = tela.nextDouble();
		
		System.out.println("Digite a profundidade da piscina: ");
		profundidade = tela.nextDouble();
		
		System.out.println("Digite o comprimento da piscina: ");
		comprimento = tela.nextDouble();
		
		System.out.println("Essa piscina comporta: " + calculaLitros(largura,profundidade,comprimento) + "litros");
		
	}
	
	public static double calculaLitros(double largura, double profundidade, double comprimento) {
		
		double totalLitros = largura * profundidade * comprimento;
		return totalLitros;	
	}

}