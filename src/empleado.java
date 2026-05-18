import java.util.Scanner;
public class empleado  {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double sueldo;
        double descuento;
        double sueldoFinal;

        System.out.println("Ingrese sueldo");
        sueldo = entrada.nextDouble();

        if(sueldo < 500){
            descuento = 0;

        }else if(sueldo >= 500 && sueldo < 750){
             descuento = sueldo * 0.05;

        }else {
            descuento = sueldo * 0.10;
        }


        sueldoFinal = sueldo - descuento;

        System.out.println("");
        System.out.println("El descuento es: " + descuento);
        System.out.println("Sueldo final es: " + sueldoFinal);
    }

}
