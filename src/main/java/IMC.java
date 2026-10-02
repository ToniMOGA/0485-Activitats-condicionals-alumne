// Activitat 13 — Índex de massa corporal (IMC)
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        // TODO: llegeix l'altura en cm i el pes en kg
        //   IMC = pes / (altura_en_metres al quadrat)
        //   Classificació OMS: <18.5 Pes insuficient, <25 Pes normal, <30 Sobrepès, >=30 Obesitat
    Scanner teclat = new Scanner(System.in);
    
    System.out.print("Introdueix altura en cm: ");
    double alturaCm = teclat.nextDouble();

    System.out.print("Introdueix pes en kg: ");
    double pes = teclat.nextDouble();

    double alturaMetres = alturaCm / 100;

    double imc = pes / (alturaMetres * alturaMetres);

    System.out.printf("L'IMC és: %.2f%n", imc);

    if (imc < 18.5) { 
        System.out.println("Classificació (OMS): Pes insuficient"); 
    } else if (imc < 25) { 
        System.out.println("Classificació (OMS): Pes normal"); 
    } else if (imc < 30) { 
        System.out.println("Classificació (OMS): Sobrepès"); 
    } else { 
            System.out.println("Classificació (OMS): Obesitat"); }
    }
}
