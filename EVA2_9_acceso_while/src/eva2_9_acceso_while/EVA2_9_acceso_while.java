/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_9_acceso_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usu = "",con = "";
        Scanner captu = new Scanner(System.in);
        //pantalla de validacion: usuario y contraseña
        while(!(usu.equals("admin") && con.equals("1234"))){
        System.out.println("usuario: ");
        usu = captu.nextLine();
        System.out.println("contraseña: ");
        con = captu.nextLine();
        }
        
        //´programa principal
        System.out.println("programa principal!!");
    }
    
}
