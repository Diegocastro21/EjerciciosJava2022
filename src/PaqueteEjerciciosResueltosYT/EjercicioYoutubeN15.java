package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double  onzadeoro ,kilos;
        double kilosconprecio , preciodelkilo;
        
        System.out.println("INGRESE EN CUANTO ESTA EL PRECIO DE UNA ONZA DE  ORO : ");
        onzadeoro = sc.nextDouble();
        
        preciodelkilo = onzadeoro / 32.150;
        System.out.println("POR FAVOR INGRESE CUANTOS KILOS DESEA CONSULTAR EL PRECIO : ");
        kilos = sc.nextDouble();
        
        kilosconprecio = preciodelkilo * kilos;
        
        System.out.println(" EL DINERO QUE CUESTA "+kilos+" Kg DE ORO ES DE "+kilosconprecio);
        
                
        
        
        
    }
    
}
