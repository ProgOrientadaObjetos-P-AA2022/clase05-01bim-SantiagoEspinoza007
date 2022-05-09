/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Barrio barrio1 = new Barrio("San Sebastián");
        Barrio barrio2 = new Barrio("Valladolid");
        
        Persona persona1 = new Persona("René Elizalde", "1100909909", barrio1);
        Persona persona2 = new Persona("Gonzalo Plata", "1106042185", barrio2);
        
        System.out.printf("El barrio de %s (%s) es: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerCedula(),
                persona1.obtenerBarrio().obtenerNombre());
        
        persona1.establecerBarrio(barrio2);
        
        System.out.println("\n---------------------------------------------"
                + "-------------------\n");
        
        System.out.printf("El barrio de %s (%s) es: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerCedula(),
                persona2.obtenerBarrio().obtenerNombre());
    }
}
