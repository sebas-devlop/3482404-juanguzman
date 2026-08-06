import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas temperaturas va a registrar?: ");
        int n = sc.nextInt();

        int[] temperaturas = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la temperatura " + (i + 1) + ": ");
            temperaturas[i] = sc.nextInt();
        }

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 10) {
                System.out.println(temperaturas[i] + " -> Frío");
            } else if (temperaturas[i] <= 25) {
                System.out.println(temperaturas[i] + " -> Templado");
            } else {
                System.out.println(temperaturas[i] + " -> Calor");
            }
        }

        sc.close();
    }
}
