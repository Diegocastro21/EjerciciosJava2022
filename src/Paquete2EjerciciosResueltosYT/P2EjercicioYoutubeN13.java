package Paquete2EjerciciosResueltosYT;
import java.util.Scanner;
public class P2EjercicioYoutubeN13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre_producto, desicion;
        int cantidad,precio,x=0,total;
        
        do{
            x++;
            System.out.println("POR FAVOR INGRESE EL NOMBRE DEL PRODUCTO : ");
            nombre_producto = sc.nextLine();
            System.out.println("EL PRECIO DE "+nombre_producto+" ES DE : ");
            precio = sc.nextInt();
            System.out.println("CANTIDAD QUE NECESITA : ");
            cantidad = sc.nextInt();
            
            total =precio * cantidad;
            
            System.out.println("ITEM    NOMBRE    $PRECIO    CANTIDAD    $TOTAL");
            System.out.println(x+"       "+nombre_producto+"      $"+precio+"        "+cantidad+"       $"+total+"\n");
            
            System.out.println("¿DESEA AGREGAR OTRO ITEM A SU COMPRA ? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
            System.out.println("(SI) o (NO)");
            String next = sc.nextLine();
            desicion = sc.nextLine();
        }while(desicion.equals("SI")  || desicion.equals("si") );
            /*System.out.println("POR FAVOR INGRESE EL NOMBRE DEL PRODUCTO : ");
            nombre_producto = sc.nextLine();
            System.out.println("EL PRECIO DE "+nombre_producto+" ES DE : ");
            precio = sc.nextInt();
            System.out.println("CANTIDAD QUE NECESITA : ");
            cantidad = sc.nextInt();
            
            System.out.println("¿DESEA AGREGAR OTRO ITEM A SU COMPRA ? \n ELIJA ESCRIBIENDO LO ESCRITO EN LOS PARENTESIS");
            System.out.println("(SI) o (NO)");
            String next = sc.nextLine();
            desicion = sc.nextLine();*/
        
    }
    
    
}
