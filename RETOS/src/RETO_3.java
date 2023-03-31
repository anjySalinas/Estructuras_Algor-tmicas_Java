import java.util.Scanner;

public class RETO_3 {
  
    /*Investigue como se pueden generar números aleatorios en java random Se pretende construir un programa que simule el juego del carisellazo, teniendo en cuenta lo siguiente:

    ❑Se debe simular el lanzamiento de una moneda
    ❑El jugador puede elegir Cara o Sello antes que caiga la moneda
    ❑El juego debe decirle si gana o pierde, gana cuando la moneda coincide con la elección del jugador. */

    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in); 
          int OpeUsu;
  
          System.out.println("Juego piedra, papel o tijera");
          
          int OpeCom = (int)(Math.random() * 3) + 1;
          System.out.println("La computadora ya escogio...");
   
          System.out.println("Indique su jugada \n1.Piedra \n2.Papel \n3.Tijera");
          OpeUsu = lectura.nextInt();
   
          System.out.print("La computadora habia escogido: ");
          switch ( OpeCom )
          {
              case 1:
                  System.out.println("Piedra");
                  switch ( OpeUsu )
                  {
                     case 1: System.out.println("Empatan"); 
                     break;
                     case 2: System.out.println("Ganador"); 
                     break;
                     case 3: System.out.println("el sistema es el ganador");
                      break;
                  }
                  break;
   
              case 2:
              System.out.println("Papel");
              switch ( OpeUsu )
              {
                 case 1: System.out.println("el sistema es es el ganador"); 
                 break;
                 case 2: System.out.println("Empatan"); 
                 break;
                 case 3: System.out.println("Ganador"); 
                 break;
              }
              break;

          case 3:
              System.out.println("Tijera");
              switch ( OpeUsu )
              {
                 case 1: System.out.println("Ganador"); 
                 break;
                 case 2: System.out.println("el sistema es el 33 ganador"); 
                 break;
                 case 3: System.out.println("Empatan"); 
                 break;
              }
              break;
             
} 
           lectura.close();
    }
}