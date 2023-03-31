import java.util.Scanner;

public class RETO_1 {
    
    //¡La abuela tiene horno nuevo! y ha planeado hacer una deliciosa torta de vainilla con relleno de crema y fresas.La receta dice que debe precalentar el horno a 350 °K(grados Kelvin), pero su horno muestra la temperatura en °C (grados Centígrados). Ayúdale a la abuela a colocar la temperatura correcta. Crea un programa en java que convierta grados Kelvin (°K) a Centígrados (°C) teniendo en cuenta lo siguiente:

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double gradosKel,gradosCen;

        System.out.println("INGRESE LA TEMPERATURA EN GRADOS KELVIN (K)");
        gradosKel=lectura.nextInt();

        gradosCen=(gradosKel)-273.15;
        System.out.println("LA TEMPERATURA EN GRADOS KELVIN EQUIVALE A "+gradosCen+" GRADOS CENTIGRADOS");

        lectura.close();
}
 }
