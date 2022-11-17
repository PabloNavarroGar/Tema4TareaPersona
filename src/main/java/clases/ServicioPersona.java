/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import static clases.ServicioSerie.teclado;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ServicioPersona {

    //Declarar Scanner
    public static Scanner teclado = new Scanner(System.in);

    public static Persona leerTecladoPersona() {
        //creamos el objeto de tipo persona
        Persona persona;
        System.out.println("Como se llama la persona");
        String nombrePersona = teclado.nextLine();
        System.out.println("Que edad tiene la personas");
        int edadPersona = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Que tipo de sexo es la persona");
        char sexoPersona = teclado.next().charAt(0);
        System.out.println("DNI de la persona generado");
        String dniPersona = Persona.generarNIF();

        System.out.println("Cuanto pesa la persona");
        double pesoPersona = teclado.nextInt();
      

        teclado.nextLine();
        System.out.println("Cuanto mide la persona");
        double alturaPersona = teclado.nextInt();

        //instacias del objeto persona
        persona = new Persona(nombrePersona, edadPersona, dniPersona, sexoPersona, pesoPersona, alturaPersona);

        return persona;
    }

}
