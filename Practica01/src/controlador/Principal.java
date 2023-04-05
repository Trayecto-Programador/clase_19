/**
 * Confeccionar una clase que represente un empleado.
 * Definir como atributos su nombre y su sueldo.
 * Confeccionar los métodos para la carga,
 * otro para imprimir sus datos y por último uno que imprima un mensaje
 * si debe pagar impuestos (si el sueldo supera a 3000)
 */
package controlador;

import entidades.Empleado;

public class Principal {

    public static void main(String[] args) {
        //Instanciacion de Objetos
        Empleado empleado1 = new Empleado("Marcelo", 500.00);
        Empleado empleado2 = new Empleado();

 //<---EMPLEADO 1--->
        // Solicito imprimir los datos del empleado 1
        empleado1.imprimirDatos();

        // Solicito impresion si corresponde Impuestos
        empleado1.imprimirImpuestos();

        System.out.println("<---------------------------------->");
//<---EMPLEADO 2--->
        // Carga del atributo  nombre del Empleado 2
        empleado2.cargarNombre("Silvia");
        
        //Carga del atributo sueldo del Empledo 2
        empleado2.cargarSueldo(3500.00);

        // Solicito imprimir los datos del empleado 2
        empleado2.imprimirDatos();

        // Solicito impresion si corresponde Impuestos
        empleado2.imprimirImpuestos();

    }

}
