import java.util.Scanner;

// Activitat 27 — Monedes mínimes

public class MonedesMinimesCondicional {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix una quantitat (cèntims euro): ");
        int quantitat = teclat.nextInt();

        if (quantitat >= 0) {

            int monedes200 = quantitat / 200;
            quantitat = quantitat % 200;

            int monedes100 = quantitat / 100;
            quantitat = quantitat % 100;

            int monedes50 = quantitat / 50;
            quantitat = quantitat % 50;

            int monedes20 = quantitat / 20;
            quantitat = quantitat % 20;

            int monedes10 = quantitat / 10;
            quantitat = quantitat % 10;

            int monedes5 = quantitat / 5;
            quantitat = quantitat % 5;

            int monedes2 = quantitat / 2;
            quantitat = quantitat % 2;

            int monedes1 = quantitat;

            if (monedes200 > 0) {
                System.out.println(monedes200 + " monedes de 2 euros");
            }

            if (monedes100 > 0) {
                System.out.println(monedes100 + " monedes d'1 euro");
            }

            if (monedes50 > 0) {
                System.out.println(monedes50 + " monedes de 50 cèntims");
            }

            if (monedes20 > 0) {
                System.out.println(monedes20 + " monedes de 20 cèntims");
            }

            if (monedes10 > 0) {
                System.out.println(monedes10 + " monedes de 10 cèntims");
            }

            if (monedes5 > 0) {
                System.out.println(monedes5 + " monedes de 5 cèntims");
            }

            if (monedes2 > 0) {
                System.out.println(monedes2 + " monedes de 2 cèntims");
            }

            if (monedes1 > 0) {
                System.out.println(monedes1 + " monedes de 1 cèntims");
            }

        } else {
            System.out.println("La quantitat no pot ser negativa");
        }
    }
}