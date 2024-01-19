import java.util.Scanner;

public class licao8 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("NUMERO DA VARIAVEL");
        int numero = Teclado.nextInt();
        for (int i=0;i<=numero;i++){

            System.out.print("*");
        }
        System.out.println("\nBEN VINDO AO COMEX");
        for (int i=0;i<=numero;i++){

            System.out.print("*");
        }
    }
}