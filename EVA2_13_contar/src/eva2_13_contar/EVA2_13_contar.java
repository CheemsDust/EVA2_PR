/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_13_contar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena de texto: ");
        String texto = captu.nextLine();
        int contadorVocales = 0;
        int i = 0;
        // Bucle while para recorrer la cadena
        while (i < texto.length()) {
            char letra = texto.charAt(i);
            
            // Verificar si es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
            
            i++;
        }
        
        System.out.println("Número de vocales: " + contadorVocales);
        
    }
    
}
