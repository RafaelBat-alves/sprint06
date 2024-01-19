import java.util.Calendar;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        boolean sair = false;
        String numeroDeCliente;
        int numero = 0;


        while (!sair){
            try {
            System.out.println("QUANTIDADE DE CLIENTE");
            numeroDeCliente = Teclado.next();
             numero = Integer.parseInt(numeroDeCliente);
            if(numero>=1){
                sair = true;

            }else{



            }
            }catch(Exception ex){
                ex.printStackTrace();

            }
        }










        String[] nomeCliente = new String[numero];
        int[] AnoDenascimento = new int[numero];
        for (int i =0;i<numero;i++) {
            System.out.println("NOME DO CLIENTE: "+ i);
             nomeCliente[i] =Teclado.next();
             boolean sairIdade = false;
             while (!sairIdade) {
                 try {
                     System.out.println("ANO DE NASCIMENTO DO CLIENTE: " + i);
                     String numeroNascimento =  Teclado.next();
                     int numeroValidar = Integer.parseInt(numeroNascimento);


                     if (numeroValidar> 999) {
                         AnoDenascimento[i] = numeroValidar ;
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
        System.out.println(">>>>Listagem dos Clientes");
        Calendar calendario = Calendar.getInstance();
        int data = calendario.get(Calendar.YEAR);
        for (int i =0;i<numero;i++) {

            System.out.println("_________________________________");
            System.out.println("Nome:" + nomeCliente[i]);
            System.out.println("Data de Nascimento:" + AnoDenascimento[i]);
            int Idade =data - AnoDenascimento[i];
            System.out.println("IDADE DO CLIENTE:" + Idade);
            if(Idade <= 17){
                System.out.println("CARACTERISTICA ETARIA ADOLECENTE");

            }else if(Idade <=29){
                System.out.println("CARACTERISTICA ETARIA JOVEM");


            }else if(Idade <59){
                System.out.println("CARACTERISTICA ETARIA ADULTO");

            }else{
                System.out.println("CARACTERISTICA ETARIA IDOSO");


            }

        }



    }

}
