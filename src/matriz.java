import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[][] elementos = new String[4][4];

        System.out.println("Ingrese 16 nombres de elementos quimicos:");

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Elemento [" + fila + "][" + columna + "]: ");
                elementos[fila][columna] = entrada.nextLine();
            }
        }

        System.out.println("");
        System.out.println("Matriz completa:");

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(elementos[fila][columna] + "\t");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("Elementos en filas y columnas con indices pares:");

        for (int fila = 0; fila < 4; fila += 2) {
            for (int columna = 0; columna < 4; columna += 2) {
                System.out.print(elementos[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}