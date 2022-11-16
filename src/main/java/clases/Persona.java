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
    
    
    public boolean  filtrarSexo(char sexo){
        //Filtrado dle sexo de un char a un boolean
        boolean hombreOmujer;
        hombreOmujer= (!(sexo=='H'||sexo =='M'|| sexo=='O'));
            
        return hombreOmujer;
    }
    
   public static String generarNIF() {
            String nifFinal="";
            //Usamos las dependecias lag para seleccionar la funcion del 
            String numero = RandomStringUtils.randomNumeric(8);
            int nif;
            int modulo=23;
            int numeroLetra;
            System.out.println("El numero generados son: " + numero);
            
            nif=Integer.parseInt(numero);
           
            
            
            
        return nifFinal;
}
   
   
   
   
   
   
   
}