/**
 * Crear una clase Perro, con los atributos, nombre, raza, altura. Crear un
 * constructor con parámetros y el método imprimir. Cargar 5 perros.
 */
package controlador;

import entidad.Perro;
import javax.swing.JOptionPane;

public class Principal {

    static String nombre, raza, altura;
    static Perro[] perros = new Perro[5];

    public static void main(String[] args) {
        cargarMascotas();
        imprimir();
    }

    static void cargarMascotas() {
        for (int i = 0; i < perros.length; i++) {
            nombre = JOptionPane.showInputDialog("Ingrese el  nombre de su perro");
            raza = JOptionPane.showInputDialog("Ingrese la  raza de su perro");
            altura = JOptionPane.showInputDialog("Ingrese la altura de su perro");

            Perro perro = new Perro(nombre, raza, altura);
            perros[i] = perro;

        }

    }

    static void imprimir() {
        for (Perro perro : perros) {
            perro.imprimirDatos();
        }
    }

}
