
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Granda
 */
public class Ejemplo04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] rangos = {"Comedia:", "Terror:", "Drama:", "Familiar:"};
        //int[] tipoPeliculas = {0, 1, 2, 3};
        int[] peliculas = new int[4];
        boolean bandera = true;
        int seguir;
        int pelicula;
        String reporteFinal = "";

        while (bandera == true) {
            System.out.printf("%d. Comedia\n%d. Terror\n%d. Drama\n%d. Familiar\n",
                    0, 1, 2, 3);
            System.out.println("Ingrese el numero del genero de pelicula de su preferencia:");
            pelicula = entrada.nextInt();
            if (pelicula == 0) {
                peliculas[0] = peliculas[0] + 1;
            } else {
                if (pelicula == 1) {
                    peliculas[1] = peliculas[1] + 1;
                } else {
                    if (pelicula == 2) {
                        peliculas[2] = peliculas[2] + 1;
                    } else {
                        if (pelicula == 3) {
                            peliculas[3] = peliculas[3] + 1;
                        }
                    }
                }
            }
            System.out.println("Desea Salir del Ciclo, Ingrese el numero 9");
            seguir = entrada.nextInt();
            if (seguir == 9) {
                bandera = false;
            }
           
        }
        reporteFinal = String.format("%s****REPORTE DE PREFERENCIAS DE PELÍCULAS****\n", reporteFinal);
        for (int i = 0; i < peliculas.length; i++) {
                int j = peliculas[i];
                String convertir = "";
                for (int a = 0; a < j; a++) {
                    convertir = String.format("%s*", convertir);
                }
            reporteFinal = String.format("%s%s%s\n",
            reporteFinal, rangos[i], convertir);
        }
        System.out.printf("%s\n", reporteFinal);
    }
}
