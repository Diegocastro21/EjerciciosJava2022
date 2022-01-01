package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN2a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bisiesto;
        
        System.out.println("POR FAVOR INGRESE EL YEAR QUE DESEA SABER SI ES BISIESTO : ");
        bisiesto = sc.nextInt();
        
        if((bisiesto % 4 == 0 ) && (bisiesto % 100 != 0) || (bisiesto % 400 == 0 ) ) {
            
            System.out.println("EL YEAR "+bisiesto+" INGRESADO ES BISIESTO ");
        }else {
            System.out.println("EL YEAR "+bisiesto+" INGRESADO ES NO ES BISIESTO ");
        }
        
    }
    
}
