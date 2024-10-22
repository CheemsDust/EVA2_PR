/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_restaraunte;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_18_restaraunte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[] = {"dogos", "Hamburguesas", "boneless", "Tacos", "montados", "camarones"};
        int precio[] = {50, 80, 120, 150, 70, 200};
        Scanner captu = new Scanner(System.in);
        int cantidad, producto;
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $ " + precio[i]);
        }
        System.out.println("cual es tu orden? (Introduce el numero del producto)");
        producto = captu.nextInt();
        System.out.println("cuantas ordenes?");
        cantidad = captu.nextInt();
        System.out.println("El costo es de = $" + cantidad * precio[producto]);
        
    }
    
}
