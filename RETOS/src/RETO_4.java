import java.util.Scanner;

public class RETO_4 {

    /*Retome los conceptos de acumulador y contador que ya conoce de otros lenguajes y mediante las estructuras cíclicas vistas, aplique aljuego del carisellazo:

❑ Posibilidad para apostar una cantidad de dinero específica (ingresada por el usuario)
❑ Poder repetir el juego las veces que desee.
❑ Cada vez que gane debe incrementar y acumular el valor ganado.
❑ Cada vez que pierda debe restar al valor acumulado
❑ Al final del juego debe decirle la cantidad de veces que jugó y el dinero que acumuló. Implemente una estructura cíclica que permita retomar el programa completo a un usuario, si este lo desea. */

    public static void main (String[]args) {
        Scanner lectura= new Scanner (System.in);
        int dinero, respuesta=1, apuesta; 
        String ganador="";

        System.out.println("digite el dinero con el que va a apostar");
        dinero= lectura.nextInt();

        while (respuesta==1) {
            

            System.out.println("Digite el valor que va a apostar");
            apuesta=lectura.nextInt();
            if (dinero>apuesta) {
                System.out.println("Digite quien es el ganador");
                ganador=lectura.next();
            } else{
                System.out.println("No le alcanza para apostar");

            } if (ganador.equals("Jugador")) {
                dinero=apuesta+dinero;
            } else if (ganador.equals("Maquina")) {
                dinero=apuesta-dinero;
            } 
            System.out.println("Quieres seguir jugando? 1 si, 2 no");
            respuesta=lectura.nextInt();
            
 }
 lectura.close();
}  }