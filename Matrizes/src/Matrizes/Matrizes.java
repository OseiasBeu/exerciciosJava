package Matrizes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Matrizes {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	//Matriz Unidimenssional
		/*int[] v = new int[10];
		int num = 10;
		for(int i=0;  i <10; i++) {
			v[i]= num;
			num+=10;			
		}
		
		for(int j=0;j<10; j++) {
			System.out.println(v[j]);
		}
		*/
	//Matriz Bidimenssional
		/*int[][] bi = new int[10][10];
		int num2 = 1;
		
		for(int i=0;  i <10; i++) {
			for(int j = 0; j<10; j++) {
				bi[i][j]= num2;
				num2+=1;
			}
						
		}
		
		for(int j=0;j<10; j++) {
			for(int i=0; i <10; i++) {
				System.out.println(bi[j][i]);
			}
		}
		
		*/
	
		
	//ArrayList
		//ArrayList< Objeto > nomeDoArrayList = new ArrayList< Objeto >();
		//nomeDoArrayList.add(Item a ser adicionado);
		//Arrays.toString( bandas.toArray() );
		//bandas.get(0); 
		//bandas.add( bandas.indexOf("Naruto"), "Hajime no Ippo");
		
		
		/*ArrayList<String> animes = new ArrayList<String>();
		animes.add("Dragon Ball");
		animes.add("Naruto");
		animes.add("Full Metal");
		
		Arrays.toString(animes.toArray());
		System.out.println(animes);
		System.out.println(animes.get(2));
		System.out.println(animes.indexOf("Naruto"));
		animes.add(animes.indexOf("Naruto"), "Hajime no ippo");
		System.out.println(animes);
		System.out.println(animes.indexOf("Naruto"));
		System.out.println(animes.size());
		
		*/	
	
	//HashMap
		Map<String, String> map = new HashMap<>();
		map.put("primeito", "Pedra");
		map.put("Segundo", "Papal");
		map.put("Terceiro", "tesoura");
		
		for(String Key: map.values()) {
			System.out.println(Key);
		}
		
		Map<Integer, String> maps = new HashMap<>();
		maps.put(1, "Pedra");
		maps.put(2, "Papal");
		maps.put(3, "tesoura");
		
		for(String Key: maps.values()) {
			System.out.println(Key);
		}
		
		for(Integer Key: maps.keySet()) {
			System.out.println(Key);
		}
		 
		 

	
	//Integer
		Integer a =2;
		System.out.println(a);
		
		
	//Enum
		System.out.println(Cartas.A.valorCarta);
		System.out.println(Cartas.J.valorCarta);
		System.out.println(Cartas.A.equals(Cartas.J.valorCarta));
		

		

	}

}
