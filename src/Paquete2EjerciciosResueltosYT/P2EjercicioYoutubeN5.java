package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
import java.util.Random;
public class P2EjercicioYoutubeN5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int jugadores, veceslanzamientos,numeroperdedor,repetirperdedor;
        System.out.println("POR FAVOR INGRESE CUANTOS JUGADORES VAN A JUGAR : ");
        jugadores = sc.nextInt();
        System.out.println("POR FAVOR INGRESE CUANTOS LANZAMIENTOS SE VAN A REALIZAR : ");
        veceslanzamientos = sc.nextInt();
        System.out.println("CUAL ES EL NUMERO QUE AL SALIR VARIAS VECES EL JUGADOR PERDERA : ");
        numeroperdedor = sc.nextInt();
        System.out.println("CUANTAS VECES DEBE SALIR EL NUMERO PARA PERDER : ");
        repetirperdedor = sc.nextInt();
        
        for (int o = 1 ; o < jugadores+1; o++) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("EL JUGADOR N-"+o+" COMENZARA A LANZAR LOS DADOS");
            System.out.println("-------------------------------------------------------------\n");
            int  dado1, dado2, dobles = 0, par = 0, impar = 0 , dado1_suma = 0, dado2_suma = 0 , doble1 = 0;
            int dado1_numero1 = 0, dado1_numero2 = 0,dado1_numero3 = 0,dado1_numero4 = 0,dado1_numero5 = 0,dado1_numero6 = 0;
            int dado2_numero1 = 0, dado2_numero2 = 0,dado2_numero3 = 0,dado2_numero4 = 0,dado2_numero5 = 0,dado2_numero6 = 0;
            int numero1=0,numero2=0,numero3=0,numero4=0,numero5=0,numero6=0, numeromenor=0,numeromayor=0;
            int promedio_dado1 = 0 ,promedio_dado2 = 0, parejaigualn1 = 0,parejaigualn2=0,parejaigualn3=0,parejaigualn4=0,parejaigualn5=0,parejaigualn6=0;
            int parejarepetida1y2=0,parejarepetida1y3=0,parejarepetida1y4=0,parejarepetida1y5=0,parejarepetida1y6=0;
            int parejarepetida2y3=0,parejarepetida2y4=0,parejarepetida2y5=0,parejarepetida2y6=0;
            int parejarepetida3y4=0,parejarepetida3y5=0,parejarepetida3y6=0;
            int parejarepetida4y5=0,parejarepetida4y6=0;
            int parejarepetida5y6=0 , sumaparejasrepetidas = 0 , sumaparejasiguales = 0;
            for (int i = 1; i < veceslanzamientos+1; i++) {
                
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

                if ((dado1 == numeroperdedor) && (dado2 == numeroperdedor)){
                    doble1 ++;
                    if(doble1 == repetirperdedor){
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("HAZ PERDIDO EN EL INTENTO "+i);
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("--------------------------------------------------------------");
                    }
                }
                if ((dado1 == 1) && (dado2 == 1)){
                    parejaigualn1++;
                }else if((dado1 == 2) && (dado2 == 2)){
                    parejaigualn2++;
                }else if((dado1 == 3) && (dado2 == 3)){
                    parejaigualn3++;
                }else if((dado1 == 4) && (dado2 == 4)){
                    parejaigualn4++;
                }else if((dado1 == 5) && (dado2 == 5)){
                    parejaigualn5++;
                }else if((dado1 == 6) && (dado2 == 6)){
                    parejaigualn6++;
                }
                
                sumaparejasiguales = parejaigualn1 + parejaigualn2 + parejaigualn3 + parejaigualn4 + parejaigualn5 + parejaigualn6;
                
                
                if ((dado1 == 1) && (dado2 == 2) || (dado1 == 2) && (dado2 == 1 ) ){
                    parejarepetida1y2++;
                }else if((dado1 == 1) && (dado2 == 3) || (dado1 == 3) && (dado2 == 1 ) ){
                    parejarepetida1y3++;
                }else if((dado1 == 1) && (dado2 == 4) || (dado1 == 4) && (dado2 == 1 ) ){
                    parejarepetida1y4++;
                }else if((dado1 == 1) && (dado2 == 5) || (dado1 == 5) && (dado2 == 1 ) ){
                    parejarepetida1y5++;
                }else if((dado1 == 1) && (dado2 == 6) || (dado1 == 6) && (dado2 == 1 ) ){
                    parejarepetida1y6++;
                }else if((dado1 == 2) && (dado2 == 3) || (dado1 == 3) && (dado2 == 2 ) ){
                    parejarepetida2y3++;
                }else if((dado1 == 2) && (dado2 == 4) || (dado1 == 4) && (dado2 == 2 ) ){
                    parejarepetida2y4++;
                }else if((dado1 == 2) && (dado2 == 5) || (dado1 == 5) && (dado2 == 2 ) ){
                    parejarepetida2y5++;
                }else if((dado1 == 2) && (dado2 == 6) || (dado1 == 6) && (dado2 == 2 ) ){
                    parejarepetida2y6++;
                }else if((dado1 == 3) && (dado2 == 4) || (dado1 == 4) && (dado2 == 3 ) ){
                    parejarepetida3y4++;
                }else if((dado1 == 3) && (dado2 == 5) || (dado1 == 5) && (dado2 == 3 ) ){
                    parejarepetida3y5++;
                }else if((dado1 == 3) && (dado2 == 6) || (dado1 == 6) && (dado2 == 3 ) ){
                    parejarepetida3y6++;
                }else if((dado1 == 4) && (dado2 == 5) || (dado1 == 5) && (dado2 == 4 ) ){
                    parejarepetida4y5++;
                }else if((dado1 == 4) && (dado2 == 6) || (dado1 == 6) && (dado2 == 4 ) ){
                    parejarepetida4y6++;
                }else if((dado1 == 5) && (dado2 == 6 ) || (dado1 == 6) && (dado2 == 5 ) ){
                    parejarepetida5y6++;
                }
                
                sumaparejasrepetidas = parejarepetida1y2 + parejarepetida1y3+ parejarepetida1y4+ parejarepetida1y5 + parejarepetida1y6 + parejarepetida2y3 + parejarepetida2y4 + parejarepetida2y5 + parejarepetida2y6 + parejarepetida3y4 + parejarepetida3y5 + parejarepetida3y6 + parejarepetida4y5 + parejarepetida4y6 + parejarepetida5y6;
                
                
                       
                numero1 = dado1_numero1 + dado2_numero1;
                numero2 = dado1_numero2 + dado2_numero2;
                numero3 = dado1_numero3 + dado2_numero3;
                numero4 = dado1_numero4 + dado2_numero4;
                numero5 = dado1_numero5 + dado2_numero5;
                numero6 = dado1_numero6 + dado2_numero6;
                
                for (int j = 0; j < 6+1; j++) {
                    
                    if(j==0){
                        numeromenor=numero1;
                        numeromenor=numero2;
                        numeromenor=numero3;
                        numeromenor=numero4;
                        numeromenor=numero5;
                        numeromenor=numero6;
                    }else if(numero1<numeromenor){
                        numeromenor=numero1;
                    }else if(numero2<numeromenor){
                        numeromenor=numero2;
                    }else if(numero3<numeromenor){
                        numeromenor=numero3;
                    }else if(numero4<numeromenor){
                        numeromenor=numero4;
                    }else if(numero5<numeromenor){
                        numeromenor=numero5;
                    }else if(numero6<numeromenor){
                        numeromenor=numero6;
                    }
                    if(numero1>numeromayor){
                        numeromayor=numero1;
                    }else if(numero2>numeromayor){
                        numeromayor=numero2;
                    }else if(numero3>numeromayor){
                        numeromayor=numero3;
                    }else if(numero4>numeromayor){
                        numeromayor=numero4;
                    }else if(numero5>numeromayor){
                        numeromayor=numero5;
                    }else if(numero6>numeromayor){
                        numeromayor=numero6;
                    }
                }
                promedio_dado1 = dado1_suma / 50 ;
                promedio_dado2 = dado2_suma / 50 ;
            }
            System.out.println("\n---------------CALCULANDO...-------------------------");
            System.out.println("------------------LOS--------------------------------");
            System.out.println("---------------RESULTADOS----------------------------\n");
            System.out.println("LOS DOBLES QUE SALIERON SON : "+dobles);
            System.out.println("LAS VECES QUE SALIO CADA NUMERO FUE : ");
            System.out.println("------------- DADO N-1 -------------");
            System.out.println("NUMERO 1 : "+dado1_numero1);
            System.out.println("NUMERO 2 : "+dado1_numero2);
            System.out.println("NUMERO 3 : "+dado1_numero3);
            System.out.println("NUMERO 4 : "+dado1_numero4);
            System.out.println("NUMERO 5 : "+dado1_numero5);
            System.out.println("NUMERO 6 : "+dado1_numero6);
            System.out.println("------------- DADO N-2 -------------");
            System.out.println("NUMERO 1 : "+dado2_numero1);
            System.out.println("NUMERO 2 : "+dado2_numero2);
            System.out.println("NUMERO 3 : "+dado2_numero3);
            System.out.println("NUMERO 4 : "+dado2_numero4);
            System.out.println("NUMERO 5 : "+dado2_numero5);
            System.out.println("NUMERO 6 : "+dado2_numero6);
            System.out.println("LOS NUMEROS PARES QUE SALIERON SON : "+par);
            System.out.println("LOS NUMEROS IMPARES QUE SALIERON SON : "+impar);
            System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON \nEN EL DADO N-1 ES : "+dado1_suma);
            System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON \nEN EL DADO N-2 ES : "+dado2_suma);
            System.out.println("NUMERO 1 : "+numero1);
            System.out.println("NUMERO 2 : "+numero2);
            System.out.println("NUMERO 3 : "+numero3);
            System.out.println("NUMERO 4 : "+numero4);
            System.out.println("NUMERO 5 : "+numero5);
            System.out.println("NUMERO 6 : "+numero6);
            System.out.println("EL NUMERO QUE MENOS VECES SALIO FUE : "+numeromenor);
            System.out.println("EL NUMERO QUE MAS VECES SALIO FUE : "+numeromayor);
            System.out.println("EL PROMEDIO DE SALIDAS DEL DADO 1 ES : "+promedio_dado1);
            System.out.println("EL PROMEDIO DE SALIDAS DEL DADO 2 ES : "+promedio_dado2);
            System.out.println("NUMERO DE VECES QUE SE REPITIERON LAS PAREJAS : \n");
            System.out.println("PAREJA (1,2) : "+parejarepetida1y2+"  - PAREJA (1,3) : "+parejarepetida1y3+"  - PAREJA (1,4) : "+parejarepetida1y4);
            System.out.println("PAREJA (1,5) : "+parejarepetida1y5+"  - PAREJA (1,6) : "+parejarepetida1y6+"  - PAREJA (2,3) : "+parejarepetida2y3);
            System.out.println("PAREJA (2,4) : "+parejarepetida2y4+"  - PAREJA (2,5) : "+parejarepetida2y5+"  - PAREJA (2,6) : "+parejarepetida2y6);
            System.out.println("PAREJA (3,4) : "+parejarepetida3y4+"  - PAREJA (3,5) : "+parejarepetida3y5+"  - PAREJA (3,6) : "+parejarepetida3y6);
            System.out.println("PAREJA (4,5) : "+parejarepetida4y5+"  - PAREJA (4,6) : "+parejarepetida4y6+"  - PAREJA (5,6) : "+parejarepetida5y6+"\n");
            System.out.println("EL TOTAL DE PAREJAS REPETIDAS FUE : \n"+sumaparejasrepetidas);
            System.out.println("PAREJA (1,1) : "+parejaigualn1+"  - PAREJA (2,2) : "+parejaigualn2+"  - PAREJA (3,3) : "+parejaigualn3);
            System.out.println("PAREJA (4,4) : "+parejaigualn4+"  - PAREJA (5,5) : "+parejaigualn5+"  - PAREJA (6,6) : "+parejaigualn6+"\n");
            System.out.println("EL TOTAL DE PAREJAS IGUALES FUE : "+sumaparejasiguales);
            
            System.out.println("¿DESEA SEGUIR JUGANDO O TERMINAR EL JUEGO? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
            System.out.println("(TERMINAR) o (SEGUIR)");
            String desicion = sc.nextLine();
            
            while(desicion.equals("SEGUIR")  || desicion.equals("seguir") ){
                
                for ( o = 1 ; o < jugadores+1; o++) {
                      dobles = 0; par = 0; impar = 0 ; dado1_suma = 0; dado2_suma = 0 ; doble1 = 0;
                     dado1_numero1 = 0; dado1_numero2 = 0;dado1_numero3 = 0;dado1_numero4 = 0;dado1_numero5 = 0;dado1_numero6 = 0;
                     dado2_numero1 = 0; dado2_numero2 = 0;dado2_numero3 = 0;dado2_numero4 = 0;dado2_numero5 = 0;dado2_numero6 = 0;
                     numero1=0;numero2=0;numero3=0;numero4=0;numero5=0;numero6=0; numeromenor=0;numeromayor=0;
                     promedio_dado1 = 0 ;promedio_dado2 = 0; parejaigualn1 = 0;parejaigualn2=0;parejaigualn3=0;parejaigualn4=0;parejaigualn5=0;parejaigualn6=0;
                     parejarepetida1y2=0;parejarepetida1y3=0;parejarepetida1y4=0;parejarepetida1y5=0;parejarepetida1y6=0;
                     parejarepetida2y3=0;parejarepetida2y4=0;parejarepetida2y5=0;parejarepetida2y6=0;
                     parejarepetida3y4=0;parejarepetida3y5=0;parejarepetida3y6=0;
                     parejarepetida4y5=0;parejarepetida4y6=0;
                     parejarepetida5y6=0 ; sumaparejasrepetidas = 0 ; sumaparejasiguales = 0;
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("EL JUGADOR N-"+o+" COMENZARA A LANZAR LOS DADOS");
                    System.out.println("-------------------------------------------------------------\n");
                    
                        for (int i = 1; i < 50+1; i++) {

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
                            
                            if ((dado1 == 1) && (dado2 == 1)){
                                parejaigualn1++;
                            }else if((dado1 == 2) && (dado2 == 2)){
                                parejaigualn2++;
                            }else if((dado1 == 3) && (dado2 == 3)){
                                parejaigualn3++;
                            }else if((dado1 == 4) && (dado2 == 4)){
                                parejaigualn4++;
                            }else if((dado1 == 5) && (dado2 == 5)){
                                parejaigualn5++;
                            }else if((dado1 == 6) && (dado2 == 6)){
                                parejaigualn6++;
                            }

                            sumaparejasiguales = parejaigualn1 + parejaigualn2 + parejaigualn3 + parejaigualn4 + parejaigualn5 + parejaigualn6;


                            if ((dado1 == 1) && (dado2 == 2) || (dado1 == 2) && (dado2 == 1 ) ){
                                parejarepetida1y2++;
                            }else if((dado1 == 1) && (dado2 == 3) || (dado1 == 3) && (dado2 == 1 ) ){
                                parejarepetida1y3++;
                            }else if((dado1 == 1) && (dado2 == 4) || (dado1 == 4) && (dado2 == 1 ) ){
                                parejarepetida1y4++;
                            }else if((dado1 == 1) && (dado2 == 5) || (dado1 == 5) && (dado2 == 1 ) ){
                                parejarepetida1y5++;
                            }else if((dado1 == 1) && (dado2 == 6) || (dado1 == 6) && (dado2 == 1 ) ){
                                parejarepetida1y6++;
                            }else if((dado1 == 2) && (dado2 == 3) || (dado1 == 3) && (dado2 == 2 ) ){
                                parejarepetida2y3++;
                            }else if((dado1 == 2) && (dado2 == 4) || (dado1 == 4) && (dado2 == 2 ) ){
                                parejarepetida2y4++;
                            }else if((dado1 == 2) && (dado2 == 5) || (dado1 == 5) && (dado2 == 2 ) ){
                                parejarepetida2y5++;
                            }else if((dado1 == 2) && (dado2 == 6) || (dado1 == 6) && (dado2 == 2 ) ){
                                parejarepetida2y6++;
                            }else if((dado1 == 3) && (dado2 == 4) || (dado1 == 4) && (dado2 == 3 ) ){
                                parejarepetida3y4++;
                            }else if((dado1 == 3) && (dado2 == 5) || (dado1 == 5) && (dado2 == 3 ) ){
                                parejarepetida3y5++;
                            }else if((dado1 == 3) && (dado2 == 6) || (dado1 == 6) && (dado2 == 3 ) ){
                                parejarepetida3y6++;
                            }else if((dado1 == 4) && (dado2 == 5) || (dado1 == 5) && (dado2 == 4 ) ){
                                parejarepetida4y5++;
                            }else if((dado1 == 4) && (dado2 == 6) || (dado1 == 6) && (dado2 == 4 ) ){
                                parejarepetida4y6++;
                            }else if((dado1 == 5) && (dado2 == 6 ) || (dado1 == 6) && (dado2 == 5 ) ){
                                parejarepetida5y6++;
                            }

                            sumaparejasrepetidas = parejarepetida1y2 + parejarepetida1y3+ parejarepetida1y4+ parejarepetida1y5 + parejarepetida1y6 + parejarepetida2y3 + parejarepetida2y4 + parejarepetida2y5 + parejarepetida2y6 + parejarepetida3y4 + parejarepetida3y5 + parejarepetida3y6 + parejarepetida4y5 + parejarepetida4y6 + parejarepetida5y6;



                            numero1 = dado1_numero1 + dado2_numero1;
                            numero2 = dado1_numero2 + dado2_numero2;
                            numero3 = dado1_numero3 + dado2_numero3;
                            numero4 = dado1_numero4 + dado2_numero4;
                            numero5 = dado1_numero5 + dado2_numero5;
                            numero6 = dado1_numero6 + dado2_numero6;

                            for (int j = 0; j < 6+1; j++) {

                                if(j==0){
                                    numeromenor=numero1;
                                    numeromenor=numero2;
                                    numeromenor=numero3;
                                    numeromenor=numero4;
                                    numeromenor=numero5;
                                    numeromenor=numero6;
                                }else if(numero1<numeromenor){
                                    numeromenor=numero1;
                                }else if(numero2<numeromenor){
                                    numeromenor=numero2;
                                }else if(numero3<numeromenor){
                                    numeromenor=numero3;
                                }else if(numero4<numeromenor){
                                    numeromenor=numero4;
                                }else if(numero5<numeromenor){
                                    numeromenor=numero5;
                                }else if(numero6<numeromenor){
                                    numeromenor=numero6;
                                }
                                if(numero1>numeromayor){
                                    numeromayor=numero1;
                                }else if(numero2>numeromayor){
                                    numeromayor=numero2;
                                }else if(numero3>numeromayor){
                                    numeromayor=numero3;
                                }else if(numero4>numeromayor){
                                    numeromayor=numero4;
                                }else if(numero5>numeromayor){
                                    numeromayor=numero5;
                                }else if(numero6>numeromayor){
                                    numeromayor=numero6;
                                }
                            }
                            promedio_dado1 = dado1_suma / 50 ;
                            promedio_dado2 = dado2_suma / 50 ;
                        }
                        
                        
                        System.out.println("\n---------------CALCULANDO...-------------------------");
                        System.out.println("------------------LOS--------------------------------");
                        System.out.println("---------------RESULTADOS----------------------------\n");
                        System.out.println("LOS DOBLES QUE SALIERON SON : "+dobles);
                        System.out.println("LAS VECES QUE SALIO CADA NUMERO FUE : ");
                        System.out.println("------------- DADO N-1 -------------");
                        System.out.println("NUMERO 1 : "+dado1_numero1);
                        System.out.println("NUMERO 2 : "+dado1_numero2);
                        System.out.println("NUMERO 3 : "+dado1_numero3);
                        System.out.println("NUMERO 4 : "+dado1_numero4);
                        System.out.println("NUMERO 5 : "+dado1_numero5);
                        System.out.println("NUMERO 6 : "+dado1_numero6);
                        System.out.println("------------- DADO N-2 -------------");
                        System.out.println("NUMERO 1 : "+dado2_numero1);
                        System.out.println("NUMERO 2 : "+dado2_numero2);
                        System.out.println("NUMERO 3 : "+dado2_numero3);
                        System.out.println("NUMERO 4 : "+dado2_numero4);
                        System.out.println("NUMERO 5 : "+dado2_numero5);
                        System.out.println("NUMERO 6 : "+dado2_numero6);
                        System.out.println("LOS NUMEROS PARES QUE SALIERON SON : "+par);
                        System.out.println("LOS NUMEROS IMPARES QUE SALIERON SON : "+impar);
                        System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON \nEN EL DADO N-1 ES : "+dado1_suma);
                        System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON \nEN EL DADO N-2 ES : "+dado2_suma);
                        System.out.println("NUMERO 1 : "+numero1);
                        System.out.println("NUMERO 2 : "+numero2);
                        System.out.println("NUMERO 3 : "+numero3);
                        System.out.println("NUMERO 4 : "+numero4);
                        System.out.println("NUMERO 5 : "+numero5);
                        System.out.println("NUMERO 6 : "+numero6);
                        System.out.println("EL NUMERO QUE MENOS VECES SALIO FUE : "+numeromenor);
                        System.out.println("EL NUMERO QUE MAS VECES SALIO FUE : "+numeromayor);
                        System.out.println("EL PROMEDIO DE SALIDAS DEL DADO 1 ES : "+promedio_dado1);
                        System.out.println("EL PROMEDIO DE SALIDAS DEL DADO 2 ES : "+promedio_dado2);
                        System.out.println("NUMERO DE VECES QUE SE REPITIERON LAS PAREJAS : \n");
                        System.out.println("PAREJA (1,2) : "+parejarepetida1y2+"  - PAREJA (1,3) : "+parejarepetida1y3+"  - PAREJA (1,4) : "+parejarepetida1y4);
                        System.out.println("PAREJA (1,5) : "+parejarepetida1y5+"  - PAREJA (1,6) : "+parejarepetida1y6+"  - PAREJA (2,3) : "+parejarepetida2y3);
                        System.out.println("PAREJA (2,4) : "+parejarepetida2y4+"  - PAREJA (2,5) : "+parejarepetida2y5+"  - PAREJA (2,6) : "+parejarepetida2y6);
                        System.out.println("PAREJA (3,4) : "+parejarepetida3y4+"  - PAREJA (3,5) : "+parejarepetida3y5+"  - PAREJA (3,6) : "+parejarepetida3y6);
                        System.out.println("PAREJA (4,5) : "+parejarepetida4y5+"  - PAREJA (4,6) : "+parejarepetida4y6+"  - PAREJA (5,6) : "+parejarepetida5y6+"\n");
                        System.out.println("EL TOTAL DE PAREJAS REPETIDAS FUE : \n"+sumaparejasrepetidas);
                        System.out.println("PAREJA (1,1) : "+parejaigualn1+"  - PAREJA (2,2) : "+parejaigualn2+"  - PAREJA (3,3) : "+parejaigualn3);
                        System.out.println("PAREJA (4,4) : "+parejaigualn4+"  - PAREJA (5,5) : "+parejaigualn5+"  - PAREJA (6,6) : "+parejaigualn6+"\n");
                        System.out.println("EL TOTAL DE PAREJAS IGUALES FUE : "+sumaparejasiguales);


                            
                    }
                
                    System.out.println("¿DESEA SEGUIR JUGANDO O TERMINAR EL JUEGO? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
                    System.out.println("(TERMINAR) o (SEGUIR)");
                    desicion = sc.nextLine();
            }

        }
            /*System.out.println("¿DESEA SEGUIR JUGANDO O TERMINAR EL JUEGO? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
            System.out.println("(TERMINAR) o (SEGUIR)");
            String desicion = sc.nextLine();
            
            while(desicion == "SEGUIR" || desicion == "seguir" ){
                
                for (int o = 1 ; o < jugadores+1; o++) {
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("EL JUGADOR N-"+o+" COMENZARA A LANZAR LOS DADOS");
                    System.out.println("-------------------------------------------------------------\n");
                    int  dobles = 0, par = 0, impar = 0 , dado1_suma = 0, dado2_suma = 0 , doble1 = 0;
                    int dado1_numero1 = 0, dado1_numero2 = 0,dado1_numero3 = 0,dado1_numero4 = 0,dado1_numero5 = 0,dado1_numero6 = 0;
                    int dado2_numero1 = 0, dado2_numero2 = 0,dado2_numero3 = 0,dado2_numero4 = 0,dado2_numero5 = 0,dado2_numero6 = 0;
                    int numero1=0,numero2=0,numero3=0,numero4=0,numero5=0,numero6=0, numeromenor=0,numeromayor=0;
                    int promedio_dado1 = 0 ,promedio_dado2 = 0, parejaigualn1 = 0,parejaigualn2=0,parejaigualn3=0,parejaigualn4=0,parejaigualn5=0,parejaigualn6=0;
                    int parejarepetida1y2=0,parejarepetida1y3=0,parejarepetida1y4=0,parejarepetida1y5=0,parejarepetida1y6=0;
                    int parejarepetida2y3=0,parejarepetida2y4=0,parejarepetida2y5=0,parejarepetida2y6=0;
                    int parejarepetida3y4=0,parejarepetida3y5=0,parejarepetida3y6=0;
                    int parejarepetida4y5=0,parejarepetida4y6=0;
                    int parejarepetida5y6=0 , sumaparejasrepetidas = 0 , sumaparejasiguales = 0;
                        for (int i = 1; i < 50+1; i++) {

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
                            
                            if ((dado1 == 1) && (dado2 == 1)){
                                parejaigualn1++;
                            }else if((dado1 == 2) && (dado2 == 2)){
                                parejaigualn2++;
                            }else if((dado1 == 3) && (dado2 == 3)){
                                parejaigualn3++;
                            }else if((dado1 == 4) && (dado2 == 4)){
                                parejaigualn4++;
                            }else if((dado1 == 5) && (dado2 == 5)){
                                parejaigualn5++;
                            }else if((dado1 == 6) && (dado2 == 6)){
                                parejaigualn6++;
                            }

                            sumaparejasiguales = parejaigualn1 + parejaigualn2 + parejaigualn3 + parejaigualn4 + parejaigualn5 + parejaigualn6;


                            if ((dado1 == 1) && (dado2 == 2) || (dado1 == 2) && (dado2 == 1 ) ){
                                parejarepetida1y2++;
                            }else if((dado1 == 1) && (dado2 == 3) || (dado1 == 3) && (dado2 == 1 ) ){
                                parejarepetida1y3++;
                            }else if((dado1 == 1) && (dado2 == 4) || (dado1 == 4) && (dado2 == 1 ) ){
                                parejarepetida1y4++;
                            }else if((dado1 == 1) && (dado2 == 5) || (dado1 == 5) && (dado2 == 1 ) ){
                                parejarepetida1y5++;
                            }else if((dado1 == 1) && (dado2 == 6) || (dado1 == 6) && (dado2 == 1 ) ){
                                parejarepetida1y6++;
                            }else if((dado1 == 2) && (dado2 == 3) || (dado1 == 3) && (dado2 == 2 ) ){
                                parejarepetida2y3++;
                            }else if((dado1 == 2) && (dado2 == 4) || (dado1 == 4) && (dado2 == 2 ) ){
                                parejarepetida2y4++;
                            }else if((dado1 == 2) && (dado2 == 5) || (dado1 == 5) && (dado2 == 2 ) ){
                                parejarepetida2y5++;
                            }else if((dado1 == 2) && (dado2 == 6) || (dado1 == 6) && (dado2 == 2 ) ){
                                parejarepetida2y6++;
                            }else if((dado1 == 3) && (dado2 == 4) || (dado1 == 4) && (dado2 == 3 ) ){
                                parejarepetida3y4++;
                            }else if((dado1 == 3) && (dado2 == 5) || (dado1 == 5) && (dado2 == 3 ) ){
                                parejarepetida3y5++;
                            }else if((dado1 == 3) && (dado2 == 6) || (dado1 == 6) && (dado2 == 3 ) ){
                                parejarepetida3y6++;
                            }else if((dado1 == 4) && (dado2 == 5) || (dado1 == 5) && (dado2 == 4 ) ){
                                parejarepetida4y5++;
                            }else if((dado1 == 4) && (dado2 == 6) || (dado1 == 6) && (dado2 == 4 ) ){
                                parejarepetida4y6++;
                            }else if((dado1 == 5) && (dado2 == 6 ) || (dado1 == 6) && (dado2 == 5 ) ){
                                parejarepetida5y6++;
                            }

                            sumaparejasrepetidas = parejarepetida1y2 + parejarepetida1y3+ parejarepetida1y4+ parejarepetida1y5 + parejarepetida1y6 + parejarepetida2y3 + parejarepetida2y4 + parejarepetida2y5 + parejarepetida2y6 + parejarepetida3y4 + parejarepetida3y5 + parejarepetida3y6 + parejarepetida4y5 + parejarepetida4y6 + parejarepetida5y6;



                            numero1 = dado1_numero1 + dado2_numero1;
                            numero2 = dado1_numero2 + dado2_numero2;
                            numero3 = dado1_numero3 + dado2_numero3;
                            numero4 = dado1_numero4 + dado2_numero4;
                            numero5 = dado1_numero5 + dado2_numero5;
                            numero6 = dado1_numero6 + dado2_numero6;

                            for (int j = 0; j < 6+1; j++) {

                                if(j==0){
                                    numeromenor=numero1;
                                    numeromenor=numero2;
                                    numeromenor=numero3;
                                    numeromenor=numero4;
                                    numeromenor=numero5;
                                    numeromenor=numero6;
                                }else if(numero1<numeromenor){
                                    numeromenor=numero1;
                                }else if(numero2<numeromenor){
                                    numeromenor=numero2;
                                }else if(numero3<numeromenor){
                                    numeromenor=numero3;
                                }else if(numero4<numeromenor){
                                    numeromenor=numero4;
                                }else if(numero5<numeromenor){
                                    numeromenor=numero5;
                                }else if(numero6<numeromenor){
                                    numeromenor=numero6;
                                }
                                if(numero1>numeromayor){
                                    numeromayor=numero1;
                                }else if(numero2>numeromayor){
                                    numeromayor=numero2;
                                }else if(numero3>numeromayor){
                                    numeromayor=numero3;
                                }else if(numero4>numeromayor){
                                    numeromayor=numero4;
                                }else if(numero5>numeromayor){
                                    numeromayor=numero5;
                                }else if(numero6>numeromayor){
                                    numeromayor=numero6;
                                }
                            }
                            promedio_dado1 = dado1_suma / 50 ;
                            promedio_dado2 = dado2_suma / 50 ;
                        }
                        
                        
                        System.out.println("\n---------------CALCULANDO...-------------------------");
                        System.out.println("------------------LOS--------------------------------");
                        System.out.println("---------------RESULTADOS----------------------------\n");
                        System.out.println("LOS DOBLES QUE SALIERON SON : "+dobles);
                        System.out.println("LAS VECES QUE SALIO CADA NUMERO FUE : ");
                        System.out.println("------------- DADO N-1 -------------");
                        System.out.println("NUMERO 1 : "+dado1_numero1);
                        System.out.println("NUMERO 2 : "+dado1_numero2);
                        System.out.println("NUMERO 3 : "+dado1_numero3);
                        System.out.println("NUMERO 4 : "+dado1_numero4);
                        System.out.println("NUMERO 5 : "+dado1_numero5);
                        System.out.println("NUMERO 6 : "+dado1_numero6);
                        System.out.println("------------- DADO N-2 -------------");
                        System.out.println("NUMERO 1 : "+dado2_numero1);
                        System.out.println("NUMERO 2 : "+dado2_numero2);
                        System.out.println("NUMERO 3 : "+dado2_numero3);
                        System.out.println("NUMERO 4 : "+dado2_numero4);
                        System.out.println("NUMERO 5 : "+dado2_numero5);
                        System.out.println("NUMERO 6 : "+dado2_numero6);
                        System.out.println("LOS NUMEROS PARES QUE SALIERON SON : "+par);
                        System.out.println("LOS NUMEROS IMPARES QUE SALIERON SON : "+impar);
                        System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON \nEN EL DADO N-1 ES : "+dado1_suma);
                        System.out.println("LA SUMATORIA DE TODOS LOS NUMEROS QUE SALIERON \nEN EL DADO N-2 ES : "+dado2_suma);
                        System.out.println("NUMERO 1 : "+numero1);
                        System.out.println("NUMERO 2 : "+numero2);
                        System.out.println("NUMERO 3 : "+numero3);
                        System.out.println("NUMERO 4 : "+numero4);
                        System.out.println("NUMERO 5 : "+numero5);
                        System.out.println("NUMERO 6 : "+numero6);
                        System.out.println("EL NUMERO QUE MENOS VECES SALIO FUE : "+numeromenor);
                        System.out.println("EL NUMERO QUE MAS VECES SALIO FUE : "+numeromayor);
                        System.out.println("EL PROMEDIO DE SALIDAS DEL DADO 1 ES : "+promedio_dado1);
                        System.out.println("EL PROMEDIO DE SALIDAS DEL DADO 2 ES : "+promedio_dado2);
                        System.out.println("NUMERO DE VECES QUE SE REPITIERON LAS PAREJAS : \n");
                        System.out.println("PAREJA (1,2) : "+parejarepetida1y2+"  - PAREJA (1,3) : "+parejarepetida1y3+"  - PAREJA (1,4) : "+parejarepetida1y4);
                        System.out.println("PAREJA (1,5) : "+parejarepetida1y5+"  - PAREJA (1,6) : "+parejarepetida1y6+"  - PAREJA (2,3) : "+parejarepetida2y3);
                        System.out.println("PAREJA (2,4) : "+parejarepetida2y4+"  - PAREJA (2,5) : "+parejarepetida2y5+"  - PAREJA (2,6) : "+parejarepetida2y6);
                        System.out.println("PAREJA (3,4) : "+parejarepetida3y4+"  - PAREJA (3,5) : "+parejarepetida3y5+"  - PAREJA (3,6) : "+parejarepetida3y6);
                        System.out.println("PAREJA (4,5) : "+parejarepetida4y5+"  - PAREJA (4,6) : "+parejarepetida4y6+"  - PAREJA (5,6) : "+parejarepetida5y6+"\n");
                        System.out.println("EL TOTAL DE PAREJAS REPETIDAS FUE : \n"+sumaparejasrepetidas);
                        System.out.println("PAREJA (1,1) : "+parejaigualn1+"  - PAREJA (2,2) : "+parejaigualn2+"  - PAREJA (3,3) : "+parejaigualn3);
                        System.out.println("PAREJA (4,4) : "+parejaigualn4+"  - PAREJA (5,5) : "+parejaigualn5+"  - PAREJA (6,6) : "+parejaigualn6+"\n");
                        System.out.println("EL TOTAL DE PAREJAS IGUALES FUE : "+sumaparejasiguales);


                            
                    }
                
                    System.out.println("¿DESEA SEGUIR JUGANDO O TERMINAR EL JUEGO? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
                    System.out.println("(TERMINAR) o (SEGUIR)");
                    desicion = sc.nextLine();
            }*/
        
    }
    
}
