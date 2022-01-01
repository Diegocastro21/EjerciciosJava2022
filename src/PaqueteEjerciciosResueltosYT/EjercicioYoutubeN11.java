package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float year,centenas,semestres,trimestres,bimestres,meses,quincena,dias;
        float jornadasdias,jornadasnoche,jornadastarde,jornadasmorning,horas,minutos,segundos,milisegundos;
        float domingos;
        int edad;
        double semana, decadas;
        System.out.println("POR FAVOR INGRESE SU EDAD : ");
        edad = sc.nextInt();
        
        year= edad;
        meses = year * 12;
        centenas = meses / 100;
        decadas = year * 0.1;
        semestres = meses / 6;
        trimestres = meses / 3;
        bimestres = meses / 2;
        quincena = 2628000 / 1296000;
        semana = meses * 4.34524;
        dias = year * 365;
        jornadasdias = dias;
        jornadasnoche = dias;
        jornadasmorning = dias;
        jornadastarde = dias;
        domingos = dias;
        horas = dias * 24;
        minutos = horas * 60;
        segundos = minutos * 60;
        milisegundos = minutos * 60000;
        
        System.out.println("AÑO :"+year+"\n CENTENAS: "+centenas+"\n DECADAS: "+decadas+"\nSEMESTRES: "+semestres+"\nTRIMESTRES: "+trimestres+"\nBIMESTRES :"+bimestres+"\nMESES :"+meses+"\nQUINCENA: "+quincena+"\nSEMANA: "+semana+"\nDIAS :"+dias+"\nJORNADAS DIAS :"+jornadasdias+"\nJORNADAS NOCHE :"+jornadasnoche+"\n JORNADAS TARDE"+jornadastarde+"\n JORNADAS MAÑANA"+jornadasmorning);
        System.out.println("HORAS : "+horas+"\nMINUTOS :"+minutos+"\nSEGUNDOS :"+segundos+"\n MILISEGUNDOS :"+milisegundos);
        
                
        
    }
    
}
