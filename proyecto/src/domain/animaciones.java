
package domain;

import java.util.Scanner;


public class animaciones {
    
    
   
    
    public static void bienvenidos(){
        System.out.println("           o o o       o o o     o o o     o     o    o       o    o o o    o     o    o o o     o o o         o o       o o o        ");
        esperar(1);
        System.out.println("           o     o       o       o         o o   o     o     o     o        o o   o      o       o     o     o     o    o             ");
        esperar(1);
        System.out.println("           o o o         o       o o o     o  o  o      o   o      o o o    o  o  o      o       o      o    o     o     o o o        ");
        esperar(1);
        System.out.println("           o     o       o       o         o   o o       o o       o        o   o o      o       o     o     o     o          o       ");
        esperar(1);
        System.out.println("           o o o       o o o     o o o     o     o        o        o o o    o     o    o o o     o o o         o o       o o o        ");
        esperar(3);
    }
    
    public static void desarrolladores(){
        System.out.println("                                                      ----------------------------------------------");
        System.out.println("                                                               DESARROLLADORES DEL PROYECTO         ");
        System.out.println("                                                      ----------------------------------------------");
        esperar(1);
        System.out.println("                                                      - Antonella Arraez");
        esperar(1);
        System.out.println("                                                      - Ivana Gonzalez");
        esperar(1);
        System.out.println("                                                      - Facundo Rios");
        esperar(1);
        System.out.println("                                                      - Héctor Fonzalida");
        esperar(1);
        System.out.println("                                                      - Juan Machuca");
        esperar(1);
        System.out.println("                                                      - Lucas Mendez");
        esperar(1);
        System.out.println("                                                      - Nadia Gonzalez");
        esperar(1);
        System.out.println("                                                      - Nicolás Machuca\n");
        esperar(2);
        System.out.println("                                                                  - P O W E R   B I T S -");
    }
    
    static public void teclaSeguir() {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\n          - Presione INTRO para seguir...");
        try {
            seguir = teclado.nextLine();
        } catch (Exception e) {
        }
    }
    
    static public void teclaSortear() {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\nPresione INTRO para sortear...");
        try {
            seguir = teclado.nextLine();
        } catch (Exception e) {
        }
    }
    
    
    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }     
    
    
    
    
    
}
