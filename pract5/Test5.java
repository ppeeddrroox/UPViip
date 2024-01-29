package pract5;




import java.util.Scanner;

public class Test5 {
    /** No hay objetos de esta clase. */
    private Test5() { }
    
    /**
     * Método principal.
     * @param args array de {@link String}.
     */
    public static void main(String[] args) {
        // a. Solicitar al usuario que introduzca desde teclado los valores 
        //    de horas, minutos, día, mes y año.
        Scanner kbd = new Scanner(System.in);
        System.out.print("Horas? ");
        int hours = kbd.nextInt();
        System.out.print("Minutos? ");
        int minutes = kbd.nextInt();
        System.out.print("Día? ");
        int day = kbd.nextInt();
        System.out.print("Mes? ");
        int month = kbd.nextInt();
        System.out.print("Año? ");
        int year = kbd.nextInt();
        
        // COMPLETAR
        // b. Si los datos no corresponden a un instante y una fecha correctos, 
        //    mostrar un mensaje por pantalla.
        if (DateTime.isCorrect(hours,minutes,day,month,year)){
            DateTime dt = new DateTime(hours,minutes,day,month,year);
            DateTime now = new DateTime(day,month,year);
            
            dt.compareTo(now);
            
            if (dt.compareTo(now)==-1){
                System.out.println("dt es anterior a now");
            }
            else if (dt.compareTo(now)==0){
                System.out.println("dt es igual a now");
            }
            else if (dt.compareTo(now)==1){
                System.out.println("dt es posterior a now");
            }
        }
        else{ System.out.println("Los datos introducidos son incorrectos");}
        // c. Si lo son:
        //    - Crear un DateTime dT con estos datos.
        //    - Crear un DateTime now con la fecha y el instante UTC actuales.
        //    - Comparar dT y now.
        //    - Mostrar por pantalla si dT es anterior, posterior o igual a now.
        
    }
}
