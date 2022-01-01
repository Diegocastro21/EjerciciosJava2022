package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
public class P2EjercicioYoutubeN9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String equipos;
        int equipoa = 0,equipob = 0, ninguno = 0 ;
        int porcentajesA,porcentajesB,porcentajesN;
        for (int i = 1; i < 500+1; i++) {
            
            System.out.println("POR FAVOR INGRESE EL NOMBRE DEL EQUIPO QUE SON HINCHAS : ");
            System.out.println("(EQUIPOA) o (EQUIPOB) o (NINGUNO) ");
            equipos = sc.nextLine();
            
            switch (equipos) {
                case "EQUIPOA", "equipoa" -> equipoa++;
                case "EQUIPOB", "equipob" -> equipob++;
                case "NINGUNO", "ninguno" -> ninguno++;
default ->      {
                }
            }
        }
        porcentajesA = (equipoa*100)/500;
        porcentajesB = (equipob*100)/500;
        porcentajesN = (ninguno*100)/500;
        System.out.println("PORCENTAJE DE ESTUDIANTES DEL EQUIPO A SON : "+porcentajesA+"%");
        System.out.println("PORCENTAJE DE ESTUDIANTES DEL EQUIPO B SON : "+porcentajesB+"%");
        System.out.println("PORCENTAJE DE ESTUDIANTES DE NINGUNO DE LOS DOS SON : "+porcentajesN+"%");
    }
    
}
