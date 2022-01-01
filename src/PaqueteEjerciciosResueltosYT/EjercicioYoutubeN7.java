package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metroscubicos;
        double gramos;
        double miligramos;
        double kilogramos;
        double hectogramos;
        double decigramos;
        double centigramos;
        double librasmetricas;
        double decagramos;
        double toneladas;
        double onzas;
        int opcion;
        
        System.out.println("INGRESE A CONTINUACION LA OPCION QUE DESEA: ");
        System.out.println("----------------------------------------------");
        System.out.println("|1| METROS CUBICOS A GRAMOS. ");
        System.out.println("|2| GRAMOS A MILIGRAMOS. ");
        System.out.println("|3| GRAMOS A KILOGRAMOS. ");
        System.out.println("|4| HECTOGRAMOS A GRAMOS. ");
        System.out.println("|5| KILOGRAMOS A HECTOGRAMOS. ");
        System.out.println("|6| GRAMOS A DECIGRAMOS. ");
        System.out.println("|7| GRAMOS A CENTIGRAMOS. ");
        System.out.println("|8| TONELADAS A KILOGRAMOS.");
        System.out.println("|9| KILOGRAMOS A DECAGRAMOS.");
        System.out.println("|10| KILOGRAMOS A LIBRAS METRICAS. ");
        System.out.println("|11| ONZAS A KILOGRAMOS. ");
        System.out.println("|12| KILOGRAMOS A DECIGRAMOS. ");
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                metroscubicos = sc.nextDouble();
                gramos = metroscubicos * 1000000;
                System.out.println(metroscubicos+" METROS CUBICOS EQUIVALEN A "+gramos+" GRAMOS APROXIMADAMENTE ");
                break;
            case 2:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                gramos = sc.nextDouble();
                miligramos = gramos * 1000;
                System.out.println(gramos+" GRAMOS EQUIVALEN A "+miligramos+" MILIGRAMOS APROXIMADAMENTE ");
                break;
            case 3:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                gramos = sc.nextDouble();
                kilogramos = gramos * 0.001 ;
                System.out.println(gramos+" GRAMOS EQUIVALEN A "+kilogramos+" KILOGRAMOS APROXIMADAMENTE ");
                break;
            case 4:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                hectogramos = sc.nextDouble();
                gramos = hectogramos * 100;
                System.out.println(hectogramos+" HECTOGRAMOS EQUIVALEN A "+gramos+" GRAMOS APROXIMADAMENTE ");
                break;    
            case 5:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                kilogramos = sc.nextDouble();
                hectogramos = kilogramos * 10;
                System.out.println(kilogramos+" KILOGRAMOS EQUIVALEN A "+hectogramos+" HECTOGRAMOS APROXIMADAMENTE ");
                break;    
            case 6:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                gramos = sc.nextDouble();
                decigramos = gramos * 10;
                System.out.println(gramos+" GRAMOS EQUIVALEN A "+decigramos+" DECIGRAMOS APROXIMADAMENTE ");
                break;    
            case 7:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                gramos = sc.nextDouble();
                centigramos = gramos * 100;
                System.out.println(gramos+" GRAMOS EQUIVALEN A "+centigramos+" CENTIGRAMOS APROXIMADAMENTE ");
                break;    
            case 8:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                toneladas = sc.nextDouble();
                kilogramos = toneladas * 1000;
                System.out.println(toneladas+" TONELADAS EQUIVALEN A "+kilogramos+" KILOGRAMOS APROXIMADAMENTE ");
                break;    
            case 9:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                kilogramos = sc.nextDouble();
                decagramos = kilogramos * 100;
                System.out.println(kilogramos+" KILOGRAMOS EQUIVALEN A "+decagramos+" DECAGRAMOS APROXIMADAMENTE ");
                break;    
            case 10:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                kilogramos = sc.nextDouble();
                librasmetricas = kilogramos * 2;
                System.out.println(kilogramos+" KILOGRAMOS EQUIVALEN A "+librasmetricas+" LIBRAS METRICAS APROXIMADAMENTE ");
                break;
            case 11:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                onzas = sc.nextDouble();
                kilogramos = onzas * 0.029;
                System.out.println(onzas+" ONZAS EQUIVALEN A "+kilogramos+" KILOGRAMOS APROXIMADAMENTE ");
                break;
            case 12:
                System.out.println("INGRESE LA CANTIDAD QUE DESEA CONVERTIR ");
                kilogramos = sc.nextDouble();
                decigramos = kilogramos * 10000;
                System.out.println(kilogramos+" KILOGRAMOS EQUIVALEN A "+decigramos+" DECIGRAMOS APROXIMADAMENTE ");
                break;
            
            default:
                System.out.println("LA OPCION SELECCIONADA NO ES VALIDA \n POR FAVOR ELIGA UNA LAS OPCIONES QUE SE PRESENTARON CON ANTERIORIDAD");
        }
        

        
    }
    
}
