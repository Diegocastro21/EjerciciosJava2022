package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
import java.util.Random;
public class P2EjercicioYoutubeN12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroingresado1,numeroingresado2,numeroingresado3;
        int numerosecreto1 = 1 + rd.nextInt(10 - 1);
        int numerosecreto2 = 1 + rd.nextInt(10 - 1);
        int numerosecreto3 = 1 + rd.nextInt(10 - 1);
        
        String verde = " VERDE ";
        String rojo = " ROJO ";
        String amarillo = " AMARILLO ";
        
        for (int i = 1; i < 4+1; i++) {
            
            System.out.println("INTENTO NUMERO-"+i);
            System.out.println("-----------------------------------");
            System.out.println("EL PRIMER NUMERO A ADIVINAR : ");
            numeroingresado1 = sc.nextInt();
            System.out.println("EL SEGUNDO NUMERO A ADIVINAR : ");
            numeroingresado2 = sc.nextInt();
            System.out.println("EL TERCER NUMERO A ADIVINAR : ");
            numeroingresado3 = sc.nextInt();
            
            if(numerosecreto1 == numeroingresado1){
                System.out.println("PISTA DEL NUMERO 1 : "+verde);
            }else if(numerosecreto1 < numeroingresado1){
                System.out.println("PISTA DEL NUMERO 1 : "+rojo);
            }else if(numerosecreto1 > numeroingresado1){
                System.out.println("PISTA DEL NUMERO 1 : "+amarillo);
            }
            if(numerosecreto2 == numeroingresado2){
                System.out.println("PISTA DEL NUMERO 2 : "+verde);
            }else if(numerosecreto2 < numeroingresado2){
                System.out.println("PISTA DEL NUMERO 2 : "+rojo);
            }else if(numerosecreto2 > numeroingresado2){
                System.out.println("PISTA DEL NUMERO 2 : "+amarillo);
            }
            if(numerosecreto3 == numeroingresado3){
                System.out.println("PISTA DEL NUMERO 3 : "+verde);
            }else if(numerosecreto3 < numeroingresado3){
                System.out.println("PISTA DEL NUMERO 3 : "+rojo);
            }else if(numerosecreto3 > numeroingresado3){
                System.out.println("PISTA DEL NUMERO 3 : "+amarillo);
            }
            
            
        }
        System.out.println("SI TODAS LAS PISTAS ESTAN EN VERDE FELICIDADES ");
        System.out.println("DE LO CONTRARIO PERDISTES, LOS NUMEROS SECRETOS SON : ");
        System.out.println("NUMERO SECRETO 1 : "+numerosecreto1+"\nNUMERO SECRETO 2 : "+numerosecreto2+"\nNUMERO SECRETO 3 : "+numerosecreto3);
        
        System.out.println("¿DESEA SEGUIR JUGANDO O TERMINAR EL JUEGO? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
        System.out.println("(TERMINAR) o (SEGUIR)");
        String next = sc.nextLine();
        String desicion = sc.nextLine();

        while(desicion.equals("SEGUIR")  || desicion.equals("seguir") ){
            numerosecreto1 = 1 + rd.nextInt(10 - 1);
            numerosecreto2 = 1 + rd.nextInt(10 - 1);
            numerosecreto3 = 1 + rd.nextInt(10 - 1);
            
            for (int i = 1; i < 4+1; i++) {
            
            System.out.println("INTENTO NUMERO-"+i);
            System.out.println("-----------------------------------");
            System.out.println("EL PRIMER NUMERO A ADIVINAR : ");
            numeroingresado1 = sc.nextInt();
            System.out.println("EL SEGUNDO NUMERO A ADIVINAR : ");
            numeroingresado2 = sc.nextInt();
            System.out.println("EL TERCER NUMERO A ADIVINAR : ");
            numeroingresado3 = sc.nextInt();
            
            if(numerosecreto1 == numeroingresado1){
                System.out.println("PISTA DEL NUMERO 1 : "+verde);
            }else if(numerosecreto1 < numeroingresado1){
                System.out.println("PISTA DEL NUMERO 1 : "+rojo);
            }else if(numerosecreto1 > numeroingresado1){
                System.out.println("PISTA DEL NUMERO 1 : "+amarillo);
            }
            if(numerosecreto2 == numeroingresado2){
                System.out.println("PISTA DEL NUMERO 2 : "+verde);
            }else if(numerosecreto2 < numeroingresado2){
                System.out.println("PISTA DEL NUMERO 2 : "+rojo);
            }else if(numerosecreto2 > numeroingresado2){
                System.out.println("PISTA DEL NUMERO 2 : "+amarillo);
            }
            if(numerosecreto3 == numeroingresado3){
                System.out.println("PISTA DEL NUMERO 3 : "+verde);
            }else if(numerosecreto3 < numeroingresado3){
                System.out.println("PISTA DEL NUMERO 3 : "+rojo);
            }else if(numerosecreto3 > numeroingresado3){
                System.out.println("PISTA DEL NUMERO 3 : "+amarillo);
            }
            
            
        }
        System.out.println("SI TODAS LAS PISTAS ESTAN EN VERDE FELICIDADES ");
        System.out.println("DE LO CONTRARIO PERDISTES, LOS NUMEROS SECRETOS SON : ");
        System.out.println("NUMERO SECRETO 1 : "+numerosecreto1+"\nNUMERO SECRETO 2 : "+numerosecreto2+"\nNUMERO SECRETO 3 : "+numerosecreto3);
        
        System.out.println("¿DESEA SEGUIR JUGANDO O TERMINAR EL JUEGO? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
        System.out.println("(TERMINAR) o (SEGUIR)");
        next = sc.nextLine();
         desicion = sc.nextLine();
            
            
        }
    }
    
}
