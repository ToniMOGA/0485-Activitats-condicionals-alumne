// Activitat 11 — Preu d'una entrada de cinema
// Ajuda: per llegir una lletra amb Scanner
//   char lletra = teclat.next().charAt(0);
import java.util.Scanner;

public class PreuEntradaCinema {
    public static void main(String[] args) {
        // TODO: l'entrada normal val 5€
        //   Un 10% més en cap de setmana (pregunta L=laborable o C=cap de setmana)
        //   Un 15% de descompte addicional amb Carnet Jove (pregunta S/N)
        //   Mostra el preu final
    Scanner teclat = new Scanner(System.in);
    
    double preu = 5;

    System.out.println("És un dia laborable (L) o de cap de setmana (C)?"); 
    char dia = teclat.next().charAt(0);
    
    System.out.println("Tens Carnet Jove? (S/N):");
    char carnet = teclat.next().charAt(0);

    if (dia == 'C') {
        preu = preu + (preu * 0.10);
    }

    System.out.println("El preu de l'entrada és: " + preu + " euros");
    }
}