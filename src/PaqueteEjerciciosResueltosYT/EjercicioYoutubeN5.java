package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
import java.util.Calendar;
public class EjercicioYoutubeN5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre ;
        double diatropical = 365.242189;
        double total;
        double diasdormido;
        int yearnacimiento;
        int mesnacimiento;
        int dianacimiento;
        int yearactual;
        int mesactual;
        int mescorr;
        int diactual;
        Calendar cal = Calendar.getInstance();
        yearactual = cal.get(Calendar.YEAR);
        mesactual = cal.get(Calendar.MONTH);
        diactual = cal.get(Calendar.DAY_OF_MONTH);
        
        mescorr = mesactual + 1;
        System.out.println(" POR FAVOR INGRESE SU NOMBRE :");
        nombre = sc.nextLine();
        System.out.println("INGRESE SU YEAR DE NACIMIENTO :");
        yearnacimiento = sc.nextInt();
        System.out.println("INGRESE SU MES DE NACIMIENTO :");
        mesnacimiento = sc.nextInt();
        System.out.println("INGRESE SU DIA DE NACIMIENTO :");
        dianacimiento = sc.nextInt();
        
        total = ((yearactual - yearnacimiento)* (diatropical))+((diactual - dianacimiento)+((mescorr - mesnacimiento)*(diatropical/12)));
        
        diasdormido = (34 * total)/100;
        System.out.println("DESDE QUE USTED NACIO ESTO SON LOS DIAS QUE HAN PASADO :"+total+" DIAS");
        System.out.println("SU NOMBRE ES :"+nombre);
        System.out.println("USTED HA DORMIDO ESTO : "+diasdormido+" DIAS");
        
        
        
        
        
    }
    
}
