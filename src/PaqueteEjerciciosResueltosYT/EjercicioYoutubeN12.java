
package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        System.out.println(" POR FAVOR INGRESE LA EDAD :");
        edad = sc.nextInt();
        
        if((edad>0)&& (5>=edad) ){
            System.out.println("USTED SE ENCUENTRA EN LA PRIMERA INFANCIA");
        }else if((edad>=6 )&& (11>= edad)){
            System.out.println("USTED SE ENCUENTRA EN LA INFANCIA");
        }else if((edad>=12 )&&(18>=edad)){
            System.out.println("USTED SE ENCUENTRA EN LA  ADOLESCENCIA ");
        }else if((edad>=18)&& (59 >= edad)){
            System.out.println("USTED SE ENCUENTRA EN LA ETAPA DE ADULTO ");
        }if((edad>= 14) && (26>=edad)){
            System.out.println("USTED SE ENCUENTRA EN LA JUVENTUD");
        }else if((edad >=27)&& ( 59>=edad)){
            System.out.println("USTED SE ENCUENTRA EN LA ETAPA DE ADULTO MADURO");
        }else if((edad>=60)){
            System.out.println("USTED SE ENCUENTRA EN LA ETAPA DE ADULTO MAYOR");
        }
        
    }
    
}
