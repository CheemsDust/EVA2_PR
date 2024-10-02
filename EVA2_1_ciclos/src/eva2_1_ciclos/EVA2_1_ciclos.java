/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_ciclos;

/**
 *
 * @author calza
 */
public class EVA2_1_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ciclo for -> cuando sabemos cuantas veces se repite la instruccion
        //funcion como in contador: inicio, fin (condicion), y salto en el conteo
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " - ");
        }
        System.out.print(" ");
        for(int i = 10; i >= 1; i--){
            System.out.print(i + " - ");
        }
        
    }
    
}
