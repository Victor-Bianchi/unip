package lista2;

public class Ex06 {
    public static void main(String[] args) {
        int contagem = 10;

        while(true) {
            if(contagem == 1) {
                System.out.println(contagem);
                System.out.println("Fogo!");
                break;
            } else {
                System.out.println(contagem);
                contagem--;
            }
        }
    }
}
