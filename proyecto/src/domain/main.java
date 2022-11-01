
package domain;

import static domain.animaciones.bienvenidos;
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
       bienvenidos();
       menu();
        
    }
    
    public static void menu(){
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("                                                      - - - M E N U   D E   O P C I O N E S - - -");
            System.out.println("");
            System.out.println("                                        1- Jugar Loteria");
            System.out.println("                                        2- Jugar Quini6");
            System.out.println("                                        3- Salir");
            System.out.println("");
            System.out.print("                                        - Ingrese una opcion: ");
        opcion = Integer.parseInt(entrada.nextLine());
        }while(opcion > 3 || opcion < 1);

        
        System.out.println("");
        System.out.println("");
        
        
        switch(opcion){
            case 1:
                menuJugadores();
                
        }

    }
    
    
    public static void menuJugadores(){
        
        Scanner entrada = new Scanner(System.in); 
        
        int eleccion;
        String nombre1, nombre2;
        
        
        System.out.println("                                                                    L O T E R I A");
        System.out.println("");
        System.out.println("                                        1- Ingrese el nombre de los jugadores");
        System.out.println("                                        2- Seleccion de los cartones");
        System.out.println("                                        3- Jugar");
        System.out.println("                                        4- Volver al menu principal");
        System.out.println("");
        System.out.print("                                        -Ingrese una opcion: ");
        eleccion = Integer.parseInt(entrada.nextLine());
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        
        switch(eleccion){
        
            case 1:
                System.out.println("                                                      ------------------------------------------");
                System.out.print("                                                      Ingrese el nombre del JUGADOR 1: ");
                nombre1 = entrada.nextLine();
                System.out.println("                                                      ------------------------------------------");
                System.out.println("");
                System.out.println("                                                      ------------------------------------------");
                System.out.print("                                                      Ingrese el nombre del JUGADOR 2: ");
                nombre2 = entrada.nextLine();
                System.out.println("                                                      ------------------------------------------");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
        }
        
    }
    
}



