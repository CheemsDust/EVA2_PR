/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_19_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[];
        int precios[];
        Scanner captu = new Scanner(System.in);
        int cant;
        System.out.println("cuantos productos tendra el menu:");
        cant = captu.nextInt();
        menu = new String[cant];
        precios = new int[cant];//tamaño a los arreglos
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nombre del producto: ");
            menu[i] = captu.nextLine();
            captu.nextLine();
            System.out.println("precio");
            precios[i] = captu.nextInt();
            captu.nextLine();
        }
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $ " + precios[i]);
        }
    }
    
}
