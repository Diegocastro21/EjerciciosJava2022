package Paquete2EjerciciosResueltosYT;
import java.util.concurrent.ThreadLocalRandom;
public class P2EjercicioYoutubeN11 {

    public static void main(String[] args) {
        for (int i = 1; i < 1000+1; i++) {
            int longitud = 15;
        String cadena = cadenaAleatoria(longitud);
        System.out.printf("PALABRAS AL AZAR NUMERO - %d : %s\n", i, cadena);
        }
        
        
    }
    public static String cadenaAleatoria(int longitud) {
    // El banco de caracteres
    String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    // La cadena en donde iremos agregando un carácter aleatorio
    String cadena = "";
    for (int x = 0; x < 15; x++) {
        int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
        char caracterAleatorio = banco.charAt(indiceAleatorio);
        cadena += caracterAleatorio;
    }
    return cadena;
}
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
    
}
