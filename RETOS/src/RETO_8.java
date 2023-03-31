import java.util.Random;
import java.util.Scanner;

public class RETO_8 {

    //Se debe crear un programa donde el sistema elija un numero al azar del 1 al 100 y el usuario debera adivinarlo en 10 intentos como maximo, si logra adivinarlo decirle en cuantos intentos lo adivino o en tal caso que no decirle cual era el numero
 
        public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);
    
            Random random = new Random();
            int numeroAdiv = random.nextInt(100) + 1;
            boolean acierto = false;
            int intentos = 0;
            System.out.println("TIENES 10 INTENTOS PARA ADIVINAR EL NUMERO DEL 1 AL 100.");
            
            while (!acierto && intentos < 10) {
                System.out.print("INTRODUCE TU NUMERO: ");
                int numeroUsu = lectura.nextInt();
                intentos++;
    
                if (numeroUsu == numeroAdiv) {
                    acierto = true;
                    System.out.println("ADIVINASTE EL NUMERO CON " + intentos + " intentos.");
                } else if (numeroUsu < numeroAdiv) {
                    System.out.println("EL NUMERO A ADIVINAR ES MAYOR " + numeroUsu);
                } else {
                    System.out.println("EL NUMERO A ADIVINAR ES MENOR " + numeroUsu);
                }
            }
    
            if (!acierto) {
                System.out.println("NO LOGRASTE ADIVINAR . EL NUMERO ERA " + numeroAdiv);

                lectura.close();
            }
     }
      }
