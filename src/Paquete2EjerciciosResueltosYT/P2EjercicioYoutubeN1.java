package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
import java.util.Random;
public class P2EjercicioYoutubeN1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int dado;
        System.out.println("POR FAVOR INGRESE CUANTOS LANZAMIENTOS REALIZARA EL DADO : ");
        dado = sc.nextInt();
        for (int i = 1; i < dado+1; i++) {
            
            int randomInt = 1 + rd.nextInt(7 - 1);
            
            System.out.println("LANZAMIENTO "+i+" SALIO : "+randomInt);
        }
    }
    
}
