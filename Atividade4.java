import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

    int populacaoA = 80000;
    double nascimentoA = 0.03;
    int populacaoB =200000;
    double nascimentoB = 0.016;
    int anos =  0;

     while (populacaoA <= populacaoB) {
       populacaoA+= populacaoA * nascimentoA;
        populacaoB+= populacaoB * nascimentoB;
         anos++;
        }
        System.out.println("Em "+anos+" a população do país A alcançará a poulação do B");
        inicialScanner.close();
    }
    
}