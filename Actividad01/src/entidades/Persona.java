/**
 * Confeccionar una clase que permita carga el nombre
 * y la edad de una persona. 
 * Mostrar los datos cargados. 
 * Imprimir un mensaje si es mayor
de edad (edad>=18)
 */

package entidades;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("<----Datos---->");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
    
    public void imprimirMayoriaEdad(){
        if(edad >= 18){
            System.out.println("Usted con la edad de " + edad + " es mayor"); 
        }
    }
}
