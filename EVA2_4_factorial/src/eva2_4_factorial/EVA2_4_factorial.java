/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_4_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, fac = 1;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce el numero:");
        num = captu.nextInt();
        
        for(int i = num; i>=1; i--){
            fac = fac * i;
        }
        System.out.println("factorizado = "+ num + " = "+ fac);
    }
    
}
