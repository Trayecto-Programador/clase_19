/**
 * Confeccionar una clase que permita carga el nombre
 * y la edad de una persona. 
 * Mostrar los datos cargados. 
 * Imprimir un mensaje si es mayor
de edad (edad>=18)
 */
package controlador;

import entidades.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Marcelo", 15);
        
        persona1.imprimirDatos();
        persona1.imprimirMayoriaEdad();
        
        
    }
    
    
}
