/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_2_promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa, acum;
        Scanner captu = new Scanner(System.in);
        acum = 0;
        for(int i =1; i <= 20; i++){
            System.out.println("Estudiante  #" + i);
            System.out.println("introduce la calificacion:   ");
            califa = captu.nextInt();
            acum = acum + califa;
         }
        System.out.println("proemdio = " + (acum / 20.0));
        
    }
    
}
