// Activitat 12 — El més gran de tres números
import java.util.Scanner;

public class MesGranDeTres {
    public static void main(String[] args) {
        // TODO: llegeix 3 números i mostra quin és el més gran
    
    Scanner teclat = new Scanner(System.in);
    
    System.out.println("Introdueix el primer número:"); 
    double numero1 = teclat.nextDouble();
    
    System.out.println("Introdueix el segon número:");
    double numero2 = teclat.nextDouble();

    System.out.println("Introdueix el tercer número:"); 
    double numero3 = teclat.nextDouble();

    double gran = numero1;

    if (numero2 > gran) {
        gran = numero2;
    }   
    if (numero3 > gran) { 
        gran = numero3; 
    }
    System.out.println("El número més gran és: " + gran);
    }
}