package pract3;

import java.util.Scanner;

 
public class Test3 { 

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);         
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = teclado.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = teclado.nextInt();
        String hh = "0" + h;
        String mm = "0" + m;
        String subCadenaHH = hh.substring(hh.length() - 2);
        String subCadenaMM = mm.substring(mm.length() - 2);
        System.out.println("Hora introducida: " + subCadenaHH + ":" + subCadenaMM);      
        double tMinTotal = System.currentTimeMillis() / (60 * 1000);
        int tMinCurrent = (int) (tMinTotal % (24 * 60));
        int hActual = tMinCurrent / 60;
        String hActualString = "0" + hActual;
        String subCadenaHActual = hActualString.substring(hActualString.length() - 2);
        int mActual = tMinCurrent % 60;
        String mActualString = "0" + mActual;
        String subCadenaMActual = mActualString.substring(mActualString.length() - 2);
        System.out.println("Hora actual: " + subCadenaHActual + ":" + subCadenaMActual);
        int horasEnMinutos = (h * 60) + m;
        int difMinutos = Math.abs(horasEnMinutos - tMinCurrent);
        System.out.println("La diferencia en minutos es " + difMinutos);
    }    
 
}
