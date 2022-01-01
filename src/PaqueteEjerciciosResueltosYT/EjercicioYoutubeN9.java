package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN9 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double centimetros, edad, metros;
       
       System.out.println(" POR FAVOR INGRESE SU EDAD ");
       edad = sc.nextDouble();
       
       centimetros = edad * 6;
       
       metros = centimetros * 0.01;
       
       System.out.println("EL TAMAÑO DE SU CABELLERA SERIA DE "+metros+" METROS");
        
    }
    
}
