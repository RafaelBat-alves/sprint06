import java.util.Calendar;
import java.util.Scanner;

public class PRODUTOS {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        boolean sair = false;
        String numeroDeprodutos;
        int numero = 0;


        while (!sair){
            try {
                System.out.println("QUANTIDADE DE PRODUTOS");
                numeroDeprodutos = Teclado.next();
                numero = Integer.parseInt(numeroDeprodutos);
                if(numero>=1){
                    sair = true;

                }else{



                }
            }catch(Exception ex){
                ex.printStackTrace();

            }
        }


        String[] nomedoproduto = new String[numero];
        double[] precodoproduto = new double[numero];
        for (int i =0;i<numero;i++) {
            System.out.println("NOME DO PRODUTO: "+ i);
            nomedoproduto[i] =Teclado.next();
            boolean sairIdade = false;
            while (!sairIdade) {
                try {
                    System.out.println("PREÇO DO PRODUTO: " + i);
                    String numerodoproduto =  Teclado.next();
                    double numeroValidar = Double.parseDouble(numerodoproduto);


                    if (numeroValidar> 0) {
                        precodoproduto[i] = numeroValidar ;
                        sairIdade = true;
                    } else {
                        System.err.println("DIGITOU NUMERO INVALIDO");

                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                    System.err.println("DIGITOU NUMERO INVALIDO");
                }
            }

        }

        System.out.println(">>>>Listagem dos Produto");
        Calendar calendario = Calendar.getInstance();
        int data = calendario.get(Calendar.YEAR);
        for (int i =0;i<numero;i++) {

            System.out.println("_________________________________");
            System.out.println("Nome: " + nomedoproduto[i]);
            System.out.println("Data de Preco: " + precodoproduto[i]);
        }

    }
}
