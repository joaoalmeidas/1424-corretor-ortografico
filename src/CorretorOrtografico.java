import java.util.Scanner;

public class CorretorOrtografico {

	public static void main(String[] args) {
		
		String palavra;
		String[] palavrasCorretas = {"carro", "computador", "impressora", "monitor", "teclado", "impressora", "jogador", "futebol"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva um palavra:");
		palavra = input.nextLine();
		
		if(verificaOrtografia(palavra, palavrasCorretas) == true) {
			
			System.out.println("A palavra foi escrita corretamente.");
			
		}else {
			
			System.out.println("A palavra não foi escrita corretamente.");
			
		}

	}
	
	public static boolean verificaOrtografia(String palavra, String[] palavrasCorretas) {
		
		for(int i = 0; i < palavrasCorretas.length; i++) {
			
			if(palavra.equals(palavrasCorretas[i])) {
				
				return true;
				
			}
			
		}
		
		return false;
			
	}

}
