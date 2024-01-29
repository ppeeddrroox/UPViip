package pract6;


/**
 * Write a description of class TestIIPMath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import graph2D.Graph2D;
import java.awt.Color;
import java.util.Scanner;
import java.util.Locale;
public class TestIIPMath {
   /**Escribe en la salida estándar, línea a línea, los valores de Math.sin(x) 
    * e IIPMath.sin(x), para x desde 0 a 20 radianes.
    * Muestra la diferencia en valor absoluto entre estos valores.
    */
   public static void table(){       
   double yMath, y, dif; 
   System.out.println("----------------------------------------------------------------------------");
   System.out.println("  x          Math.sin(x)            IIPMath.sin(x)                 |dif|");
   System.out.println("----------------------------------------------------------------------------");
   double xMin = 0;
   double xMax = 20;
                    
       
   for(double x = xMin; x <=xMax; x++){/*Puedes declarar x como int y hacer un casting
     en el printf o como double directamente, pero si pones de formato
    la f de float tienes que meterle un float o un double. También da error
    si la declaras como int y después pones de formato "%4.1d", porque no te
    deja formatear un entero con decimales*/
   yMath = Math.sin(x);
   y = IIPMath.sin(x);
   dif = Math.abs(yMath - y);
   
 
                                   
    System.out.printf(Locale.US,"%4.1f %23.15f %23.15f %23.15f\n", x, yMath, y, dif);                               
                                   
                                   
   }
   
  }
   public static void graph(){
      double xMin = -20;
      double xMax = 20;
      double yMin = -2;
      double yMax = 2;
      
      Graph2D gd = new Graph2D(xMin, xMax, yMin, yMax, 800, 250);
      gd.setTitle("IIPMath");
      
      //Calcular el incremento en cada paso de x (delta)
      
      double delta = (xMax - xMin)/Graph2D.INI_WIDTH;
      for(double x = xMin; x <= xMax; x = x + delta){
          double y = IIPMath.sin(x);
          gd.drawPoint(x, y, Color.BLUE, 2); //representar (x, y)
                                             // en color azul y grosor 2   
      }
      
    }
}
  
