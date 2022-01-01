package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
public class P2EjercicioYoutubeN6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero_Estudiantes, edad , semestre;
        String nombre,genero,estadocivil;
        int sumaedades = 0, promedioedad = 0,semestren1 = 0,semestren6 = 0, hombres = 0, mujeres = 0;
        int hombrescasados = 0 , mujerescasadas = 0 , solteros= 0,menoredad=0;
        
        System.out.println("POR FAVOR INGRESE LA CANTIDAD DE ESTUDIANTES ");
        Numero_Estudiantes = sc.nextInt();
        
        for (int i = 1; i < Numero_Estudiantes+1; i++) {
            System.out.println("ESTUDIANTE N-"+i);
            
            System.out.println("INGRESE SU NOMBRE : ");
            String next = sc.nextLine();
            nombre = sc.nextLine();
            System.out.println("INGRESE SU EDAD : ");
            edad = sc.nextInt();
            System.out.println("INGRESE SU GENERO (MASCULINO) O (FEMENINO): ");
            next = sc.nextLine();
            genero = sc.nextLine();
            System.out.println("INGRESE SU ESTADO CIVIL \n(CASADO)\n(CASADA)\n(SOLTERO)\n(SOLTERA)\n: ");
            estadocivil = sc.nextLine();
            System.out.println("INGRESE EL NUMERO DEL SEMESTRE EN QUE SE ENCUENTRA: ");
            semestre = sc.nextInt();
            
            sumaedades += edad;
            promedioedad = sumaedades / Numero_Estudiantes;
            
            if(semestre == 1){
               semestren1++;
            }else if(semestre == 6){
                semestren6++;
            }
            
            if(genero.equals("MASCULINO") || genero.equals("masculino")){
                hombres++;
            }else if(genero.equals("FEMENINO") || genero.equals("femenino")){
                mujeres++;
            }
            
            switch (estadocivil) {
                case "CASADO", "casado" -> hombrescasados++;
                case "CASADA", "casada" -> mujerescasadas++;
                case "SOLTERA", "soltera" -> solteros++;
                case "SOLTERO", "soltero" -> solteros++;
default ->      {
                }
            }
            
            
            if(edad < 18){
                menoredad++;
            }
            
            
                    
        }
        System.out.println("EDAD PROMEDIO DE TODOS LOS ESTUDIANTES: "+promedioedad);
        System.out.println("TOTAL ESTUDIANTES DEL PRIMER SEMESTRE : "+semestren1);
        System.out.println("TOTAL ESTUDIANTES DEL SEXTO SEMESTRE : "+semestren6);
        System.out.println("TOTAL DE HOMBRES CASADOS : "+hombrescasados);
        System.out.println("TOTAL DE MUJERES CASADOS : "+mujerescasadas);
        System.out.println("TOTAL ESTUDIANTES SOLTEROS : "+solteros);
        System.out.println("TOTAL ESTUDIANTES MENORES DE EDAD : "+menoredad);
    }
    
}
