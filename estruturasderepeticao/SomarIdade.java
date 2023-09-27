import java.util.Scanner;

public class SomarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SomarIdades = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            SomarIdades += idade;
        }

        System.out.println("A soma das idades é: " + SomarIdades);
        scanner.close();
    }
}
