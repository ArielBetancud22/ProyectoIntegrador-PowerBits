
package domain;

import java.util.Scanner;


public class animaciones {
    
    
   
    
    public static void bienvenidos(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        esperar(1);
        System.out.println("                o o o       o o o     o o o     o     o    o       o    o o o    o     o    o o o     o o o         o o       o o o                ");
        esperar(1);
        System.out.println("                o     o       o       o         o o   o     o     o     o        o o   o      o       o     o     o     o    o                     ");
        esperar(1);
        System.out.println("                o o o         o       o o o     o  o  o      o   o      o o o    o  o  o      o       o      o    o     o     o o o                ");
        esperar(1);
        System.out.println("                o     o       o       o         o   o o       o o       o        o   o o      o       o     o     o     o          o               ");
        esperar(1);
        System.out.println("                o o o       o o o     o o o     o     o        o        o o o    o     o    o o o     o o o         o o       o o o                ");
        esperar(1);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public static void cartonLleno(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                                    3     3   3          3  3         3        3   3        3 ");
        System.out.println("                                     3    3         3          3       3      3     3      3");
        System.out.println("                                                ---------------------------");
        System.out.println("                                   3   3     3    C A R T O N   L L E N O       3      3     3");
        System.out.println("                                                ---------------------------");
        System.out.println("                                     3    3      3         3          3         3     3      3");
        System.out.println("                                        3    3        3        3          3         3   3");
        System.out.println("");
        System.out.println("");
        System.out.println("");
       
    }
    
    public static void desarrolladores(){
        System.out.println("                                                   ----------------------------------------------");
        System.out.println("                                                            DESARROLLADORES DEL PROYECTO         ");
        System.out.println("                                                   ----------------------------------------------");
        esperar(1);
        System.out.println("                                                   - Antonella Arraez");
        esperar(1);
        System.out.println("                                                   - Ivana Gonzalez");
        esperar(1);
        System.out.println("                                                   - Facundo Rios");
        esperar(1);
        System.out.println("                                                   - Héctor Fonzalida");
        esperar(1);
        System.out.println("                                                   - Juan Machuca");
        esperar(1);
        System.out.println("                                                   - Lucas Mendez");
        esperar(1);
        System.out.println("                                                   - Nadia Gonzalez");
        esperar(1);
        System.out.println("                                                   - Nicolás Machuca\n");
        esperar(2);
        System.out.println("                                                                 - P O W E R   B I T S -");
    }
    
    public static void teclaSeguir() {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n\nPresione INTRO para seguir...");
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

    static class teclaSeguir {

        public teclaSeguir() {
        }
    }
}
