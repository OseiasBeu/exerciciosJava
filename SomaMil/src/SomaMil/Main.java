package SomaMil;
/*Imprima a soma de 1 até 1000 PA: S = (a1+an) x n/2*/

public class Main {

	public static void main(String[] args) {
		int recebeValor = 1;
		
		for(int i=2;i<=1000;i++) {			
			recebeValor= i+ recebeValor;
		}
		System.out.println("soma dos mil primeiros números é:"+ recebeValor);

	}

}
