/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_1.pkg0;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class Practica_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        // Solicitar una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = captu.nextLine();
        
        // Solicitar un número
        System.out.print("Ingresa un número: ");
        int numero = captu.nextInt();
        
        // Imprimir la cadena el número de veces solicitado
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
    }
    
}
