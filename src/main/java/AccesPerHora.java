// Activitat 05 — Accés per hora
// Ajuda: fes servir java.util.Calendar per saber l'hora actual
//   Calendar calendar = Calendar.getInstance();
//   int hour = calendar.get(Calendar.HOUR_OF_DAY);

import java.util.Calendar;
import java.util.Scanner;

public class AccesPerHora {
    public static void main(String[] args) {
        // TODO: mostra "Pots accedir" únicament si ja han passat les 8 del matí
    Scanner teclat = new Scanner(System.in);
    
    Calendar calendar = Calendar.getInstance();
    int hora = calendar.get(Calendar.HOUR_OF_DAY);
    int dia_setmana = calendar.get(Calendar.DAY_OF_WEEK);
    System.out.println(hora);

    if (hora >=8){
        System.out.println("Pots entrar!");
    }if (dia_setmana == 2){;
        System.out.println("Es dilluns, hi ha classe");
    }if (dia_setmana == 3){;
        System.out.println("Es dimarts, hi ha classe");
    }if (dia_setmana == 4){;
        System.out.println("Es dimecres, hi ha classe");
    }if (dia_setmana == 5){;
        System.out.println("Es dijous, hi ha classe");
    }if (dia_setmana == 6){;
        System.out.println("Es divendres, hi ha classe");
    }if (dia_setmana == 7){;
        System.out.println("Es dissabte, no hi ha classe");
    }if (dia_setmana == 1){;
        System.out.println("Es diumenge, hi ha classe");
    }
}
}
