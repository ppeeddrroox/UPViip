package pract5;


public class TimeInstant {
    // ATRIBUTOS:
    /** 
     *  Variable entera para almacenar las hours. 
     *  Debe pertenecer al rango [0..23].
     */
    private int hours;
    /** 
     *  Variable entera para almacenar los minutes. 
     *  Debe pertenecer al rango [0..59]. 
     */
    private int minutes;    
    
    // CONSTRUCTORES:
    /**
     *  Crea un TimeInstant con el valor de las hours y 
     *  los minutes que recibe como argumentos,iniHours
     *  y iniMinutes, respectivamente.
     *  Precondición: 0 <= iniHours < 24, 0 <= iniMinutes < 60.
     */
   
    public TimeInstant(int iniHours,int iniMinutes){
        hours=iniHours;
        minutes=iniMinutes;
    }
        
    /**
     * Crea un TimeInstant con el valor del instante
     * actual UTC (tiempo universal coordinado).
     */
    public TimeInstant(){
        
    long currentmil= System.currentTimeMillis();
    double currentmin= currentmil/(1000*60);
    int minActual= (int) currentmin%(24*60);
    hours= (int) minActual/60;
    minutes= (int) minActual%60;
    

}
   
    // CONSULTORES Y MODIFICADORES:
    
    /** Devuelve las hours del TimeInstant. */ 
    public int getHours(){
        return hours;
    }
    
    /** Devuelve los minutes del TimeInstant. */
    public int getMinutes(){
        return minutes;
    }
    
    /** Actualiza las hours del TimeInstant. */ 
    public void setHours(int hora2){
        hours=hora2;
       
    }
   
    /** Actualiza los minutes del TimeInstant. */ 
    public void setMinutes(int minutes2){
      minutes=minutes2;   
    
    }
    
   
    
    // OTROS MÉTODOS:
    /** Devuelve el TimeInstant en el formato "hh:mm". */
    public String toString(){
        
        String hh="0" + hours;
        String mm="0" + minutes;
        
       return hh.substring(hh.length()-2) + ":" + mm.substring(mm.length()-2);
    }
   
    /** Devuelve true si o es un objeto de la clase
     *  TimeInstant y sus hours y minutes coinciden con
     *  los del objeto en curso this. 
     */
    public boolean equals(Object o){
        return o instanceof TimeInstant
        && hours==((TimeInstant)o).hours
        && minutes==((TimeInstant)o).minutes;
    }
    
    /** Devuelve el número de minutes transcurridos desde las 00:00 
     *  hasta el instante representado por this.
     */
    public int toMinutes(){
        return (hours*60)+minutes;
    }
    
    /** Compara cronológicamente el instante del objeto en curso con 
     *  el del objeto de la clase TimeInstant referenciado por tInstant.
     *  El resultado es negativo si this es anterior a tInstant,
     *  cero si son iguales, y positivo si this es posterior a tInstant. 
     *  Se calcula como la resta entre la conversión a minutes
     *  de ambos objetos.
     */
      public int compareTo(TimeInstant tInstant){
          return -tInstant.minutes+this.minutes;
      }


    // ACTIVIDAD EXTRA:
    /** Devuelve un TimeInstant a partir de la descripción 
     *  textual (String) en formato "hh:mm".
     */
    public static TimeInstant valueOf(String textInstant){
        int hora3= Integer.parseInt(textInstant.substring(0,2)); 
        int minutes3= Integer.parseInt(textInstant.substring(3,5)); 
        return new TimeInstant(hora3, minutes3);
    }
  
}
