import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matriz de 4x4 = 16 mascotas
        String[][] mascotas = new String[4][4];

        // Ingreso de datos
        System.out.println("Ingrese los nombres de las 16 mascotas:");

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                System.out.print("Mascota [" + fila + "][" + columna + "]: ");
                mascotas[fila][columna] = sc.nextLine();
            }
        }

        // Mostrar filas y columnas con índices impares
        System.out.println("\nMascotas en filas y columnas impares:");

        for (int fila = 1; fila < 4; fila += 2) {
            for (int columna = 1; columna < 4; columna += 2) {

                System.out.print(mascotas[fila][columna] + "\t");
            }

            System.out.println();
        }

        sc.close();
    }
}
