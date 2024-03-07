package lista2;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int numeroTabuada = 0;
        int tabuadaCalculada = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Digite um número para exibir a tabuada ou saia com um número negativo: ");
            numeroTabuada = sc.nextInt();

            if(numeroTabuada >= 0) {
                for(int i=0;i<=10;i++) {
                    tabuadaCalculada = numeroTabuada * i;
                    System.out.println(numeroTabuada+" x "+i+" = "+tabuadaCalculada);
                }
            } else {
                System.out.println("See you! :D");
                break;
            }
        }
        sc.close();
    }
}
