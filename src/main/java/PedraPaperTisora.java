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
    
    
    int numero = generador.nextInt(1,4);
    System.out.println(numero);
    int pedra = 1;
    int paper = 2;
    int tisora = 3;
    
    if (num.equals(1)) {
    System.out.println("Pedra");
    }
    if (num.equals(2)) {
    
    }
    
    }
    

//lo que debo hacer es que los usuarios por teclado pongan piedra papel o tijera, pero debo afiliar los numeros para que salga en el random




    /* 
    System.out.println(numero);

    
    String frase;
    frase = "Hola avui plou";
    System.out.println(frase);
    frase = "No ha plogut molt";
    System.out.println(frase);

    //basics amb minuscula: int, double, boolean, char. Complexes amb mayuscula: String, Random. per comprobar en estes no funciona el ==, 
    String nom = "PEPE";
    //if(nom) == Ana{ //NOOO ERROOOOR!!, el == solament en coses simples com numeros, per comparar correctament:
    if(nom.equals("Ana")){
        System.out.println("SIII!!");
    }else{
        System.out.println("NOOOO");
    }
    
    String paraula;
    paraula = teclat.next(); //nextLine() guardaría frases con espacios, como está ahora solo lee la primera palabra de la frase
    System.out.println(paraula);
 */
   
    
    
    
    
    
    }
}
