import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos votos se van a registrar.?: ");
        int n = sc.nextInt();

        String[] votos = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el voto " + (i + 1) + " (A, B o C): ");
            votos[i] = sc.next().toUpperCase();
        }

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < votos.length; i++) {
            switch (votos[i]) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
            }
        }

        System.out.println("Candidato A: " + a);
        System.out.println("Candidato B: " + b);
        System.out.println("Candidato C: " + c);

        if (a > b && a > c) {
            System.out.println("Ganador: A");
        } else if (b > a && b > c) {
            System.out.println("Ganador: B");
        } else if (c > a && c > b) {
            System.out.println("Ganador: C");
        } else {
            System.out.println("Resultado: Empate");
        }

        sc.close();
    }
}