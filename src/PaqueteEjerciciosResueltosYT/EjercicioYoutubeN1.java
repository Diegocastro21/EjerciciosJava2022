package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double estatura;
        
        System.out.println("POR FAVOR INGRESE SU NOMBRE : ");
        nombre = sc.nextLine();
        System.out.println("POR FAVRO INGRESE SU EDAD : ");
        edad = sc.nextInt();
        System.out.println("POR FAVRO INGRESE SU ESTATURA: ");
        estatura = sc.nextDouble();
        
        System.out.println("USTED SE LLAMA "+nombre+ " TIENE "+edad+" YEARS Y MIDE "+estatura+ " METROS");
        
        
      
    }
    
}
