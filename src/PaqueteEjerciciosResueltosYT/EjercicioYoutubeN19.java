package PaqueteEjerciciosResueltosYT;
import java.util.Scanner;
public class EjercicioYoutubeN19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio,precioblock;
        int block;
        
        System.out.println("POR FAVOR INGRESE EL PRECIO DEL BLOCK : ");
        precioblock = sc.nextDouble();
        
        block = (13 * 7) * 4;
        precio = block * precioblock;
        System.out.println("EL PRECIO DE UN BLOCK DE LADRILLO ES "+precioblock);
        System.out.println("LOS BLOCKS DE LADRILLOS QUE SE NECESITAN SON : "+block);
        System.out.println("PARA CONSTRUIR LA CASA COMPLETA CUESTA : "+precio);
    
    }
    
}
