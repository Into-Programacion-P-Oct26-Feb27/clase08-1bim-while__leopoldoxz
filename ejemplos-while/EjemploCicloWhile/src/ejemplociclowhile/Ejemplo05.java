/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 3;
        int contador = 1;
        double suma_total = 0;

        double promedio_final;
        double calificacion;
        String nombre;
        String apellidos;
        
        String cadena_Final = "las notas ingresadas son:\n";
        
        System.out.print("ingerse el nombre del estudianete");
        nombre = entrada.nextLine();
        
        cadena_Final = String.format("%snombre del estudiante: %s\n",
                    cadena_Final,nombre);
         
        System.out.print("ingrese el apellido  del estudianete");
        apellidos = entrada.nextLine();
        
        cadena_Final = String.format("%sapellidos  del estudiante: %s\n",
                    cadena_Final,apellidos);
        
        System.out.println("Ingrese las notas de los estudiantes de su "
                + "materia");

        while (contador <= limite) {
            System.out.printf("Ingrese calificación "
                    + "número %d\n", contador);
            calificacion = entrada.nextDouble();
            cadena_Final = String.format("%s%.1f\n",
                    cadena_Final,calificacion);
            suma_total = suma_total + calificacion;
            // contador
            contador = contador + 1;
        }
        
        cadena_Final = String.format("%sLa suma de notas es: %.1f\n",
                cadena_Final, suma_total);               
        
        promedio_final = suma_total / limite;
        
        cadena_Final = String.format("%sPromedio es: %.2f\n",
                cadena_Final, promedio_final);
        //System.out.printf("El promedio final es %f\n", promedio_final);
        System.out.printf("%s\n", cadena_Final);
    }
}
