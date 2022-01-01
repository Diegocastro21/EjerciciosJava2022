package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc,peso , altura , Altura;
        
        System.out.println(" POR FAVOR INGRESE SU PESO EN Kg :");
        peso = sc.nextDouble();
        System.out.println(" POR FAVOR INGRESE SU ALTURA EN METROS :");
        altura = sc.nextDouble();
        
        Altura = altura * altura;
        
        imc = peso/Altura;
        
        if(18.5 >imc && 0 <= imc){
            System.out.println("USTED SE ENCUENTRA EN DELGADEZDES CON BAJO PESO O EN DESNUTRICION ");
        }else if(18.5<= imc && 24.9>= imc){
            System.out.println("USTED SE ENCUENTRA NORMAL ");
        }else if(25.0<=imc && 29.9 >= imc){
            System.out.println("USTED SE ENCUENTRA CON PESO SUPERIOR AL NORMAL ");
        }if(30.0<= imc ){
            System.out.println("USTED SE ENCUENTRA EN OBESIDAD ");
        }
        
    }
    
}
