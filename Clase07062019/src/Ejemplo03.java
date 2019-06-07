
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//generar un programa que permita determina el numero de vocales utilizadas
//por un usuario en un conunto determinado de palabras de acuerdo al primer caracter
/**
 *
 * @author Granda
 */
public class Ejemplo03 {
     public  static  void  main ( String [] args ) {
        Scanner entrada = new Scanner(System.in);
         
        String [] vocales = {"a", "e", "i", "o", "u"};
        int [] contador = new int [5];
        boolean bandera = true;
        int seguir;
        String palabra = "";
        String reporteFinal = "";
         
        while (bandera == true){
            System.out.println("Ingrese una Palabra:");
            palabra = entrada.next();
            
            if(palabra[i] == vocales[0]){
                contador[0] = contador[0] + 1;
            }else{
                if(palabra[i] == vocales[1]){
                    contador[1] = contador[0] + 1;
                }else{
                    if(palabra[i] == vocales[2]){
                        contador[2] = contador[0] + 1;
                    }else{
                        if(palabra[i] == vocales[3]){
                            contador[3] = contador[0] + 1;
                        }else{
                            if(palabra[i] == vocales[4]){
                                contador[4] = contador[0] + 1;
                            }
                        }
                    }
                }
            }
            System.out.println("Desea Salir del Ciclo, Ingrese el numero 0");
            seguir = entrada.nextInt();
            if (seguir == 0){
                bandera = false;
            }
        }
        reporteFinal = String.format("%sReporte de Notas \n", reporteFinal);
        for (int i = 0; i < contador.length; i++){
            reporteFinal = String.format("%sRango %s, numero de notas %d\n",
                    reporteFinal, vocales[i], contador[i]);
        }
     }
}
