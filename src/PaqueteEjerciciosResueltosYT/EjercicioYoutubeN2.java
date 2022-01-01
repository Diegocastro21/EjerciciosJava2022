package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double base;
        double altura;
        double milimetros;
        double metros;
        double centimetros;
        
        System.out.println("POR FAVOR INGRESE LA BASE DEL TRIANGULO EN MILIMETROS : ");
        base = sc.nextDouble();
        System.out.println("POR FAVOR INGRESE LA ALTURA DEL TRIANGULO EN MILIMETROS : ");
        altura = sc.nextDouble();
        
        milimetros = base * altura / 2;
        
        centimetros = milimetros * 0.1;
        
        metros = centimetros * 0.01;
        
        System.out.println("EL AREA DEL TRIANGULO ES : "+milimetros+ " MILIMETROS");
        System.out.println("EL AREA DEL TRIANGULO ES : "+centimetros+ " CENTIMETROS");
        System.out.println("EL AREA DEL TRIANGULO ES : "+metros+ " METROS");
        
        
        
        
        
    }
    
}
