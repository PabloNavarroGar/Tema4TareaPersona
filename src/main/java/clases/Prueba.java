/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package clases;

/**
 *
 * @author pablo
 */
public class Prueba {

    public static void main(String[] args) {

//        Persona p1 = ServicioPersona.leerTecladoPersona();
//
//        System.out.println(p1);
//        //Masa corporal
//        System.out.println(p1.esMayorEad());
        
        
        Persona juan= new Persona("Juan", 15, 'H', 56.4, 1.76);
        
        //declaracion del objeto serie en la prueba de personas
        Serie s1 = new Serie("simpsons", "comedia", ".....","blabla", 24, 200);
        System.out.println(s1);//serie creada con 200
        juan.darkLikeSerie(s1);//metodo de sumar los likes
        System.out.println(s1);//201 likes
        
        System.out.println(juan);
        System.out.println("El IMC de juena es " +juan.calcularIMC());
        if(juan.esMayorEad()){
            System.out.println("Puede conducir");
            
        }else{
            System.out.println("No puede conducir");
        }
        
        Persona maria = new Persona("Maria", 25, 'M', 56, 1.70);
        System.out.println(maria);
        
        //Static siempre que dependa de un objeto , si no no se pone
        if(maria.esMayorEad()){
            System.out.println("Puede conducir");
            
        }
    }
}
