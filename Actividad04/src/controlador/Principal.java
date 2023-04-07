/**
 * Un alumno tiene una nota de concepto, otra por evaluación escrita y
una tercera de evaluación oral. Ingresar las tres notas y calcular su
promedio. Además, se deberá indicar: PROMOCIONADO cuando el
promedio sea >= 7, APROBADO si el promedio está comprendido
entre >= 4 y <7, o DESAPROBADO cuando el promedio es < 4.
 */
package controlador;

import entidad.Alumno;

public class Principal {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(10, 8, 8);
        Alumno alumno2 = new Alumno(7, 4, 5);
        Alumno alumno3 = new Alumno(1, 4, 5);
        
        alumno1.estadoPromocion();
        alumno2.estadoPromocion();
        alumno3.estadoPromocion();
    }
    
}
