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
                    hipotenusa();
                    break;
                case 6 :
                    areacilindro();
                    break;
                case 7:
                    volumencilindro();

                case 9 :
                    System.out.println("HASTA LUEGO");
            }
        } 

    
        static void hipotenusa() {
            System.out.println("INTRODUZCA UN NUMERO");
            int n1 = sc.nextInt();
            System.out.println("INTRODUZCA OTRO NUMERO");
            int n2 = sc.nextInt();
            int catetoad = n1 * n1;
            int catetosub = n2 * n2;
            int resut = catetoad + catetosub;
            double hipotenusa = Math.sqrt(resut);
        }
    
        static void areacilindro() {
    
            System.out.println("INTRODUZCA EL RADIO DEL CILINDRO");
            int radio = sc.nextInt();
            System.out.println("INTRODUZCA OTRO NUMERO");
            int altura = sc.nextInt();
            //declaro variable
            double areabase = Math.PI * radio * radio;
            double arealateral = 2 * Math.PI * radio * altura;
            int suma = radio + altura;
            double areatotal = 2 * Math.PI * radio * suma;
            System.out.println("EL AREA DE LA BASE ES" + areabase + "cm^2");
            System.out.println("EL AREA DE LA lateral ES" + arealateral + "cm^2");
            System.out.println("EL AREA DE LA TOTAL ES" + areatotal + "cm^2");
        }
    
        static void volumencilindro() {
            System.out.println("INTRODUZCA   EL RADIO DEL CILINDRO");
            int radio = sc.nextInt();
            System.out.println("INTRODUZCA");
            int altura = sc.nextInt();
            //declaro variable
            double volumen = Math.PI * Math.pow(radio, 2) * altura;
    
            System.out.println("EL VOLUMEN DEL CILINDRO ES " + volumen + "cm^3");
        }
    }
    
}
