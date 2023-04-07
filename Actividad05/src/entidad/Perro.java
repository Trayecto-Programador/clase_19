/**
 * Crear una clase Perro, con los atributos, nombre, raza, altura. Crear un
 * constructor con parámetros y el método imprimir. Cargar 5 perros.
 */
package entidad;

public class Perro {

    private String nombre, raza, altura;

    public Perro() {
    }

    public Perro(String nombre, String raza, String altura) {
        this.nombre = nombre.toUpperCase();
        this.raza = raza.toUpperCase();
        this.altura = altura;
    }

    public void imprimirDatos() {
        System.out.println("<----Datos del Perro---->");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Altura: " + this.altura);

    }

}
