// Activitat 16 — Descompte per trams

import java.util.Scanner;

public class DescompteTrams {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat N i resta-li el descompte segons el tram
        //   N < 500          -> 5%
        //   500 <= N < 1000  -> 8%
        //   1000 <= N <= 5000 -> 15%
        //   N > 5000         -> 25%
        //   Mostra el resultat
    Scanner teclat = new Scanner(System.in);
    
    System.out.print("Introdueix una quantitat: "); 
    double n = teclat.nextDouble();
    
    if (n < 500) {
        n = n - (n * 0.05);
    } else if (n < 1000) {
        n = n - (n * 0.08);
    } else if (n <= 5000) {
        n = n - (n * 0.15);
    } else {
        n = n - (n * 0.25);
    }

    System.out.println("El resultat és: " + n);
    }
}
