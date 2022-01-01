package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
public class P2EjercicioYoutubeN15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_cuotas,interes_mensual;
        double capital_prestamista,valor_neto_prestamo,valor_cuota_sininteres,valor_interes_cuotas;
        double valor_cuota_coninteres,valor_total_ganancia,valor_total_prestamo,saldo_capital;
        double valorcapital_totalprestado = 0,valortotal_gananciascapitalprestado = 0,valorpromedio_prestamos = 0,sumadecuotas=0,promedio_cuotasprestamos = 0,sumainteres=0,promedio_interesmensual_prestamos = 0;
        String mes_year;
        
        for (int i = 1; i < 40+1; i++) {
             valor_neto_prestamo = 0;numero_cuotas = 0;valor_cuota_sininteres = 0;interes_mensual = 0;valor_interes_cuotas = 0;
             valor_cuota_coninteres = 0;valor_total_ganancia = 0;valor_total_prestamo = 0;saldo_capital = 0;
            System.out.println("------------------------------------------");
            System.out.println("CLIENTE NUMERO #"+i);
            System.out.println("------------------------------------------");
            System.out.println("POR FAVOR INGRESE EL CAPITAL DEL PRESTAMISTA : ");
            capital_prestamista = sc.nextDouble();


                System.out.println("INGRESE EL VALOR NETO DEL PRESTAMO : ");
                valor_neto_prestamo = sc.nextDouble();
                System.out.println("INGRESE EL NUMERO DE CUOTAS : ");
                numero_cuotas = sc.nextInt();
                System.out.println("INGRESE EL VALOR DE LA CUOTA SIN INTERES : ");
                valor_cuota_sininteres = sc.nextDouble();
                System.out.println("INGRESE EL INTERES MENSUAL : ");
                interes_mensual = sc.nextInt();
                System.out.println("INGRESE LA FECHA DE PAGO CADA CUOTA (MES/AÑO) : ");
                mes_year = sc.nextLine();

                if(valor_neto_prestamo>capital_prestamista){
                    System.out.println("--------------------------------------------------");
                    System.out.println("ERROR EL VALOR DEL PRESTAMO NO PUEDE SER MAYOR AL VALOR DE CAPITAL ");
                    System.out.println("--------------------------------------------------");
                }if(valor_neto_prestamo <= 0){
                    System.out.println("--------------------------------------------------");
                    System.out.println("ERROR EL VALOR DEL PRESTAMO NO PUEDE SER IGUAL O INFERIOR A 0 ");
                    System.out.println("--------------------------------------------------");
                }if((numero_cuotas == 0) && (numero_cuotas < 60)){
                    System.out.println("--------------------------------------------------");
                    System.out.println("ERROR EL NUMERO DE CUOTAS DEBE SER MAYOR QUE 0 Y MENOR A 5 AÑOS ");
                    System.out.println("--------------------------------------------------");
                }if((interes_mensual == 0) && (interes_mensual <50)){
                    System.out.println("--------------------------------------------------");
                    System.out.println("ERROR EL INTERES MENSUAL NO PUEDE SER IGUAL A 0 O MAYOR QUE 50% ");
                    System.out.println("--------------------------------------------------");
                }

                valor_interes_cuotas = (valor_neto_prestamo * interes_mensual)/100;
                valor_cuota_coninteres = valor_interes_cuotas + valor_cuota_sininteres;
                valor_total_ganancia = valor_interes_cuotas * numero_cuotas;
                valor_total_prestamo = valor_cuota_coninteres * numero_cuotas;
                saldo_capital = capital_prestamista - valor_neto_prestamo;
                valorcapital_totalprestado += valor_neto_prestamo;
                valortotal_gananciascapitalprestado += valor_total_ganancia;
                valorpromedio_prestamos = valorcapital_totalprestado / 40;
                sumadecuotas += valor_cuota_coninteres;
                promedio_cuotasprestamos = sumadecuotas / 40;
                sumainteres += interes_mensual;
                promedio_interesmensual_prestamos = sumainteres / 40;
                

                System.out.println("EL VALOR NETO DEL PRESTAMO ES DE : $"+valor_neto_prestamo);
                System.out.println("EL NUMERO DE CUOTAS ES DE  : $"+numero_cuotas);
                System.out.println("EL VALOR DE LA CUOTA SIN INTERES  : $"+valor_cuota_sininteres);
                System.out.println("EL INTERES MENSUAL ES DE : "+interes_mensual+"%");
                System.out.println("EL VALOR DE INTERES POR CUOTAS : $"+valor_interes_cuotas);
                System.out.println("EL VALOR DE LAS CUOTAS CON INTERES : $"+valor_cuota_coninteres);
                System.out.println("EL VALOR TOTAL DE GANANCIA : $"+valor_total_ganancia);
                System.out.println("EL VALOR TOTAL DEL PRESTAMO : $"+valor_total_prestamo);
                System.out.println("FECHA DE PAGO DE CADA CUOTA : "+mes_year);
                System.out.println("EL SALDO CAPITAL DEL PRESTAMISTA ES DE : $"+saldo_capital);
                System.out.println("VALOR DEL CAPITAL TOTAL PRESTADO ES DE : $"+valorcapital_totalprestado);
                System.out.println("VALOR TOTAL DE GANACIAS DEL CAPITAL PRESTADO : $"+valortotal_gananciascapitalprestado);
                System.out.println("VALOR PROMEDIO DE PRESTAMOS : $"+valorpromedio_prestamos);
                System.out.println("VALOR PROMEDIO DE CUOTAS DE LOS PRESTAMOS: $"+promedio_cuotasprestamos);
                System.out.println("VALOR PROMEDIO DE INTERES MENSUAL DE LOS PRESTAMOS : $"+promedio_interesmensual_prestamos);

                
            }   
    }
    
}
