
import java.util.Scanner;

/**
 *
 * @author EDRAS JOSE MATEO JIMENEZ
 */
public class Aplicacion {

    public static void main(String[] args) {
        //entrada de las opciones 
        Scanner sc = new Scanner(System.in);
        //menu de operciones
        int opera= 0;
        while(opera!=5){
            System.out.println("1 suma");
            System.out.println("2 resta");
            System.out.println("3 multiplicacion");
            System.out.println("4 division");
            System.out.println("5 salida");
            System.out.println("INTRODUZCA EL NUMERO DE LA OPERACION");
            opera = sc.nextInt();
            System.out.println("INTRODUZCA UN NUMERO");
            int n1 = sc.nextInt();
            System.out.println("INTRODUZCA OTRO NUMERO");
            int n2 = sc.nextInt();

            //declaro las variables
            int suma = n1 + n2;
            int resta = n1 - n2;
            int multiplicacion = n1 * n2;
            int division = n1 / n2;
            switch (opera) {
                case 1:
                    System.out.println("el resultado de la suma es: " + suma);
                    break;
                case 2:
                    System.out.println("el resultado de la resta es: " + resta);
                    break;
                case 3:
                    System.out.println("el resultado de la multiplicacion es" + multiplicacion);
                    break;
                case 4:
                    System.out.println("el resultado de la division es " + division);
                    break;
                case 5:
                    System.out.println("HASTA LUEGO");
            }
        } 

    }
}
