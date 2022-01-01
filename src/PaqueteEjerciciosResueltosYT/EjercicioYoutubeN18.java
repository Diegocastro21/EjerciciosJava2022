package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN18 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km,milla,costocombustible,litros,galones,galones1,yardas,pies,tanqueadasfinal;
        System.out.println("POR FAVOR INGRESE DE CUANTOS KM SERA EL RECORRIDO : ");
        km = sc.nextDouble();
        
        milla = km / 1.609;       
        litros = km * 15 / 100;
        galones = litros / 3.785;
        galones1 = km * 4 /100;
        costocombustible = km * 160 / 100;
        yardas = milla * 1760;
        tanqueadasfinal = km / 100;
        pies = (milla / tanqueadasfinal) * 5280;
        
        System.out.println("EL NUMERO DE GALONES NECESARIOS FUERON : "+galones);
        System.out.println("2DA MANERA EL NUMERO DE GALONES NECESARIOS FUERON  : "+galones1);
        System.out.println("EL COSTO TOTAL DE COMBUSTIBLE FUE : "+costocombustible);
        System.out.println("EL COSTO POR CADA YARDA RECORRIDA ES DE : "+costocombustible+ " Y LA DISTANCIA RECORRIDA EN YARDAS ES DE : "+yardas);
        System.out.println("LAS TANQUEADAS QUE SE HICIERON FUERON : "+tanqueadasfinal);
        System.out.println("LOS PIES QUE SE NECESITARON PARA HACER CADA TANQUEADA FUERON : "+pies);
        
        
        
        
           
        
    }
    
}
