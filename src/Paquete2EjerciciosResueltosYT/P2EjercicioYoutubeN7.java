package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
public class P2EjercicioYoutubeN7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidadalumnos;
        double nota1,nota2,nota3,Nota1,Nota2,Nota3,notadefinitiva;
        double sumadenotas = 0,promedio;
        int alumnoaprobado=0,alumnodesaprobado = 0;
        System.out.println("POR FAVOR INGRESE LA CANTIDAD DE ALUMNOS : ");
        cantidadalumnos = sc.nextInt();
        
        for (int i = 1; i < cantidadalumnos+1; i++) {
            nota1 = 0;
            nota2 = 0;
            nota3 = 0;
            Nota1 = 0;
            Nota2 = 0;
            Nota3 = 0;
            System.out.println("ALUMNO N-"+i);
            
            System.out.println("POR FAVOR INGRESE LA NOTA 1 : ");
            nota1 = sc.nextDouble();
            System.out.println("POR FAVOR INGRESE LA NOTA 2 : ");
            nota2 = sc.nextDouble();
            System.out.println("POR FAVOR INGRESE LA NOTA 3 : ");
            nota3 = sc.nextDouble();
            
            Nota1 = nota1 * 0.20;
            Nota2 = nota2 * 0.35;
            Nota3 = nota3 * 0.40;

            notadefinitiva = Nota1 + Nota2 + Nota3;
            sumadenotas += notadefinitiva;
            
            if(notadefinitiva >= 3.0){
                alumnoaprobado++;
            }else{
                alumnodesaprobado++;
            }
           
        }
        
        promedio = sumadenotas / cantidadalumnos;
       
        System.out.println("EL PROMEDIO DE NOTAS EN EL GRUPO ES DE : "+promedio);
        System.out.println("ESTUDIANTES QUE GANARON : "+alumnoaprobado);
        System.out.println("ESTUDIANTES QUE PERDIERON : "+alumnodesaprobado);
    }
    
}
