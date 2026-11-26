/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;

        while (bandera == true) {
            System.out.println("Estoy en el Ciclo");

            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100.");
            salir = entrada.nextInt();
            if(salir == -100){
                bandera = false;
            }
        }
    }
}
/*
en el siguiente ejemplo estamos haciendo que el ciclo pueda repetirse 
hasta que el usuario lo decida y termine el ciclo 
*/