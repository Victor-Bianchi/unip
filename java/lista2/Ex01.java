package lista2;

public class Ex01 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i=100;i<=500;i+=2) {
            soma += i;
        }

        System.out.println("O valor da soma é: " + soma);
    }
}