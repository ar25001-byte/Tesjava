import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int i = 1;

        System.out.print("Ingrese un número entero positivo: ");
        numero = sc.nextInt();

        while (i <= numero) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

            i++;
        }

        sc.close();
    }
}