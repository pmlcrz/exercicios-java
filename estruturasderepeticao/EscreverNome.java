import java.util.Scanner;

public class EscreverNome {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o seu nome: ");
	        String nome = scanner.nextLine();

	        for (int i = 0; i < 10; i++) {
	            System.out.println(nome);
	        }

	        scanner.close();
	    }
	}

