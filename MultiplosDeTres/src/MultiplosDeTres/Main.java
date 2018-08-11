package MultiplosDeTres;
/*Imprimir Multiplos de 3 entre 1 e 100*/
public class Main {

	public static void main(String[] args) {
	
		int i = 3;
	
	for(int j=1; j<=100; j++) {
			if(j%i ==0) {
				System.out.println(j + " É multilpo de 3");
			}
	}

	}

}
