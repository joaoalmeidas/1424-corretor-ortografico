import java.util.Scanner;

public class CorretorOrtografico {

	public static void main(String[] args) {
		
		String palavra;
		String[] palavrasCorretas = {"default", "carro", "computador", "impressora", "monitor", "teclado", "impressora", "jogador", "futebol"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva um palavra:");
		palavra = input.nextLine();
		
		if(verificaOrtografia(palavra, palavrasCorretas) == true) {
			
			System.out.println("A palavra foi escrita corretamente.");
			
		}else {
			
			System.out.println("A palavra não foi escrita corretamente.");
			System.out.printf("Você quis dizer %s?", procuraPalavraCorreta(palavra, palavrasCorretas));
			
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
	
	public static String procuraPalavraCorreta(String palavra, String[] palavrasCorretas) {
		
		for(int i = 0; i < palavrasCorretas.length; i++) {
			
			for(int j = 0; j < palavrasCorretas[i].length() - 1; j++) {
				
				if(trocaPosicaoLetra(j, j+1, palavrasCorretas[i]).equals(palavra)){
					
					return palavrasCorretas[i];
					
				}
				
			}
			
		}
		
		return "";
		
	}
	

	public static String trocaPosicaoLetra(int i, int j, String palavra) {
		
		char primeira = palavra.charAt(i);
		char segunda = palavra.charAt(j);
		return palavra.substring(0, i) + segunda + primeira + palavra.substring(j+1, palavra.length());
		
	}
}
