package Armaduras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		String cor;
		int armas;
		
		Scanner lerDaTela = new Scanner(System.in);
		
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|Digite o nome que deseja dar a sua armadura:");
		nome = lerDaTela.next();
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|Digite a cor que deseja dar a sua armadura:");
		cor = lerDaTela.next();
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|Digite a quantidade de armas que deseja dar a sua armadura:");
		armas = lerDaTela.nextInt();
		
		CriarArmadura novaArmadura = new CriarArmadura();
		
		novaArmadura.criarArmadura(nome, cor, armas);
		
		
	}



}
