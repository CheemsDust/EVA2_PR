/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_8_acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usu,con;
        Scanner captu = new Scanner(System.in);
        //pantalla de validacion: usuario y contraseña
        do{
        System.out.println("usuario: ");
        usu = captu.nextLine();
        System.out.println("contraseña: ");
        con = captu.nextLine();
        }while(!(usu.equals("admin") && con.equals("1234")));
        
        //´programa principal
        System.out.println("programa principal!!");
    }
    
}
