
import java.util.InputMismatchException;
import java.util.Scanner;

// Activitat 25 — Operacions aritmètiques amb control d'excepcions
public class OperacionsExcepcions {
    public static void main(String[] args) {
        // TODO: llegeix 2 números enters i mostra suma, resta, multiplicació i divisió
        //   Controla amb try/catch que l'usuari introdueixi números vàlids
        //   Controla que el segon operand no sigui 0 abans de dividir
    
    try
    {
    
    Scanner teclat = new Scanner(System.in);
    System.out.println("Entra primer numero: ");
    int num1 = teclat.nextInt();
    System.out.println("Entra segon numero: ");
    int num2 = teclat.nextInt();

    int resultat;
    resultat = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + resultat);
    resultat = num1 - num2;
    System.out.println(num1 + " - " + num2 + " = " + resultat);
    resultat = num1 * num2;
    System.out.println(num1 + " * " + num2 + " = " + resultat);


    if(num2!=0){
            resultat = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + resultat);

    }

    }catch (InputMismatchException e){
        System.out.println("Error al executar operació");
    } 
    }
}