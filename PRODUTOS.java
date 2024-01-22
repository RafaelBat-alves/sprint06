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
       double Totalapagar = 0 ;
        for (int i =0;i<numero;i++) {

            System.out.println("_________________________________");
            System.out.println("Nome: " + nomedoproduto[i]);
            System.out.println("Data de Preco: " + precodoproduto[i]);
            Totalapagar +=precodoproduto[i];
        }
            
             boolean sairDaFormaPagamento = false;
             double faltaPagar =0;
             while(!sairDaFormaPagamento){
                 try{
             System.out.println("FALTA A PAGAR: "+Totalapagar);
             System.out.println("FORMA DE PAGAMENTO \n 1 DINHEIRO \n 2 CARTÃO \n 3 PIX \n 4 SAIR");
             String formaDePagamento = Teclado.next();
             int numerovaliado = Integer.parseInt(formaDePagamento);
             if(numerovaliado >=1 || numerovaliado <=4 ){
                 
             if(numerovaliado==1){
                 System.out.println("DINHEIRO");
                 System.out.println("QUANTIDADE DE DINHEIRO DADO?");
                 double dinheiro = Teclado.nextDouble();
                 faltaPagar =Totalapagar - dinheiro ;
                 if(faltaPagar<=0){
                     System.out.println("SEU TROCO SERA: "+faltaPagar);
                     Totalapagar = faltaPagar;
                    sairDaFormaPagamento = true;
                 }else{
                    System.out.println("FALTA PAGAR "+faltaPagar);
                    Totalapagar = faltaPagar;
                 }

              
             }else if( numerovaliado ==2){
                 System.out.println("CARTÃO");
                 System.out.println("INSIRA O CARTÃO");
                 System.out.println("DIGITA A SENHA DO CARTÃO");
                 String senha = Teclado.next();
                 //lembra de usar enum para coisa do tipo
                 //String Regex = "([0-9])+\\.([0-9])+\\.([0-9])+-([0-9])+"; CPF

                 String Regex = "(([0-9])+([0-9])+([0-9])+([0-9])+)";
                 Pattern patt= Pattern.compile(Regex);
                 Matcher match = patt.matcher(senha);
                 if(match.find()){
                   System.out.println("COMPRA APROVADA VOLTE SEMPRE");
                   sairDaFormaPagamento = true;
                 }else{
                 System.out.println("SENHA INVALIDA");
                 }

                 

               
             }else if(numerovaliado == 3) {
                 System.out.println("PIX");
                 System.out.println("GERANDO QR CODE");
               
                     throw new NumberFormatException("ERRO NA HORA DE GERA QR CODE TENTE MAIS TARDE OUTRA FORMA DE PAGAMETO");
              

             }else if(numerovaliado == 4){
                              sairDaFormaPagamento = true;}
             
             }else{
                 System.err.println("FORMA INCOMPATIVEL");
             }
                 }catch(NumberFormatException  ex){
                 ex.printStackTrace();
                 System.out.println("ERRO NO PAGAMENTO ");

                 }
             
             }
             

    }
}
