import java.util.Scanner;

public class RETO_7 {

    // JUEGO PIEDRA, PAPEL Y TIJERA CON CICLOS

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        String[] opciones = {"piedra", "papel", "tijera"};
        int empates = 0, ganadas = 0, perdidas = 0;
        String nombre;
        int valorapuesta;

        System.out.print("Ingrese su nombre:");
        nombre=captura.nextLine();
         
        System.out.print("cuanto quieres apostar: ");
        valorapuesta=captura.nextInt();

        if (valorapuesta < 10000) {
            System.out.println("Su apuesta tiene que ser mayor a 10.000");
        }

        System.out.print("Cuántas rondas quieres jugar: ");
        int numRondas = captura.nextInt();

        
        for (int i = 0; i < numRondas; i++) {
            System.out.println("Ronda " + (i + 1));
            System.out.print(nombre+ "Elige tu opción (piedra, papel o tijera): ");
            String opcionUsu = captura.next();
            int opcionM = (int) (Math.random() * 3);

            System.out.println("La máquina elige " + opciones[opcionM] + ".");


            if (opcionUsu.equals(opciones[opcionM])) {
                empates++;
                System.out.println("Empate");
                
            } else if (opcionUsu.equals("piedra") && opciones[opcionM].equals("tijera") ||
            opcionUsu.equals("papel") && opciones[opcionM].equals("piedra") ||
            opcionUsu.equals("tijera") && opciones[opcionM].equals("papel")) {
                ganadas++;
                System.out.println("Gano");
            } else {
                perdidas++;
                System.out.println("Perdió");
            }
        }

        System.out.println("Resultados:");
        System.out.println("Ganadas: " + ganadas);
        System.out.println("Perdidas: " + perdidas);
        System.out.println("Empates: " + empates);

        captura.close();
 }
}
