import java.util.Scanner;

// Activitat 26 — Positiu, negatiu o zero, amb control d'excepcions

public class PositiuNegatiuZeroExcepcions {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix un número: ");

        try {

            int numero = teclat.nextInt();

            if (numero > 0) {
                System.out.println("El número és positiu");
            } else if (numero < 0) {
                System.out.println("El número és negatiu");
            } else {
                System.out.println("El número és zero");
            }

        } catch (Exception e) {

            System.out.println("Error: has d'introduir un número enter");
        }
    }
}