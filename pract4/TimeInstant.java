package pract4;



/**
 * Clase TimeInstant. 
 *
 * Esta clase permite representar instantes o marcas de tiempo
 * (Timestamp) con detalle de horas y minutos. Así, la clase 
 * representa un instante de tiempo o momento del día, en este
 * caso, las horas y los minutos de un día cualquiera.
 * 
 * 
 *  @author IIP. Grado en Informatica. ETSINF, UPV 
 *  @version Curso 2022-23
 */
public class TimeInstant {
    // ATRIBUTOS:
    /** 
     *  Variable entera para almacenar las horas. 
     *  Debe pertenecer al rango [0..23].
     */
    private int hours;
    /** 
     *  Variable entera para almacenar los minutos. 
     *  Debe pertenecer al rango [0..59]. 
     */
    private int minutes;    
    // CONSTRUCTORES:
    /**
     *  Crea un TimeInstant con el valor de las horas y 
     *  los minutos que recibe como argumentos,iniHours
     *  y iniMinutes, respectivamente.
     *  Precondición: 0 <= iniHours < 24, 0 <= iniMinutes < 60.
     */
    public TimeInstant(int iniHours, int iniMinutes) {
        this.hours = iniHours;
        this.minutes = iniMinutes;
    }
    public TimeInstant(){
        currentTime();    
    }
        
    /**
     * Crea un TimeInstant con el valor del instante
     * actual UTC (tiempo universal coordinado).
     */
    public void currentTime(){
        double tMinTotal = System.currentTimeMillis() / (60 * 1000);
        int tMinCurrent = (int) (tMinTotal % (24 * 60));
        int hActual = tMinCurrent / 60;
        int mActual = tMinCurrent % 60;
        this.hours = hActual;
        this.minutes = mActual;
    }
   
    // CONSULTORES Y MODIFICADORES:
    
    /** Devuelve las horas del TimeInstant. */ 
    public int getHours(){
        return hours;
    }
    
    /** Devuelve los minutos del TimeInstant. */
    public int getMinutes(){
        return minutes;
    }
    
    /** Actualiza las horas del TimeInstant. */ 
    public void setHours(int hours){
        this.hours = hours;
    }
   
    /** Actualiza los minutos del TimeInstant. */ 
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
   
    // OTROS MÉTODOS:
    /** Devuelve el TimeInstant en el formato "hh:mm". */
    public String formatoTime(){
        String hh = "0" + getHours();
        String mm = "0" + getMinutes();
        String subCadenaHH = hh.substring(hh.length() - 2);
        String subCadenaMM = mm.substring(mm.length() - 2);
        String str = subCadenaHH + " : " + subCadenaMM;
        return str;
    }
   
    /** Devuelve true si es un objeto de la clase
     *  TimeInstant y sus horas y minutos coinciden con
     *  los del objeto en curso this. 
     */
    public boolean equals(TimeInstant otro){
        if(otro instanceof TimeInstant && this.hours == otro.hours && this.minutes == otro.minutes){
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Devuelve el número de minutos transcurridos desde las 00:00 
     *  hasta el instante representado por this.
     */
    public int toMinutes(){
        int horasEnMinutos = (this.hours * 60) + this.minutes;
        return horasEnMinutos;
    }
    
    /** Compara cronológicamente el instante del objeto en curso con 
     *  el del objeto de la clase TimeInstant referenciado por tInstant.
     *  El resultado es negativo si this es anterior a tInstant,
     *  cero si son iguales, y positivo si this es posterior a tInstant. 
     *  Se calcula como la resta entre la conversión a minutos
     *  de ambos objetos.
     */
    public void compareTo(TimeInstant otro){
        if(this.hours == otro.hours && this.minutes == otro.minutes){
            System.out.println("Los objetos son iguales");        
        }
        int thisMinutes = this.toMinutes();
        int otroMinutes = otro.toMinutes();
        if(thisMinutes - otroMinutes < 0){
            System.out.println("El objeto this es anterior al otro");
        }
        if(thisMinutes - otroMinutes > 0){
            System.out.println("El objeto this es posterior al otro");
        }
    }

}
