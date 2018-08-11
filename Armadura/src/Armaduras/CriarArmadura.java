package Armaduras;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class CriarArmadura {
	
	Armadura armadura = new Armadura();
	
	public void criarArmadura(String nome, String cor, int quantidadeArmas) {
	
		armadura.setNome(nome);		
		armadura.setCor(cor);
		armadura.setQuantidadeArmas(quantidadeArmas);
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|--------------------Dados da armadura----------------------|");
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|Nome: "+ armadura.getNome());
		System.out.println("|Cor: "+  armadura.getCor());
		System.out.println("|Quantidade de Armas: "+ armadura.getQuantidadeArmas());
		System.out.println("|-----------------------------------------------------------|"); 
		System.out.println("|Armadura criada com sucesso!");
		System.out.println("|-----------------------------------------------------------|");
		
		//Path caminho = Paths.get(url);
		//Files.readAllBytes(caminho);
		//String leitura = new String (texto);
		//JOptionPane.showMessageDialog(null,leitura);
		
		Path caminho = Paths.get("/home/OseiasBeu/Documents/exerciciosJava/Armadura/armaduras.txt");
		try {
		byte[] texto = Files.readAllBytes(caminho);
		String leitura = new String(texto);
		JOptionPane.showMessageDialog(null,leitura);
		}catch(IOException erro){
			erro.printStackTrace();
		}
		
		Path trajeto = Paths.get("/home/OseiasBeu/Documents/exerciciosJava/Armadura/armaduras.txt");
		
			String meuTexto = armadura.setNome(nome);
			String meusegund = armadura.setCor(cor);
			//int meuTerceiro = armadura.setQuantidadeArmas(quantidadeArmas);
			
			//byte[] textoEmBytes =  meuTexto.getBytes();
			
		try {
			Files.write(trajeto, meuTexto.getBytes());
			Files.write(trajeto, meusegund.getBytes());
			
		}catch(IOException erro) {
			erro.printStackTrace();
		}
		
		String[] partes = meuTexto.split(" ");
		String[] partes2 = meusegund.split(" ");
		
		
		System.out.println(partes[0]);
		}


		
	}
	
			
