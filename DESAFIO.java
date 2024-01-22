import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class DESAFIO {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        String name = null;
        String typeAccout = null;
        double openinBalence = 0 ;
        boolean exit = false;
        while (!exit){
            System.out.println("ENTER CUSTOMER NAME");
            name = Teclado.next();
            System.out.println("ENTER TYPEACCOUT NAME");
            typeAccout = Teclado.next();
            System.out.println("ENTER OPENINBALENCE NAME");
            String NumeroString = Teclado.next();
            Pattern regexName = Pattern.compile("(([A-Za-z])+([A-Za-z])+([A-Za-z])+)");
            Matcher matcherName = regexName.matcher(name);

            try {
                openinBalence = Double.parseDouble(NumeroString);
                if(openinBalence >=0&&matcherName.find()){
                    exit = true;

                }

            }catch (Exception ex){
                ex.printStackTrace();

            }


        }
        boolean exitClose = false;
        while (!exitClose){
            System.out.println("CHOOSE A NUMBER:\n 1 BALANCE INQUIRY\n 2 " +
                    "RECEIVE VALUE\n 3 TRANSFER VALUE\n 4 EXIT");
            String ValuesString = Teclado.next();

            try {
                int ValuesNumber = Integer.parseInt(ValuesString);
           if(ValuesNumber == 1){
               DESAFIO.CustomerData(name,typeAccout,openinBalence);


           }else if(ValuesNumber == 2){
               DESAFIO.CustomerData(name,typeAccout,openinBalence);

               System.out.println("AMOUNT TO BE DEPOSITED");
               String valeusString = Teclado.next();
               double RECEIVEVALUE;
               try {
                    RECEIVEVALUE = Double.parseDouble(valeusString);
                  if(RECEIVEVALUE>=0){

                      openinBalence +=RECEIVEVALUE;
                  }else {
                    System.err.println("INCOMPATIBLE VALUE");

                  }
               }catch (Exception ex){

                   ex.printStackTrace();
               }
               DESAFIO.CustomerData(name,typeAccout,openinBalence);

           }else if(ValuesNumber == 3){

               DESAFIO.CustomerData(name,typeAccout,openinBalence);


               System.out.println("VALUE TO BE TRANSFERRED");
               String valeusString = Teclado.next();
               double TRANSFERVALUE;
               try {
                    TRANSFERVALUE = Double.parseDouble(valeusString);

                   if(TRANSFERVALUE>openinBalence){

                       System.err.println(" INCOMPATIBLE VALUE");

                   }else{
                       openinBalence -=TRANSFERVALUE;
                   }

               }catch (Exception ex){

                   ex.printStackTrace();
               }
               DESAFIO.CustomerData(name,typeAccout,openinBalence);
           }else if(ValuesNumber == 4){

               DESAFIO.CustomerData(name,typeAccout,openinBalence);
               exitClose = true;



           }else{

                    System.err.println("NÃO COMPATIVEL");
                }

            }catch (Exception ex){
                ex.printStackTrace();

            }


        }


    }
    public static void CustomerData(String Name, String TypeAccout,double openinBalence){
        System.out.println("***************************************");
        System.out.println("CUSTOMER INITIAL DATA\n");

        System.out.println("NAME:            "+Name);
        System.out.println("TYPE ACCOUT:     "+ TypeAccout);
        System.out.println("OPENIN BALANCE:  "+openinBalence );


        System.out.println("***************************************");
    }
}
