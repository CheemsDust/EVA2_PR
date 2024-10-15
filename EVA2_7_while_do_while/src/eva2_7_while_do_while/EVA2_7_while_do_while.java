/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_while_do_while;

/**
 *
 * @author calza
 */
public class EVA2_7_while_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for = saemos la cantidad de repeticiones
        //while = cero o mas repteciones
        //do while = una o mas repeticiones
        //while:
        System.out.println("WHILE");
        int val = 1;
        while(val <= 10){//mientras (esto sea verdad) [repite estas instrucciones]
            System.out.print(val + " - ");
            val++;
        }
        //do while:
        System.out.println("");
        System.out.println("do while");
        val = 1;
        do{
            System.out.print(val + " - ");
            val++;
        } while(val <= 10);
    }
}
