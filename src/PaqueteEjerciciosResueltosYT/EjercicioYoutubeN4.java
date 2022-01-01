package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double altura;
        double base;
        double areaenmetros;
        double areaencentimetros;
        double areaenmilimetros;
        
        System.out.println("POR FAVOR INGRESE LA BASE DEL RECTANGULO EN METROS :");
        base = sc.nextDouble();
        System.out.println("POR FAVOR INGRESE LA ALTURA DEL RECTANGULO EN METROS :");
        altura = sc.nextDouble();
        
        areaenmetros = base * altura;
        
        areaencentimetros = areaenmetros * 100;
        
        areaenmilimetros = areaenmetros * 1000;
        
        System.out.println("EL AREA DEL RECTANGULO ES : "+areaenmetros+ " M");
        System.out.println("EL AREA DEL RECTANGULO ES : "+areaencentimetros+ " CM");
        System.out.println("EL AREA DEL RECTANGULO ES : "+areaenmilimetros+ " MM");
        
    }
    
}
