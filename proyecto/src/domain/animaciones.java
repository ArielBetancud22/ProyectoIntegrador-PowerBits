
package domain;

import java.util.Scanner;


public class animaciones {
    
    
   
    
    public static void bienvenidos(){
        System.out.println("           o o o       o o o     o o o     o     o    o       o    o o o    o     o    o o o     o o o         o o       o o o        ");
        System.out.println("           o     o       o       o         o o   o     o     o     o        o o   o      o       o     o     o     o    o             ");
        System.out.println("           o o o         o       o o o     o  o  o      o   o      o o o    o  o  o      o       o      o    o     o     o o o        ");
        System.out.println("           o     o       o       o         o   o o       o o       o        o   o o      o       o     o     o     o          o       ");
        System.out.println("           o o o       o o o     o o o     o     o        o        o o o    o     o    o o o     o o o         o o       o o o        ");
    }
    
    public static void desarrolladores(){
        System.out.println("                                         ----------------------------------------------");
        System.out.println("                                                  DESARROLLADORES DEL PROYECTO         ");
        System.out.println("                                         ----------------------------------------------");
        System.out.println("                                         - Antonella Arraez");
        System.out.println("                                         - Ivana Gonzalez");
        System.out.println("                                         - Facundo Rios");
        System.out.println("                                         - Héctor Fonzalida");
        System.out.println("                                         - Juan Machuca");
        System.out.println("                                         - Lucas Mendez");
        System.out.println("                                         - Nadia Gonzalez");
        System.out.println("                                         - Nicolás Machuca\n");
        System.out.println("                                                     - P O W E R   B I T S -");
    }
    
    static public void teclaSeguir() {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Presione una tecla para seguir...");
        try {
            seguir = teclado.nextLine();
        } catch (Exception e) {
        }
    }
   
    
}
