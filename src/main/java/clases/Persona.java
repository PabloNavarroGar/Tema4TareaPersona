/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pablo
 */
public class Persona {

    //Atributos de instancia
    private String nombre;
    private int edad;
    private String nif;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.nif = generarNIF();
        this.sexo = asignarSexo(sexo);

//        if(!filtrarSexo(sexo)){
//            this.sexo=sexo;
//        }
        this.peso = peso;
        this.altura = altura;
        
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

   

    public boolean filtrarSexo(char sexo) {
        //Filtrado del sexo de un char a un boolean

        return (sexo == 'H' || sexo == 'M' || sexo == 'O');
    }

    private char asignarSexo(char sexo) {

        char sex = filtrarSexo(sexo) ? sexo : 'O';
        return sex;
    }

    private static String generarNIF() {
        //declaramos los char de las letras
        
        //Generamos una char poniendo en orden als letras
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        //Usamos las dependecias lag para seleccionar la funcion del  random con 8 digittos
        String nif = RandomStringUtils.randomNumeric(8);
        //Declaramos el nif y numero de letra
        int nifnumero;

        int numeroLetra;
        //System.out.println("El numero generados son: " + numero);
        //Hacemos parse para equivaler el String con el int
        nifnumero = Integer.parseInt(nif);
        //Tengo el nif con el parse del numero
        //division del nif entre 23 
        numeroLetra = nifnumero % 23;
       

        System.out.println(nifnumero + letras[numeroLetra]);
        //devuelvo el String del numero aleatorio junto con el char letra y el numero de la letra
        return nif+letras[numeroLetra];
    }
    //Uso de ternario para decir si es mayor de edad o menor

    public  boolean esMayorEad() {

        return this.edad >= 18;
    }
    
    

    //Calculo de la IMC, con la estatura elevada al cuadrado
    public float calcularIMC() {

       //Al estar declararo el peso y la altura en el objeto hacemos la formula en el return
           
        return (float) (this.peso / (Math.pow(this.altura, 2)));
    }

    //Darle like por persona a una serie
    public void darkLikeSerie(Serie serie) {
        serie.darLike();
    }

}
