/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_6;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class Practica_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Crear un objeto Scanner para capturar la entrada del usuario
         Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        // Parte creciente
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte decreciente
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        

    }
    
}
