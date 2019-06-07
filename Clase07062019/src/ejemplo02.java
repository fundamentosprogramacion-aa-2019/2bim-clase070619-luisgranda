
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

public class ejemplo02 {
    
    public  static  void  main ( String [] args ) {
        Scanner entrada = new Scanner(System.in);
        
        String [] rangos = {"  0 - 10", "10.1 - 12", "12.1 - 15",
            "15.1 - 18", "18.1 - 20"};
        double [] calificaciones = new double [5];
        boolean bandera = true;
        int seguir;
        double calificacion;
        String reporteFinal = "";
        
        while (bandera == true){
            System.out.println("Ingrese una Calificacion para Clasificarla:");
            calificacion = entrada.nextDouble();
            if((calificacion >= 0) && (calificacion <= 10)){
                calificaciones[0] = calificaciones[0] + 1;
            }else{
                if ((calificacion >= 10.1) && (calificacion <= 12)){
                calificaciones[1] = calificaciones[0] + 1;
                }else{
                    if ((calificacion >= 12.1) && (calificacion <= 15)){
                    calificaciones[2] = calificaciones[0] + 1;
                    }else{
                        if ((calificacion >= 12.1) && (calificacion <= 15)){
                        calificaciones[2] = calificaciones[0] + 1;
                        }else{
                            if ((calificacion >= 15.1) && (calificacion <= 18)){
                            calificaciones[3] = calificaciones[0] + 1;
                            }else
                                if ((calificacion >= 18.1) && (calificacion <= 20)){
                                calificaciones[4] = calificaciones[0] + 1;
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
        for (int i = 0; i < calificaciones.length; i++){
            reporteFinal = String.format("%sRango %s, numero de notas %.2f\n",
                    reporteFinal,rangos[i], calificaciones[i]);
        }
        System.out.printf("%s\n", reporteFinal);
    }

}

