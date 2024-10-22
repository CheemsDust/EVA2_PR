/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos;

/**
 *
 * @author calza
 */
public class EVA2_17_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Lunes", "Martes", "Miercoles", "jueves", "viernes", "Sabado", "Domingo"};
        int valores[] = {20, 50, 100, 200, 500, 1000};
        for (int i = 0; i <diasSemana.length; i++) {
            System.out.print(diasSemana[i] + "-");
        }
        System.out.println("");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores + "-");
        }
    }
    
}
