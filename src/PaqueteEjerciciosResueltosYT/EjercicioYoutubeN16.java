package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double iluminacion,kilovoltios, voltios, naranjas,pesonaranjas,pesotoneladas;
        
        
        System.out.println("POR FAVOR INGRESE CUANTOS KILOVOLTIOS NECESITA EL SISTEMA DE ILUMINACION ");
        kilovoltios = sc.nextDouble();
        
        iluminacion = kilovoltios * 1000;
        voltios = iluminacion;
        naranjas = voltios / 0.05;
        pesonaranjas = naranjas * 6;
        pesotoneladas = pesonaranjas / 1000000;
        
        System.out.println("EL NUMERO DE NARANJAS NECESITADAS PARA EL SISTEMA DE ILUMINACION SON : "+naranjas);
        System.out.println("EL PESO EN TONELADAS DE NARANJAS ES DE : "+pesotoneladas);
        
    }
    
}
