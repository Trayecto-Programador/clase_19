/**
 * Plantear una clase Triangulo en la que posee tres números que
 * corresponderán a los lados de un triángulo. Determinar qué tipo de
 * triángulo es. NOTA: No es triángulo cuando la suma de dos de sus
 * lados es inferior al tercero. EQUILATERO: los tres lados iguales.
 * ISOSCELES: solo dos de sus lados iguales. ESCALENO: los tres
 * lados distintos.
 *
 */
package controlador;

import entidades.Triangulo;

public class Principal {

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(10, 10, 30);
        Triangulo triangulo2 = new Triangulo(10, 10, 10);
        Triangulo triangulo3 = new Triangulo(10, 10, 15);
        Triangulo triangulo4 = new Triangulo(10, 15, 20);
        
        triangulo1.tipoTriangulos();
        triangulo2.tipoTriangulos();
        triangulo3.tipoTriangulos();
        triangulo4.tipoTriangulos();
    }

}
