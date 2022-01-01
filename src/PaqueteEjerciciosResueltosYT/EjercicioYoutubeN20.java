package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pies,kilometros,minutos;
        
        System.out.println("POR FAVOR INGRESE CUANTOS PIES VA A RECORRER : ");
        pies = sc.nextInt();
       
        kilometros = pies / 3281;
        minutos = (kilometros * 60)/120;
        
        System.out.println("LA DISTANCIA INGRESADA EN PIES FUE : "+pies);
        System.out.println("LA DISTANCIA EN KILOMETROS ES : "+kilometros);
        System.out.println("LOS MINUTOS QUE SE NECESITA PARA LLEGAR AL DESTINO EN MINUTOS ES : "+minutos);
        
    }
    
}
