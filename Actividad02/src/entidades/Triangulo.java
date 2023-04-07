/**
 * Plantear una clase Triangulo en la que posee tres números que
corresponderán a los lados de un triángulo. Determinar qué tipo de
triángulo es. NOTA: No es triángulo cuando la suma de dos de sus
lados es inferior al tercero. EQUILATERO: los tres lados iguales.
ISOSCELES: solo dos de sus lados iguales. ESCALENO: los tres
lados distintos. 
 */
package entidades;

public class Triangulo {
   private int lado1, lado2, lado3;
   private boolean es_triangulo; 

    public Triangulo() {
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.es_triangulo = true;
    }
    
   private void esTriangulo(){
       es_triangulo = lado1 + lado2 < lado3;
   }
   
   public void tipoTriangulos(){
       esTriangulo();
       if(!es_triangulo){
          if(lado1 == lado2 && lado1 == lado3){
              System.out.println("El tipo de triangulo es: Equilatero");
          } else{
              if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                  System.out.println("El tipo de triangulo es: Isosceles");
              }else{
                  if(lado1 != lado2 && lado1 != lado3){
                      System.out.println("El tipo de triangulo es: Escaleno");
                  }
                  }
              }
          }else{
           System.out.println("No califica como un tipo de triangulo");
       }
   }
}
