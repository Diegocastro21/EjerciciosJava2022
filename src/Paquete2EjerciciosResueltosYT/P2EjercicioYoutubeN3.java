package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
import java.util.Random;
public class P2EjercicioYoutubeN3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int veces, dado1, dado2, dobles = 0, par = 0, impar = 0 , dado1_suma = 0, dado2_suma = 0 , doble1 = 0;
        int dado1_numero1 = 0, dado1_numero2 = 0,dado1_numero3 = 0,dado1_numero4 = 0,dado1_numero5 = 0,dado1_numero6 = 0;
        int dado2_numero1 = 0, dado2_numero2 = 0,dado2_numero3 = 0,dado2_numero4 = 0,dado2_numero5 = 0,dado2_numero6 = 0;
        System.out.println("POR FAVOR INGRESE CUANTAS VECES DESEA LANZAR LOS DADOS : ");
        veces = sc.nextInt();
        
        for (int i = 1; i < veces+1; i++) {
            
            dado1 = 1 + rd.nextInt(7 - 1 );
            dado2 = 1 + rd.nextInt(7 - 1 );
            
            System.out.println("LANZAMIENTO "+i+" DEL DADO 1 SALIO : "+dado1);
            System.out.println("LANZAMIENTO "+i+" DEL DADO 2 SALIO : "+dado2);
            
            if (dado1 == dado2) {
                dobles++;
            }
            
            switch(dado1) {
                case 1 -> dado1_numero1++;
                case 2 -> dado1_numero2++;
                case 3 -> dado1_numero3++;
                case 4 -> dado1_numero4++;
                case 5 -> dado1_numero5++;
                case 6 -> dado1_numero6++;
                default -> {
                }
            }
            
            switch (dado2) {
                case 1 -> dado2_numero1++;
                case 2 -> dado2_numero2++;
                case 3 -> dado2_numero3++;
                case 4 -> dado2_numero4++;
                case 5 -> dado2_numero5++;
                case 6 -> dado2_numero6++;
                default -> {
                }
            }
            
            if (dado1 % 2 == 0) {
                par++;
            }else{
                impar++;
            }
            
            if (dado2 % 2 == 0) {
                par++;
            }else{
                impar++;
            }
            
            dado1_suma += dado1;
            dado2_suma += dado2;
            
            if ((dado1 == 1) && (dado2 == 1)){
                doble1 ++;
                if(doble1 == 3){
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("HAZ PERDIDO EN EL INTENTO "+i);
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("--------------------------------------------------------------");
                }
            }    
        }
        System.out.println("-----------------------CALCULANDO...-----------------------------------");
        System.out.println("--------------------------LOS -----------------------------------------");
        System.out.println("-----------------------RESULTADOS--------------------------------------");
        System.out.println("LOS DOBLES QUE SALIERON SON : "+dobles);
        System.out.println("LAS VECES QUE EN EL DADO 1 SALIO N-1 : "+dado1_numero1);
        System.out.println("LAS VECES QUE EN EL DADO 1 SALIO N-2 : "+dado1_numero2);
        System.out.println("LAS VECES QUE EN EL DADO 1 SALIO N-3 : "+dado1_numero3);
        System.out.println("LAS VECES QUE EN EL DADO 1 SALIO N-4 : "+dado1_numero4);
        System.out.println("LAS VECES QUE EN EL DADO 1 SALIO N-5 : "+dado1_numero5);
        System.out.println("LAS VECES QUE EN EL DADO 1 SALIO N-6 : "+dado1_numero6);
        System.out.println("LAS VECES QUE EN EL DADO 2 SALIO N-1 : "+dado2_numero1);
        System.out.println("LAS VECES QUE EN EL DADO 2 SALIO N-2 : "+dado2_numero2);
        System.out.println("LAS VECES QUE EN EL DADO 2 SALIO N-3 : "+dado2_numero3);
        System.out.println("LAS VECES QUE EN EL DADO 2 SALIO N-4 : "+dado2_numero4);
        System.out.println("LAS VECES QUE EN EL DADO 2 SALIO N-5 : "+dado2_numero5);
        System.out.println("LAS VECES QUE EN EL DADO 2 SALIO N-6 : "+dado2_numero6);
        System.out.println("LOS NUMEROS PARES QUE SALIERON SON : "+par);
        System.out.println("LOS NUMEROS IMPARES QUE SALIERON SON : "+impar);
        System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON EN EL DADO 1 SON : "+dado1_suma);
        System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON EN EL DADO 2 SON : "+dado2_suma);
        
    }
    
}
