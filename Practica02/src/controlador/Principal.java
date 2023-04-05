package controlador;

import entidades.Alumnos;

public class Principal {
    
    public static void main(String[] args) {
        //Instanciacion de Objetos
        Alumnos alumno1 = new Alumnos("Lautaro", (byte)17);
        
        //Imprimo datos en consola del alumno 1
        
        alumno1.imprimirDatosPersonales();
        alumno1.imprimirDatosEdad();
        
    }
}
