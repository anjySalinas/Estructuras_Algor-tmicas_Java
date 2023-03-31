import java.util.Scanner;

public class RETO_2 {

    //El centro de salud Famisalud, aplica vacunas a los bebes menores de un año y la dosis a aplicar depende del peso y la edad del bebé según la siguiente fórmula: Realice un programa en java que le permita a la enfermera, determinar con facilidad la dosis de la vacuna que se debe aplicar a un bebé, mostrar cual vacuna le aplicaron, nombre de la mama, nombre del bebe, peso del bebe y dosis.

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nomBe,nomMa,nomVa;
        double peBe,meses,dosis;
        System.out.print("POR FAVOR INGRESAR EL NOMBRE DEL BEBE:");
        nomBe=lectura.next();
        System.out.print("POR FAVOR INGRESE EL PESO DEL BEBE EN KILOGRAMOS:");
        peBe=lectura.nextInt();
        System.out.print("POR FAVOR INGRESE LOS MESES DEL BEBE:");
        meses=lectura.nextInt();
        System.out.print("POR FAVOR INGRESAR EL NOMBRE DE LA MADRE:");
        nomMa=lectura.next();
        System.out.print("INGRESAR NOMBRE DE LA VACUNA:");
        nomVa=lectura.next();
        
        dosis= (peBe+10) / (meses*10) * 8;
      
        System.out.printf("señora "+nomMa+" se le informa que al paciente "+nomBe+" se le ha aplicado la vacuna "+nomVa+" con una dosis de %.2f ml\n", dosis);

        lectura.close(); 
        }
          }


