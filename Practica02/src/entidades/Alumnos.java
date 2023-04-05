/**
 * Plantear una clase llamada Alumno y definir como atributos su nombre y su edad.
 * En el constructor realizar el ingreso de datos.
 * Definir otros dos métodos para imprimir los datos ingresados
 * y un mensaje si es mayor o no de edad (edad >=18)
 */
package entidades;

public class Alumnos {
  // Atributos
    private String nombre;
    private byte edad;
    
  //Metodos
    
    public Alumnos() {
    }
    //Constructores
    public Alumnos(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Accesors
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    //Personalizados
    public void imprimirDatosPersonales() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public void imprimirDatosEdad() {
        if (edad >= 18) {
            System.out.println("Su edad (" + this.edad + " años)" + " determina que usted es mayor de edad ");
        } else {
            System.out.println("Su edad (" + this.edad + " años)" + " determina que usted es menor de edad ");
        }
    }
}
