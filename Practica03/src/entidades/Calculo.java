/**
 * Implementar la clase operaciones. 
 * Se deben cargar dos valores enteros en el constructor, 
 * calcular su suma, resta, multiplicación y división, 
 * cada una en un método, imprimir dichos resultados
 */
package entidades;

public class Calculo {
//Atributos
    int valor1, valor2, resultado;

    
//Metodos
    
    //Constructores
    public Calculo() {
    }

    public Calculo(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = 0;
    }

    //Getters y Setters
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    //Personalizados
   
   public void calcularSuma(){
       resultado = valor1 + valor2;
   }
   
   public void calcularResta(){
       resultado = valor1 - valor2;
   }
   public void calcularDivision(){
       resultado = valor1 / valor2;
   }
   public void calcularProducto(){
       resultado = valor1 * valor2;
   }
   public void imprimirResultado(){
       System.out.println("El resultado de la operacion matematica es: "+ resultado);
   }
}
