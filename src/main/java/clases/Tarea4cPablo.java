/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clases;

/**
 *
 * @author pablo
 */
public class Tarea4cPablo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nif="";
        
        
        
        Persona JuanPamolo = new Persona("Juan Palomo", 42, "99999999T", 'H', 87, 1.76);
        
        System.out.println(JuanPamolo.toString());
        
        Persona.generarNIF(nif);
    }
}
