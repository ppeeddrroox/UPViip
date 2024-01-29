package pract4;
import java.util.Scanner;

public class Test4 {
    
    /** No hay objetos de esta clase */
    private Test4() { }
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = kbd.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = kbd.nextInt();
        TimeInstant ti = new TimeInstant();
        ti.setHours(h);
        ti.setMinutes(m);
        System.out.println("Hora introducida: " + ti.formatoTime());
        TimeInstant ti2 = new TimeInstant();
        System.out.println("Hora actual: " + ti2.formatoTime());
        System.out.println("Diferencia en minutos entre ambas horas: " + ti.toMinutes());
        System.out.println("Es anterior la hora introducida a la hora actual? ");
        ti.compareTo(ti2);
    }    
 
}   
