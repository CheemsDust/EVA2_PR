/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_3_potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, expo;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la base:");
        base = captu.nextInt();
        System.out.println("introduce el exponente:");
        expo = captu.nextInt();
        //System.out.println("potencia =" + Math.pow(base, expo));
        int acum = 1;
        for(int i = 1; i <= expo; i++){
            acum = acum * base;
        }
        System.out.println("Potencia = "+ acum);
    }
    
}
