import java.util.Scanner;

public class RETO_5 {

    /*Programa para comprar n cantidad de productos en una tienda Solicitar el precio Mostrar en pantalla El total de la compra Ejm: comprar 5 productos
• 1. 1000
• 2. 5000
• 3. 3000
• 4. 3500
• 5. 2400
• Total de la compra es=14900,dijitar la cantidad con la que se va a pagar y las vueltas*/
   
    public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);
            int precios, dinero, p, total=0;
            

            System.out.println("cuantos productos desea comprar?");
                p=lectura.nextInt();
                for(int i=0;i<p;i++){
                    System.out.println("Digite precio del producto " +i+ ":");
                    precios=lectura.nextInt();
                    total=total+precios;
                    total++;
                    
                    }
                    System.out.println("con cuanto va a pagar?");
                    dinero=lectura.nextInt();
                    if (dinero<total) {
                    System.out.println("No le alcanza para comprar ");
                   }  else {
                int vueltas=dinero-total;
                System.out.println("Sus vueltas son:"+vueltas);
            
     lectura.close();
            }
         }
          }