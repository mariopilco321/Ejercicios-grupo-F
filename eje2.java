import java.util.Scanner;

public class BusquedaError {

    public static void main(String[] args) {

        String[] nombres = {"Juan", "Ana", "Luis"};
        int[] notas = {9, 10, 8};

        Scanner sc = new Scanner(System.in);

        String buscar;
        boolean encontrado = false;

        System.out.print("Ingrese nombre: ");
        buscar = sc.nextLine();

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equals(buscar)) {

                System.out.println("Nota: " + notas[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nombre no encontrado");
        }

        sc.close();
    }
}