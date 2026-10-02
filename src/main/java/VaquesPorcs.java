// Activitat 03 — Vaques i porcs

import java.util.Scanner;

public class VaquesPorcs {
    public static void main(String[] args) {
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)
    Scanner teclat = new Scanner(System.in);

    System.out.println("Quantes vaques hi han a la granja?");
    int vaques = teclat.nextInt();

    System.out.println("Quants porcs hi ha a la granja?");
    int porcs = teclat.nextInt();

    int total = vaques + porcs;
    double percentVaques = (double) vaques / total * 100;
    double percentPorcs = (double) porcs / total * 100;

    System.out.println("El percentatge és: " + (int) percentVaques + "% de vaques");

    if (vaques > porcs){
        System.out.println("Hi ha més vaques que porcs!");
    } else if (porcs > vaques){
        System.out.println("Hi ha més porcs que vaques!");
    } else {
        System.out.println("Hi ha el mateix nombre de vaques que de porcs!");
    }
    }
}