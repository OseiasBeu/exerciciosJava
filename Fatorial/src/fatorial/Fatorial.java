package fatorial;

import java.util.Scanner;

public class Fatorial {
	public float subtraiUm(float num) {
		return num -= 1;
	}
	
	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		for(int i = (numero - 1); i > 0; i--) {
			numero = numero * i;
			
			System.out.println(numero);
			//System.out.println(i);
		}
		
	}
}
