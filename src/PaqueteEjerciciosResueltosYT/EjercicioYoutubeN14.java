package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesolibras, alturacentimetros;
        double imc,peso , altura , Altura;
        
        System.out.println(" POR FAVOR INGRESE SU PESO EN LIBRAS :");
        pesolibras = sc.nextDouble();
        System.out.println(" POR FAVOR INGRESE SU ALTURA EN CENTIMETROS :");
        alturacentimetros = sc.nextDouble();
        
        peso = pesolibras * 0.453592;
        altura = alturacentimetros * 0.01;
        Altura = altura * altura;
        
        imc = peso / Altura;
        
        
        
        if(18.5 >imc && 0 <= imc){
            System.out.println("USTED SE ENCUENTRA EN DELGADEZDES CON BAJO PESO O EN DESNUTRICION "+imc);
        }else if(18.5<= imc && 24.9>= imc){
            System.out.println("USTED SE ENCUENTRA NORMAL "+imc);
        }else if(25.0<=imc && 29.9 >= imc){
            System.out.println("USTED SE ENCUENTRA CON PESO SUPERIOR AL NORMAL "+imc);
        }if(30.0<= imc ){
            System.out.println("USTED SE ENCUENTRA EN OBESIDAD "+imc);
        }
    }
    
}
