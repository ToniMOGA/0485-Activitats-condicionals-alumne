// Activitat 10 — Caixer, comissió i saldo

import java.util.Scanner;

public class CaixerComissio {
    public static void main(String[] args) {
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix el saldo actual: ");
        double saldo = teclat.nextDouble();
        
        System.out.print("Introdueix la quantitat a treure: ");
        int quantitat = teclat.nextInt();
        
        System.out.print("Fas servir caixer propi? (S/N)");
        char propi = teclat.next().charAt(0);

        double comissio = 0;
        
        if (propi == 'N') {
            comissio = quantitat * 0.05;
        }
        
        double quantitatRetirar = quantitat + comissio;

        if(quantitatRetirar > saldo) {
            System.out.println("No es pot fer");
        } else{
            double saldoRestant = saldo - quantitatRetirar;
            System.out.println("Quantitat a treure: " + quantitat + " euros"); 
            System.out.println("Comissió: " + comissio + " euros"); 
            System.out.println("Saldo restant: " + saldoRestant + " euros");

        }
        
    }
}     