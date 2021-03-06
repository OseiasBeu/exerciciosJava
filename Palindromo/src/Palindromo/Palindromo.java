package Palindromo;
import java.util.Scanner;

/**
 * Crie um programa que recebe uma palavra do terminal e determina se ela é um
 * palíndromo.
 * 
 * Exs:
 * 
 * input: ovo output: A palavra ovo é um palíndromo
 * 
 * input: jose output: A palavra jose não é um palíndromo
 * 
 * @return
 */

public class Palindromo {

	public static void main(String[] args) {
		System.out.println("Digite uma palavra: ");
		Scanner lerDaTela = new Scanner(System.in);
		String texto = lerDaTela.next();
		int contador = 0;

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			char d = texto.charAt(texto.length() - 1 - i);		
			if(c != d){
		        contador++;
		      }
		}
		if(contador < 2) {
		 System.out.println("A palavra "+ texto +" é um palindromo!");
		}else {
			System.out.println("A palavra "+ texto +" não é um palindromo!");
		}
		System.out.println("|---------FIM---------|");
	}

}
