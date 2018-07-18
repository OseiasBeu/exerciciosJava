
/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo: 
 * 
 * Ás de Ouros
 * Ás de Espadas
 * Ás de Copas
 * Ás de Paus
 * Dois de Ouros
 * ...
 * 
 */

public class Deck {

	public static void main(String[] args) {
		String[] nipes = {"copas", "espadas", "paus", "ouros"};
		String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for(int i = 0; i < valores.length; i++) {
			for(int j = 0; j < nipes.length; j++) {
				System.out.println(valores[i] + " de " + nipes[j]);
			}
		}
	}

}
