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
        
        //Creacion persona 1 introduciendo los datos con el constructor
        Persona juan= new Persona("Juan", 15, 'H', 56.4, 1.76);
        
        //declaracion del objeto serie en la prueba de personas
        Serie s1 = new Serie("Simpsons", "comedia", ".....","Disney", 24, 200);
        System.out.println(s1);//serie creada con 200 likes
        juan.darkLikeSerie(s1);//metodo de sumar los likes con la persona creada
        System.out.println(s1);//201 likes tiene si volvemos a ponerla en consola
        
       
        System.out.println("El IMC de juena es " +juan.calcularIMC());
        if(juan.esMayorEad()){
            System.out.println("Puede conducir");
            
        }else{
            System.out.println("No puede conducir");
        }
        System.out.println("-----------------------------------------");
        Persona maria = new Persona("Maria", 25, 'M', 56, 1.70);
        System.out.println(maria);
        
        //Static siempre que dependa de un objeto , si no no se pone
        if(maria.esMayorEad()){
            System.out.println("Puede conducir");
            
        }else{
            System.out.println("No puede conducir");
        }
        
        System.out.println(s1);
        maria.darkLikeSerie(s1);
        System.out.println(s1);
        
       
        System.out.println("El IMC de juena es " +maria.calcularIMC());
        //Declaracon para crear una persona por la clase que hemos creado por teclado
        Persona p1= ServicioPersona.leerTecladoPersona();
        
        System.out.println(p1);
        //LIke a la serie
        System.out.println(s1);//antes del voto
        p1.darkLikeSerie(s1);
        System.out.println(s1);//despues del voto
        
       
        System.out.println("El IMC de juena es " +p1.calcularIMC());
        
         if(p1.esMayorEad()){
            System.out.println("Puede conducir");
            
        }else{
            System.out.println("No puede conducir");
        }
    }
}
