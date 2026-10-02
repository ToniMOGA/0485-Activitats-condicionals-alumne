
import java.util.Scanner;

// Activitat 06 — Rectangle o quadrat
public class RectangleQuadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no
    Scanner teclat = new Scanner(System.in);

    System.out.println("Introdueix el costat gran del rectangle:"); 
    int costatGran = teclat.nextInt(); 
    
    System.out.println("Introdueix el costat petit del rectangle:"); 
    int costatPetit = teclat.nextInt(); 
    
    int perimetre = costatGran * 2 + costatPetit * 2; 
    int area = costatGran * costatPetit; 
    
    System.out.println("Perímetre del rectangle = " + perimetre); 
    System.out.println("Àrea del rectangle = " + area); 
    
    if (costatGran == costatPetit) { 
        System.out.println("És un quadrat"); 
    } else { 
        System.out.println("No és un quadrat"); } 
    }
}
