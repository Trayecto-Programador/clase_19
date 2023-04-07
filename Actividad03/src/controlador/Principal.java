/**
 * Plantear la clase Empleado de un comercio en la que cobran su sueldo
de acuerdo a la categoría que poseen (A o B). Ingresar el nombre del
empleado, los años de trabajo en la compañía y su categoría. Calcular
el sueldo sabiendo que la categoría A cobra $650 y la B $450. Por
cada año de antigüedad tienen un plus de $30. Mostrar el resultado. 
 */
package controlador;

import entidad.Empleado;

public class Principal {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado('A', "Marcelo", (byte)30);
        Empleado empleado2 = new Empleado('b', "Silvia", (byte)10);
        Empleado empleado3 = new Empleado('C', "Silvia", (byte)10);
        
        empleado1.calcularSueldo();
        empleado2.calcularSueldo();
        empleado3.calcularSueldo();
    }
}
