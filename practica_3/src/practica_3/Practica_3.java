/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_3;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class Practica_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        // Solicitar una cadena
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = captu.nextLine();
        
        // Imprimir cada carácter en una línea separada
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
    
}
