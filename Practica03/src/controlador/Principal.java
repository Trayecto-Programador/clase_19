/**
 * Implementar la clase operaciones.
 * Se deben cargar dos valores enteros en el constructor,
 * calcular su suma, resta, multiplicación y división, cada una en un método,
 * imprimir dichos resultados
 */
package controlador;

import entidades.Calculo;

public class Principal {
    public static void main(String[] args) {
        Calculo calculadora1 = new Calculo(10, 10);
       
        //Operacion de suma
        calculadora1.calcularSuma();
        calculadora1.imprimirResultado();
        
        //Operacion de resta
        calculadora1.calcularResta();
        calculadora1.imprimirResultado();
        
        //Operacion de division
        calculadora1.calcularDivision();
        calculadora1.imprimirResultado();
        
        //Operacion de multiplicacion
        calculadora1.calcularProducto();
        calculadora1.imprimirResultado();
        
        
    }
}
