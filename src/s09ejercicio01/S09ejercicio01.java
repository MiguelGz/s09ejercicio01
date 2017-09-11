/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println(" INGRESE LA DISTANCIA ENTRE EL CENTRO DEL PENTAGONO A UNO DE SUS VERTICES: ");
        double r = input.nextDouble();
        
        double s = (2*r)* Math.sin(Math.PI / 5); //ancho de un lado
        double area= (5*Math.pow(s, 2)) / (4 * Math.tan(Math.PI /5));
        
        
        
        System.out.println(" EL AREA DEL PENTAGONO ES :" + area);
    }
    
}
