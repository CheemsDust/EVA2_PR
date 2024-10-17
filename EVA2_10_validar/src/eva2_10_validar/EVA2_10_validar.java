/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_validar;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_10_validar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dias;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("dame el numero del dia:  (1 a 7)");
        dias = captu.nextInt();
        captu.nextLine();
        }while(dias < 1 || dias > 7);
        
        //elegir muchas alternativas de manera mas sencilla
        switch(dias){
            case 1:
                System.out.println("Domingo");
                break; //interrumpe el switch (lo termina)
            case 2:
                System.out.println("Lunes");
                break; //interrumpe el switch (lo termina)
            case 3:
                System.out.println("Martes");
                break; //interrumpe el switch (lo termina)
            case 4:
                System.out.println("Miercoles");
                break; //interrumpe el switch (lo termina)
            case 5:
                System.out.println("Jueves");
                break; //interrumpe el switch (lo termina)
            case 6:
                System.out.println("Viernes");
                break; //interrumpe el switch (lo termina)
            case 7:
                System.out.println("Sabado");
                break; //interrumpe el switch (lo termina)
            default: //opcional, se ejecuta cuando no existe una opcion
                //no tiene break, Y ES LA ULTIMA Instruccion 
                System.out.println("numero no permitido, solo del (1 al 7)");
        }
    }
    
}
