// Activitat 21 — Pedra, paper o tisora
// Ajuda: java.util.Random -> random.nextInt(3)  (0 pedra, 1 paper, 2 tisora)
import java.util.Random;
import java.util.Scanner;
public class PedraPaperTisora {
    public static void main(String[] args) {
        // TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)
    Random generador = new Random();
    Scanner teclat = new Scanner(System.in);
    
    
    int numero = generador.nextInt(3);

    System.out.print("Entra pedra, paper o tisora: "); 
    String jugador = teclat.next();

    if (numero == 0) { 
    System.out.println("Ordinador ha tret: pedra"); 

    } else if (numero == 1) {
        System.out.println("Ordinador ha tret: paper"); 
    } else { 
        System.out.println("Ordinador ha tret: tisora"); 
    } 
    
    if (jugador.equals("pedra")) { 
        
        if (numero == 0) { 
            System.out.println("Heu empatat!!"); 
        } else if (numero == 1) { 
            System.out.println("Has perdut!"); 
        } else { System.out.println("Has guanyat!"); 

        } 
    
    } else if (jugador.equals("paper")) { 
        
        if (numero == 0) { 
            System.out.println("Has guanyat!"); 
        } else if (numero == 1) { 
            System.out.println("Heu empatat!!"); 
        } else { 
            System.out.println("Has perdut!"); 
        
        } 
    
    } else if (jugador.equals("tisora")) { 
        if (numero == 0) { 
            System.out.println("Has perdut!"); 
        } else if (numero == 1) { 
            System.out.println("Has guanyat!"); 
        } else { 
            System.out.println("Heu empatat!!"); 
        } 
    } 
}
}
