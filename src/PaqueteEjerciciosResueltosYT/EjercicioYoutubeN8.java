package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        double centimetros, metros, kilometros, milimetros, yardas, pie, pulgadas, millas;
        
        System.out.println(" INGRESE LA OPCION QUE DESEA CONVERTIR ");
        System.out.println("----------------------------------------------");
        System.out.println("1. CENTIMETROS A METROS ");     
        System.out.println("2. CENTIMETROS A KILOMETROS ");   
        System.out.println("3. CENTIMETROS A MILIMETROS ");   
        System.out.println("4. CENTIMETROS A YARDAS ");
        System.out.println("5. CENTIMETROS A PIES ");   
        System.out.println("6. CENTIMETROS A PULGADAS ");   
        System.out.println("7. CENTIMETROS A MILLAS ");   
        
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese La Cantidad De Centimetros Que Desea Convertir: ");
                centimetros = sc.nextDouble();
                metros = centimetros * 0.01;
                System.out.println(centimetros+" Centimetros Equivalen A "+metros+" Metros Aproximadamente. ");
                break;
            case 2:
                System.out.println("Ingrese La Cantidad De Centimetros Que Desea Convertir : ");
                centimetros = sc.nextDouble();
                kilometros= centimetros * 0.00001;
                System.out.println(centimetros+" Centimetros Equivalen A "+kilometros+" Kilometros Aproximadamente. ");
                break;
            case 3:
                System.out.println("Ingrese La Cantidad De Centimetros Que Desea Convertir: ");
                centimetros = sc.nextDouble();
                milimetros = centimetros * 10;
                System.out.println(centimetros+" Centimetros Equivalen A "+milimetros+" Milimetros Aproximadamente. ");
                break;
            case 4:
                System.out.println("Ingrese La Cantidad De Centimetros Que Desea Convertir: ");
                centimetros = sc.nextDouble();
                yardas = centimetros * 0.0109 ;
                System.out.println(centimetros+" Centimetros Equivalen A "+yardas+" Yardas Aproximadamente. ");
                break;
            case 5:
                System.out.println("Ingrese La Cantidad De Centimetros Que Desea Convertir: ");
                centimetros = sc.nextDouble();
                pie = centimetros * 0.03;
                System.out.println(centimetros+" Centimetros Equivalen A "+pie+" Pies Aproximadamente. ");
                break;
            case 6:
                System.out.println("Ingrese La Cantidad De Centimetros Que Desea Convertir: ");
                centimetros = sc.nextDouble();
                pulgadas = centimetros * 0.3;
                System.out.println(centimetros+" Centimetros Equivalen A "+pulgadas+" Pulgadas Aproximadamente. ");
                break;
            case 7:
                System.out.println("Ingrese La Cantidad De Centimetros Que Desea Convertir: ");
                centimetros = sc.nextDouble();
                millas = centimetros * 0.0000062137;
                System.out.println(centimetros+" Centimetros Equivalen A "+millas+" Millas Aproximadamente. ");
                break;
        default:
                System.out.println("La Opcion Seleccionada No Es Valida. \n Solo Estan Permitidas (opcion 1,2,3,4,5,6,7)Por Favor Repita el proceso");
        }
        
    }
    
}
