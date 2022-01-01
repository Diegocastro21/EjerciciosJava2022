package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double dolares,pesos,euros;
        
        System.out.println("POR FAVOR ELIGA CUAL OPCION DESEA :");
        System.out.println("----------------------------------------");
        System.out.println("1. DOLARES A PESOS COLOMBIANOS ");
        System.out.println("2. DOLARES A EUROS ");
        System.out.println("3. EUROS A PESOS COLOMBIANOS");
        System.out.println("4. EUROS A DOLARES");
        System.out.println("5. PESOS COLOMBIANOS A DOLARES");
        System.out.println("6. PESOS COLOMBIANOS A EUROS");
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("INGRESE LA CANTIDAD DE DINERO : ");
                dolares = sc.nextDouble();
                pesos = dolares * 3928.49;
                System.out.println("$"+dolares+" DOLARES EQUIVALEN A $"+pesos+" PESOS COLOMBIANOS");
                break;
            case 2:
                System.out.println("INGRESE LA CANTIDAD DE DINERO : ");
                dolares = sc.nextDouble();
                euros = dolares * 0.89;
                System.out.println("$"+dolares+" DOLARES EQUIVALEN A $"+euros+" EUROS");
                break;
            case 3:
                System.out.println("INGRESE LA CANTIDAD DE DINERO : ");
                euros = sc.nextDouble();
                pesos = euros * 4422.32;
                System.out.println("$"+euros+" EUROS EQUIVALEN A $"+pesos+" PESOS COLOMBIANOS");
                break;
            case 4:
                System.out.println("INGRESE LA CANTIDAD DE DINERO : ");
                euros = sc.nextDouble();
                dolares = euros * 1.13;
                System.out.println("$"+euros+" EUROS EQUIVALEN A $"+dolares+" DOLARES");
                break;
            case 5:
                System.out.println("INGRESE LA CANTIDAD DE DINERO : ");
                pesos = sc.nextDouble();
                dolares = pesos * 0.00026;
                System.out.println("$"+pesos+" PESOS COLOMBIANOS EQUIVALEN A $"+dolares+" DOLARES");
                break;
            case 6:
                System.out.println("INGRESE LA CANTIDAD DE DINERO : ");
                pesos = sc.nextDouble();
                euros = pesos * 0.00023;
                System.out.println("$"+pesos+" PESOS COLOMBIANOS EQUIVALEN A $"+euros+" EUROS");
                break;
        }
        
        
        
        
    }
    
}
