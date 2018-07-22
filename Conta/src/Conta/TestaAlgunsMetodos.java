package Conta;

public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		
		//Criando a conta
		Conta minhaConta = new Conta();
		/*
		//Alterando os valores de minhaConta
		minhaConta.titular = "Batman";
		minhaConta.saldo = 1000;
		
		//Saca dinheiro
		minhaConta.saca(200);
		
		//Deposita dinheiro
		minhaConta.deposita(500);
		System.out.println(minhaConta.saldo);
		*/
		
		minhaConta.saldo = 1000;
		boolean consegui = minhaConta.saca(1000);
		if(consegui) {
			System.out.println("Consegui sacar!");
		}
		else {
			System.out.println("Não consegui sacar!");
		}
		
		System.out.println("Saldo atual:" + minhaConta.saldo);
		
	}

}
