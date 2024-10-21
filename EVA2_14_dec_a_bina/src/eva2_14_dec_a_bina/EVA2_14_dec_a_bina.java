/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_dec_a_bina;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_14_dec_a_bina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = captu.nextInt();
        
        // Verificar si el número es 0
        if (numero == 0) {
            System.out.println("El número en binario es: 0");
        } else {
            String binario = "";  // Variable para almacenar el binario
            
            // Bucle while para realizar la conversión
            while (numero > 0) {
                int residuo = numero % 2;  // Obtener el residuo al dividir por 2
                binario = residuo + binario;  // Agregar el residuo al principio de la cadena
                numero = numero / 2;  // Dividir el número entre 2
            }
            
            System.out.println("El número en binario es: " + binario);
        }
    }
    
}
