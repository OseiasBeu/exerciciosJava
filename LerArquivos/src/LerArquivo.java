import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class LerArquivo {

	public static void main(String[] args) {
		//Path caminho = Paths.get(url);
		//Files.readAllBytes(caminho);
		//String leitura = new String (texto);
		//JOptionPane.showMessageDialog(null,leitura);
		
		Path caminho = Paths.get("/home/OseiasBeu/Documents/exerciciosJava/LerArquivos/arquivo.txt");
		try {
		byte[] texto = Files.readAllBytes(caminho);
		String leitura = new String(texto);
		JOptionPane.showMessageDialog(null,leitura);
		}catch(IOException erro){
			erro.printStackTrace();
			
		}
		
		Path trajeto = Paths.get("/home/OseiasBeu/Documents/exerciciosJava/LerArquivos/arquivo.txt");
		
			String meuTexto = "Esforço Máximo! _!_";
			//byte[] textoEmBytes =  meuTexto.getBytes();
			
		try {
			Files.write(trajeto, meuTexto.getBytes());		
		}catch(IOException erro) {
			erro.printStackTrace();
		}
		
		String[] partes = meuTexto.split(" ");
		
		System.out.println(partes[0]);

		
		
		}

}
