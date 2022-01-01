package Paquete2EjerciciosResueltosYT;

public class P2EjercicioYoutubeN8 {

    public static void main(String[] args) {
        


        int desde = 2;
        int hasta = 1000;
        boolean esPrimo;

        for (int i = desde; i <= hasta; i++) {
            esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
    
}
