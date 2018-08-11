package FatorialDos10PirmeirosNumeros;
//Imprima  os fatoriasi de 1 até 10 
//O fatorial de n é: n*(n-1)*(n-2)

public class Main {
	public static void main(String[] args) {
		int guardaValor = 0;
		
		for(int i = 1; i<=10;i++) {
			guardaValor = i;
			int guardaOutro = i;
			for(int j = (guardaOutro-1); j > 0; j--) {
				System.out.println("O valor de j é:" + j);
				System.out.println("O valor de i é:" + guardaOutro);
				 guardaOutro = guardaOutro*j;
			}
			
			System.out.println("O fatorial de "+guardaValor+" é: "+ guardaOutro);
			System.out.println("|-------------------------|");
		}
	}
}
