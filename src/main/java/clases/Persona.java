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
    String nombre;
    int edad;
    String nif;
    char sexo;
    double peso;
    double altura;

    public Persona(String nombre, int edad, String nif, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.nif = nif;
        this.sexo = sexo;
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
        //Filtrado dle sexo de un char a un boolean
        boolean hombreOmujer;
        hombreOmujer = (!(sexo == 'H' || sexo == 'M' || sexo == 'O'));

        return hombreOmujer;
    }

    public static String generarNIF() {
        //declaramos los char de las letras
        String nifFinal="";
        //Generamos una char poniendo en orden als letras
         char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        //Usamos las dependecias lag para seleccionar la funcion del  random con 8 digittos
        String numero = RandomStringUtils.randomNumeric(8);
        //Declaramos el nif y numero de letra
        int nif;
        
        int numeroLetra;
       //System.out.println("El numero generados son: " + numero);
        //Hacemos parse para equivaler el String con el int
        nif = Integer.parseInt(numero);
        //Tengo el nif con el parse del numero
        //division del nif entre 23 
        numeroLetra = nif % 23;
       // System.out.println(" El numero letra corresponde al "+numeroLetra);
       
        System.out.println("El dni es "+nif+letras[numeroLetra]);
        return nifFinal;
    }
        //Uso de ternario para decir si es mayor de edad o menor
    public boolean esMayorEad(){
        
        return edad >=18 && edad <=18;
      
    }

    
    //Calculo de la IMC, con la estatura elevada al cuadrado
    public float calcularIMC(){
        float imc;
        //formula= peso/estatura al cuadrado
        
        imc=(float) (peso/(Math.pow(altura, 2)));
        System.out.println("El IMC (Indice Masa Corporal) es: "+ imc);
        return imc;
    }
    //Darle like por persona a una serie
    public static void darkLikeSerie(Serie serie){
        ServicioSerie.darLike(serie);
    }
    
    
}


