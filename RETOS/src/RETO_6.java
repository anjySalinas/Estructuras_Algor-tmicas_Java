import java.util.Scanner;

public class RETO_6 {
     /* reto 3 con ciclos */

     public static void main(String[] args) {
    
        String nombre;
        int dineroapostar;
        int eleccion;
        int seguir=1;

     Scanner lectura = new Scanner(System.in);

     while(seguir==1){
        System.out.println("ingresa tu nombre:");
        nombre=lectura.nextLine();
        System.out.println("ingresa la cantidad de dinero que va a apostar:");
        dineroapostar=lectura.nextInt();

        if(dineroapostar>10000){
            System.out.println("ingresa 1. si deseas escoger cara y 2  si deseas escoger sello");
            eleccion=lectura.nextInt();
            if(eleccion==1)
            System.out.println(" la moneda cayo en sello, has perdido");
            else
            System.out.println("la moneda cayo el cara, has perdido ");
        }
        else{
            System.out.println("debe digitar un valor mayor a 10000");

        }
          System.out.println("ingresa 1. si desear jugar  nuevamente y 2 si no quieres jugar mas");
          seguir=lectura.nextInt();

          System.out.println(nombre+ "esperamos te hayas divertido");

          lectura.close();
    }
}
 }
