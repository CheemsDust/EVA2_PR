/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_ciclos_arreglos;

/**
 *
 * @author calza
 */
public class EVA2_16_ciclos_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos, x, y, z; //todos son arreglos
        int val1, val2, arreglo[]; //solo arreglo es arreglo por no estar pegado al dato int
        
        arreglo = new int[10];
        //llenamos el arreglo con numeros entre 0 y 100
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        //se imprimen los numeros
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
            
        }
    }
    
}
