import java.util.Scanner;

public class Atividade10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int num2 = scanner.nextInt(); 
        
    if (num1 < num2) {
    for (int sequencia = num1; sequencia <= num2; sequencia++) {
    System.out.print(sequencia + " ");
     }
    } else {
    for (int sequencia = num1; sequencia >= num2; sequencia--) {
    System.out.print(sequencia + " ");
        }
    }

        scanner.close();
    }
}