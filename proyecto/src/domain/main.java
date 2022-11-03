
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
            case 2:
                seleccionCartones();
            
        }
        
    }
    
    public static void seleccionCartones(){
        int cartonElegido;
        carton_1();
        carton_2();
        carton_3();
        carton_4();
    }
    
    public static void armadoCarton1(String[][] carton1){
        
        carton1[0][0] = "0"; carton1[0][1] = "0"; carton1[0][2] = "0"; carton1[0][3] = "31"; carton1[0][4] = "0"; carton1[0][5] = "57"; carton1[0][6] = "65"; carton1[0][7] = "0"; carton1[0][8] = "88"; 
        carton1[1][0] = "0"; carton1[1][1] = "12"; carton1[1][2] = "0"; carton1[1][3] = "35"; carton1[1][4] = "47"; carton1[1][5] = "0"; carton1[1][6] = "0"; carton1[1][7] = "75"; carton1[1][8] = "90";
        carton1[2][0] = "8"; carton1[2][1] = "19"; carton1[2][2] = "0"; carton1[2][3] = "0"; carton1[2][4] = "48"; carton1[2][5] = "0"; carton1[2][6] = "67"; carton1[2][7] = "76"; carton1[2][8] = "0"; 
    }
    public static void mostrarCarton1(String[][] carton1) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
         
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 8; j++) {
                if (carton1[i][j] == "0"){
                    carton1[i][j] = " "; 
                }
                if (carton1.length > 1){
                    System.out.print(" "+carton1[i][j]+" |");
                }
                else{
                    System.out.print(" "+carton1[i][j]+"  |");
                }
            }
            System.out.println("");
        }
     }
    
    
    
    
    public static void armadoCarton2(String[][] carton2){

        carton2[0][0] = "1"; carton2[0][1] = "0"; carton2[0][2] = "23"; carton2[0][3] = "0"; carton2[0][4] = "45"; carton2[0][5] = "0"; carton2[0][6] = "61"; carton2[0][7] = "0"; carton2[0][8] = "82"; 
        carton2[1][0] = "0"; carton2[1][1] = "14"; carton2[1][2] = "0"; carton2[1][3] = "37"; carton2[1][4] = "49"; carton2[1][5] = "0"; carton2[1][6] = "69"; carton2[1][7] = "70"; carton2[1][8] = "0";
        carton2[2][0] = "4"; carton2[2][1] = "0"; carton2[2][2] = "28"; carton2[2][3] = "0"; carton2[2][4] = "0"; carton2[2][5] = "55"; carton2[2][6] = "0"; carton2[2][7] = "78"; carton2[2][8] = "87";
    }
    
    public static void mostrarCarton2(String[][] carton2) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
         
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 8; j++) {
                if (carton2[i][j] == "0"){
                    carton2[i][j] = " "; 
                }
                if (carton2.length > 1){
                    System.out.print(" "+carton2[i][j]+" |");
                }
                else{
                    System.out.print(" "+carton2[i][j]+"  |");
                }
            }
            System.out.println("");
        }
     }
    
    
    
    
    
    
    
    public static void armadoCarton3(String[][] carton3){
        carton3[0][0] = "0"; carton3[0][1] = "0"; carton3[0][2] = "22"; carton3[0][3] = "0"; carton3[0][4] = "40"; carton3[0][5] = "50"; carton3[0][6] = "0"; carton3[0][7] = "71"; carton3[0][8] = "85"; 
        carton3[1][0] = "6"; carton3[1][1] = "0"; carton3[1][2] = "29"; carton3[1][3] = "30"; carton3[1][4] = "0"; carton3[1][5] = "54"; carton3[1][6] = "0"; carton3[1][7] = "0"; carton3[1][8] = "81";
        carton3[2][0] = "7"; carton3[2][1] = "16"; carton3[2][2] = "0"; carton3[2][3] = "34"; carton3[2][4] = "46"; carton3[2][5] = "0"; carton3[2][6] = "66"; carton3[2][7] = "0"; carton3[2][8] = "0";
    }
    
    public static void mostrarCarton3(String[][]  carton3) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
         
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 8; j++) {
                if ( carton3[i][j] == "0"){
                     carton3[i][j] = " "; 
                }
                if ( carton3.length > 1){
                    System.out.print(" "+ carton3[i][j]+" |");
                }
                else{
                    System.out.print(" "+ carton3[i][j]+"  |");
                }
            }
            System.out.println("");
        }
    }
    
    
    
    
    
    
    
    public static void armadoCarton4(String[][] carton4){
        carton4[0][0] = "0"; carton4[0][1] = "11"; carton4[0][2] = "0"; carton4[0][3] = "36"; carton4[0][4] = "43"; carton4[0][5] = "0"; carton4[0][6] = "64"; carton4[0][7] = "73"; carton4[0][8] = "0"; 
        carton4[1][0] = "0"; carton4[1][1] = "13"; carton4[1][2] = "21"; carton4[1][3] = "0"; carton4[1][4] = "0"; carton4[1][5] = "51"; carton4[1][6] = "0"; carton4[1][7] = "77"; carton4[1][8] = "84";
        carton4[2][0] = " 5"; carton4[2][1] = "0"; carton4[2][2] = "26"; carton4[2][3] = "0"; carton4[2][4] = "44"; carton4[2][5] = "56"; carton4[2][6] = "0"; carton4[2][7] = "0"; carton4[2][8] = "86";
    }
    
        
    public static void mostrarCarton4(String[][]   carton4) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                                   CARTON 4");
        System.out.println("");
        System.out.println("                            ____________________________________________");
        
        for (int i = 0; i <= 2; i++) {
            System.out.print("                           |");
            for (int j = 0; j <= 8; j++) {
                if (carton4[i][j] == "0"){
                    carton4[i][j] = "  "; 
                }
                if (carton4.length > 1){
                    System.out.print(" "+carton4[i][j]+ " |");
                }else{
                    System.out.print(" "+carton4[i][j]+ "  |");
                }
            } 
                    
            System.out.println("");
        }
        System.out.println("                            ____________________________________________");
    }

    
    
    
    
    
    
    
    
    
    public static void carton_1(){
        String carton1[][] = new String[3][9]; 
        armadoCarton1(carton1); 
        mostrarCarton1(carton1);
    }
    public static void carton_2(){
        String carton2[][] = new String[3][9]; 
        armadoCarton2(carton2); 
        mostrarCarton2(carton2);
        }
    public static void carton_3(){
        String carton3[][] = new String[3][9]; 
        armadoCarton3(carton3); 
        mostrarCarton3(carton3);
        }
    public static void carton_4(){
        String carton4[][] = new String[3][9]; 
        armadoCarton4(carton4); 
        mostrarCarton4(carton4);
        }
}   



