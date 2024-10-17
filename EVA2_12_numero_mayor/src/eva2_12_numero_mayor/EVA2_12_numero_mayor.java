/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_12_numero_mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, masgra = -9999;
        Scanner captu = new Scanner(System.in);
       do{
           System.out.println("dame el numero -1");
           num = captu.nextInt();
           captu.nextLine();
           if(num > masgra)
               masgra = num;
        }while(!(num == -1));
        System.out.println(masgra);
    }
}
