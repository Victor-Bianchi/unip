package lista2;

import java.util.Random;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = rand.nextInt(101) + 1;
        int chute = 0;
        boolean deducao = false;

        System.out.println("********** BEM-VINDO AO GAME **********");

        do {
            System.out.print("Tente adivinhar o número que pensei: ");
            chute = sc.nextInt();

            if(chute == numeroAleatorio) {
                System.out.println("\n\nMeus parabéns! Estou impressionado, você venceu!");
                System.out.println("Número que pensei: "+numeroAleatorio+"\nNúmero chutado: "+chute);
                deducao = true;
            } else {
                System.out.println("\nSinto muito, mas você errou... Porque não tenta novamente?");
                System.out.println(chute > numeroAleatorio ? "O número que você chutou é maior do que eu pensei." : "O número que você chutou é menor do que eu pensei.\n");
            }
        } while(!deducao);
        sc.close();
    }
}
