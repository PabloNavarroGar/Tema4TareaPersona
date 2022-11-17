/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import static clases.ServicioSerie.teclado;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ServicioPersona {

    //Declarar Scanner
    public static Scanner teclado = new Scanner(System.in);

    public static Persona leerTecladoPersona() {
        //Creamos el objeto de tipo persona
        Persona persona;
        System.out.println("Como se llama la persona");
        String nombrePersona = teclado.nextLine();
        //Edad enlazado con el metodo
        System.out.println("Que edad tiene la personas");
        int edadPersona = pedirEdadPersona();

        System.out.println("Que tipo de sexo es la persona");
        char sexoPersona = teclado.next().charAt(0);
        
        
        //String dniPersona = Persona.generarNIF();
        //Peso de la persona
      
        double pesoPersona = pedirPersonaPeso();

        //Añtura de la persona
       
        double alturaPersona = pedirAlturaPersona();
        
        //IMC

        
        
     
        //instacias del objeto persona,En el contructor quitar el nif porque ya se crea en el mismo metodp
        persona = new Persona(nombrePersona, edadPersona, sexoPersona, pesoPersona, alturaPersona);
        
        return persona;
    }

    public static int pedirEdadPersona() {

        int edad;

        do {
            try {

                System.out.println("Introduzca la edad de la persona");

                edad = teclado.nextInt();

                break;
            } catch (InputMismatchException ime) {
                System.out.println("Dato Invalido,vuelva a introducirlo");
                teclado.nextLine();
            }
        } while (true);
        return edad;
    }

    public static double pedirAlturaPersona() {

        double altura;

        do {
            try {

                System.out.println("Introduzca la Altura de la persona");

                altura = teclado.nextDouble();

                break;
            } catch (InputMismatchException ime) {
                System.out.println("Dato Invalido,vuelva a introducirlo");
                teclado.nextLine();
            }
        } while (true);
        return altura;
    }

    public static double pedirPersonaPeso() {

        double peso;

        do {
            try {

                System.out.println("Introduzca el peso de la persona");

                peso = teclado.nextDouble();

                break;
            } catch (InputMismatchException ime) {
                System.out.println("Dato Invalido,vuelva a introducirlo");
                teclado.nextLine();
            }
        } while (true);
        return peso;
    }

}
