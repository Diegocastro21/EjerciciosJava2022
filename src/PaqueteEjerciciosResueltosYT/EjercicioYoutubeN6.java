package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        
        System.out.println(" POR FAVOR INGRESE EL NUMERO 1 : ");
        numero1 = sc.nextInt();
        System.out.println(" POR FAVOR INGRESE EL NUMERO 2 : ");
        numero2 = sc.nextInt();
        System.out.println(" POR FAVOR INGRESE EL NUMERO 3 : ");
        numero3 = sc.nextInt();
        
        if(numero1>numero2 && numero2>numero3){
        System.out.println("LOS NUMERO QUEDARIAN ORDENADOS DE ESTA MANERA \n "+numero1+" , "+numero2+" , "+numero3);
        }else if (numero1 > numero3 && numero3 > numero2){
            System.out.println("LOS NUMERO QUEDARIAN ORDENADOS DE ESTA MANERA \n "+numero1+" , "+numero3+" , "+numero2);
        }else if(numero2 > numero1 && numero1 >numero3){
            System.out.println("LOS NUMERO QUEDARIAN ORDENADOS DE ESTA MANERA \n "+numero2+" , "+numero1+" , "+numero3);
        }else if(numero2 > numero3 && numero3>numero1){
            System.out.println("LOS NUMERO QUEDARIAN ORDENADOS DE ESTA MANERA \n "+numero2+" , "+numero3+" , "+numero1);
        }else if(numero3>numero1 && numero1 > numero2){
            System.out.println("LOS NUMERO QUEDARIAN ORDENADOS DE ESTA MANERA \n "+numero3+" , "+numero1+" , "+numero2);
        }else if(numero3 > numero2 && numero2 > numero1){
            System.out.println("LOS NUMERO QUEDARIAN ORDENADOS DE ESTA MANERA \n "+numero3+" , "+numero2+" , "+numero1);
        }
        
       
    }
    
}
