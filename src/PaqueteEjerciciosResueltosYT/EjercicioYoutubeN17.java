package PaqueteEjerciciosResueltosYT;

import java.util.Scanner;

public class EjercicioYoutubeN17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreempleado ;
        double sueldobase;
        double slmv, auxiliotransporte,valorhora, valordia, diastrabajados, salariopordiast;
        double horastrabajonoche,salariorecargonoche,salariototalrecargos,horasdiurnasdomfes,horasnocturnasdomfes,salariorecargosdiurnosdomfes,salariorecargosnocturnosdomfes;
        double horasextradia,horasextranoche,salariohorasextradia,salariohorasextranoche,horasextradomfesdia,horasextradomfesnoche;
        double salariohorasextradomfesdia,salariohorasextradomfesnoche,bonificaciones,descuentos,salario,aporteeps,aportepension,deducciones,salariodevengado;
        System.out.println("POR FAVOR INGRESE EL NOMBRE DEL EMPLEADO : ");
        nombreempleado = sc.nextLine();
        System.out.println("POR FAVOR INGRESE EL SUELDO DEL EMPLEADO : ");
        sueldobase = sc.nextDouble();
        System.out.println("POR FAVOR INGRESE LOS DIAS QUE VA A TRABAJAR EL EMPLEADO : ");
        diastrabajados = sc.nextDouble();
        System.out.println("POR FAVOR INGRESE EL AUXILIO DE TRANSPORTE DEL EMPLEADO : ");
        auxiliotransporte = sc.nextDouble();
        System.out.println("POR FAVOR INGRESE EL SALARIO MINIMO LEGAL VIGENTE : ");
        slmv = sc.nextDouble();
        
        if(sueldobase < slmv){
            System.out.println("EL SUELDO DEBE SER COMO MINIMO "+slmv);
        }else{
            valorhora = sueldobase/(30*8);
            valordia = valorhora * 8;
            salariopordiast = valordia * diastrabajados;
            
            System.out.println("POR FAVOR INGRESE LAS HORAS DE TRABAJO NOCHE: ");
            horastrabajonoche = sc.nextDouble();
            salariorecargonoche = valorhora * horastrabajonoche*1.35;
            salariototalrecargos = valorhora + salariorecargonoche;
            System.out.println("POR FAVOR INGRESE LAS HORAS DE TRABAJO DIURNAS DEL DOMINGO O FESTIVOS : ");
            horasdiurnasdomfes = sc.nextDouble();
            salariorecargosdiurnosdomfes = valorhora *horasdiurnasdomfes *1.75;
            salariototalrecargos = salariototalrecargos + salariorecargosdiurnosdomfes;
            System.out.println("POR FAVOR INGRESE LAS HORAS DE TRABAJO NOCTURNAS DEL DOMINGO O FESTIVOS : ");
            horasnocturnasdomfes = sc.nextDouble();
            salariorecargosnocturnosdomfes = valorhora * horasnocturnasdomfes * 2.10;
            salariototalrecargos = salariototalrecargos + salariorecargosnocturnosdomfes;
            System.out.println("POR FAVOR INGRESE LAS HORAS EXTRA DIURNAS : ");
            horasextradia = sc.nextDouble();
            salariohorasextradia = valorhora * horasextradia * 1.25;
            salariototalrecargos = salariototalrecargos + salariohorasextradia;
            System.out.println("POR FAVOR INGRESE LAS HORAS EXTRA NOCTURNAS : ");
            horasextranoche = sc.nextDouble();
            salariohorasextranoche = valorhora * horasextranoche * 1.75;
            salariototalrecargos = salariototalrecargos + salariohorasextranoche;
            System.out.println("POR FAVOR INGRESE LAS HORAS EXTRA DIURNAS DEL DOMINGO O FESTIVO : ");
            horasextradomfesdia = sc.nextDouble();
            salariohorasextradomfesdia = valorhora * horasextradomfesdia * 2.0;
            salariototalrecargos = salariototalrecargos + salariohorasextradomfesdia;
            System.out.println("POR FAVOR INGRESE LAS HORAS EXTRA NOCTURNAS DEL DOMINGO O FESTIVO : ");
            horasextradomfesnoche = sc.nextDouble();
            salariohorasextradomfesnoche = valorhora * horasextradomfesnoche * 2.50;
            salariototalrecargos = salariototalrecargos + salariohorasextradomfesnoche;
            System.out.println("POR FAVOR INGRESE LAS BONIFICACIONES DEL TRABAJADOR : ");
            bonificaciones = sc.nextDouble();
            System.out.println("POR FAVOR INGRESE LOS DESCUENTOS DEL TRABAJADOR : ");
            descuentos = sc.nextDouble();
            salariototalrecargos = salariototalrecargos + salariohorasextradomfesdia;
            salario = salariopordiast + salariototalrecargos;
            if(salario <= (slmv * 2)){
                salario = salario+auxiliotransporte;
            }
            aporteeps = salario*0.04;
            aportepension = salario*0.04;
            deducciones = aporteeps + aportepension + descuentos;
            salariodevengado = salario - deducciones;
        

            System.out.println("NOMBRE DEL EMPLEADO : "+nombreempleado);
            System.out.println("SUELDO BASE : "+sueldobase);
            System.out.println("VALOR DE DIA : "+valordia);
            System.out.println("VALOR HORA : "+valorhora);
            System.out.println("DIAS TRABAJADOS : "+diastrabajados);
            System.out.println("SALARIO POR DIAS TRABAJADOS : "+salariopordiast);
            System.out.println("HORAS NOCTURNAS : "+horastrabajonoche);
            System.out.println("SALARIO POR RECARGO NOCTURNO : "+salariorecargonoche);
            System.out.println("HORAS DOMINICALES FESTIVAS DIA: "+horasdiurnasdomfes);
            System.out.println("SALARIO POR HORAS DOMINICALES FESTIVAS DIA : "+salariorecargosdiurnosdomfes);
            System.out.println("HORAS DOMINICALES FESTIVAS NOCHE : "+horasnocturnasdomfes);
            System.out.println("SALARIO POR HORAS DOMINICALES FESTIVAS NOCHE : "+salariorecargosnocturnosdomfes);
            System.out.println("HORAS EXTRAS DIA : "+horasextradia);
            System.out.println("SALARIO POR HORAS EXTRAS DIA : "+salariohorasextradia);
            System.out.println("HORAS EXTRAS NOCHE :"+horasextranoche);
            System.out.println("SALARIO POR HORAS EXTRAS NOCHE : "+salariohorasextranoche);
            System.out.println("HORAS EXTRAS DOMINICALES FESTIVAS DIA : "+horasextradomfesdia);
            System.out.println("SALARIO POR HORAS EXTRAS DOMINICALES FESTIVAS DIA : "+salariohorasextradomfesdia);
            System.out.println("HORAS EXTRAS DOMINICALES FESTIVAS NOCHE : "+horasextradomfesnoche);
            System.out.println("SALARIO POR HORAS EXTRAS DOMINICALES FESTIVAS NOCHE : "+salariohorasextradomfesnoche);
            System.out.println("BONIFICACIONES : "+bonificaciones);
            System.out.println("TOTAL SALARIO POR RECARGO : "+salariototalrecargos);
            System.out.println("TOTAL AUXILIO DE TRANSPORTE : "+auxiliotransporte);
            System.out.println("TOTAL SALARIO NETO : "+salario);
            System.out.println("-----------------------------DEDUCCIONES-------------------------------");
            System.out.println("APORTE A EPS : "+aporteeps);
            System.out.println("APORTE A PENSION : "+aportepension);
            System.out.println("TOTAL DEDUCCIONES : "+deducciones);
            System.out.println("TOTAL SALARIO DEVENGADO : "+salariodevengado);
            
        
        
        }
    }

}
