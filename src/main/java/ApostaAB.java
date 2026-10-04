// Activitat 19 — Aposta A o B
// Ajuda: java.util.Random -> random.nextInt(10) + 1

import java.util.Random;
import java.util.Scanner;

public class ApostaAB {
    public static void main(String[] args) {
        // TODO: genera dos números aleatoris A i B (no els mostris encara)
        //   Pregunta per qui aposta l'usuari (A o B); guanya el número més alt
        //   Mostra els dos valors i si ha guanyat o perdut l'aposta
    Scanner teclat = new Scanner(System.in); 
    Random random = new Random();
    
    int a = random.nextInt(10) + 1; 
    int b = random.nextInt(10) + 1;
    
    System.out.print("Apostes per A o per B ? : "); 
    char aposta = teclat.next().charAt(0);

    System.out.println("A treu un " + a + " i B treu un " + b);
    
    if (a > b) {
        if (aposta == 'A') {
            System.out.println("HAS GUANYAT!!!"); 
        } else { 
            System.out.println("HAS PERDUT!!!"); 
        } 

    } else if (b > a) { 
        
        if (aposta == 'B') { 
            System.out.println("HAS GUANYAT!!!"); 
        } else { 
            System.out.println("HAS PERDUT!!!"); }
    
    } else { 
        System.out.println("A i B han tret el mateix número!");
    }
}
}