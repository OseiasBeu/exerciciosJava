package Armaduras;

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
	}
	
	
	
}
