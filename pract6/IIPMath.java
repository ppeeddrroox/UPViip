package pract6;


/**
 * Write a description of class IIPMath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Locale;



public class IIPMath {
    /**Devuelve el seno del ángulo x, con un error máximo epsilon.
     * Precondición: x en radianes, 0 < epsilon.
     * @param x son los grados en radianes 
     * @return el seno de x
     */
    private IIPMath() {}
    /*Devuelve el seno del ángulo x, con un error máximo epsilon.
     * Precondición: x en radianes, 0 < epsilon*/
     
     public static double sin(double x, double epsilon){
         double k = 0;
         double termino = x;
         double suma = termino;
         while(Math.abs(termino) > epsilon){
             k++;
             termino = -Math.pow(x,2)/(2 * k * (2 * k + 1)) * termino;
             suma += termino;
             
        }
        return suma;
}
 /**Devuelve el seno del ángulo x, con un error máximo de 1E-15.
   * Precondición: x en radianes.
   * @param x double que representa el ángulo (en radianes) 
   * cuyo seno queremos calcular
   * @return double, seno del ángulo aportado.
   */
  
  public static double sin(double x){
      x = reducFirstCirc(x);
      return sin(x, 1E-15);
  }
  
  /** Adapta el ángulo x (en radianes) introducido en los métodos para calcular
   * el seno para entrar dentro del intervalo[-2PI, 2PI].
   * @param x double que representa el ángulo (en radianes) 
   * cuyo seno queremos calcular.
   */
  
  private static double reducFirstCirc(double x){
      return x = x % (2*Math.PI);
  }
  
 
  
}
    

 
    

    
