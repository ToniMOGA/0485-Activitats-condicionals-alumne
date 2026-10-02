
import java.util.Scanner;

// Activitat 22 — Nom del mes (switch)
public class NomDelMes {
    public static void main(String[] args) {
        // TODO amb switch: llegeix un número de mes (1-12) i mostra el seu nom
        //   Controla els números fora de rang (default)
    Scanner lector = new Scanner(System.in);
    System.out.println("Entra numero mes [1-12] ");

    int mes = lector.nextInt();
    switch(mes){
    
        case 1:
            System.out.println("Gener");
            break;
        case 2:
            System.out.println("Febrer");
            break;
        case 3:
            System.out.println("Març");
            break;
        case 4:
            System.out.println("Abril");
            break;
        case 5:
            System.out.println("Maig");
            break;
        case 6:
            System.out.println("Juny");
            break;
        case 7:
            System.out.println("Juliol");
            break;
        case 8:
            System.out.println("Agost");
            break;
        case 9:
            System.out.println("Septembre");
            break;
        case 10:
            System.out.println("Octubre");
            break;
        case 11:
            System.out.println("Novembre");
            break;
        case 12:
            System.out.println("Decembre");
            break;
        default:
            System.out.println("Numero no vàlid");
    }

    int diesmes = lector.nextInt();
    switch(diesmes){    
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("31 dies");
            break;
        case 4: case 6: case 9: case 11:
            System.out.println("30 dies");
        case 2:
            System.out.println("28 dies");
        default:
            System.out.println("Número no vàlid");
   /*case 1:
            System.out.println("31 dies");
            break;
        case 2:
            System.out.println("28 dies");
            break;
        case 3:
            System.out.println("31 dies");
            break;
        case 4:
            System.out.println("31 abril");
            break;
        case 5:
            System.out.println("31 dies");
            break;
        case 6:
            System.out.println("31 dies");
            break;
        case 7:
            System.out.println("31 dies");
            break;
        case 8:
            System.out.println("31 dies");
            break;
        case 9:
            System.out.println("30 dies");
            break;
        case 10:
            System.out.println("31 dies");
            break;
        case 11:
            System.out.println("30 dies");
            break;
        case 12:
            System.out.println("31 dies");
            break;
        default:
            System.out.println("Numero no vàlid");*/
    }
        
    }
}
