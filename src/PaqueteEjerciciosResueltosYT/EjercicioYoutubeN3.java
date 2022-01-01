package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad;
        int manzanasconsumidas;
        int pesodemanzanas;
        int Pesodemanzanas;
        
        System.out.println("POR FAVOR INGRESE  SU EDAD :");
        edad = sc.nextInt();
        
        manzanasconsumidas = edad * 13;
        
        pesodemanzanas = manzanasconsumidas * 4;
        Pesodemanzanas = manzanasconsumidas * 205;
        
        System.out.println("LAS MANZANAS QUE USTED HA CONSUMIDO SON : "+manzanasconsumidas+ " MANZANAS");
        System.out.println("LOS  GRAMOS DE MANZANAS QUE USTED HA CONSUMIDO SON : "+pesodemanzanas+ " GRAMOS");
        System.out.println("LOS  GRAMOS DE MANZANAS QUE USTED HA CONSUMIDO SON ORIGINAL : "+Pesodemanzanas+ " GRAMOS");
    }
    
}
