package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
import java.util.Random;
public class P2EjercicioYoutubeN2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int veces, lanzamiento1, lanzamiento2;
        
        System.out.println("POR FAVOR INGRESE CUANTAS VECES DESEA LANZAR LOS DADOS : ");
        veces = sc.nextInt();
        
        for (int i = 0; i < veces+1; i++) {
            
            lanzamiento1 = 1 + rd.nextInt(7 - 1 );
            lanzamiento2 = 1 + rd.nextInt(7 - 1 );
            
            System.out.println("LANZAMIENTO "+i+" DEL DADO 1 SALIO : "+lanzamiento1);
            System.out.println("LANZAMIENTO "+i+" DEL DADO 2 SALIO : "+lanzamiento2);
        }
    }
    
}
