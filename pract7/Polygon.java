package pract7;

import java.awt.Color;

public class Polygon { 
    /* COMPLETAR la definicion de atributos de instancia privados */
    private Point[] v;
    private Color color;

    /**
     * Construye un poligono a partir de un array x con las
     * abcsisas x0, x1, x2, ..., xn-1 de sus vertices, y un array y
     * con las ordenadas y0, y1, y2, ... yn-1 de sus vertices, n > 0.
     * Los vertices definen un poligono cuyos lados se extienden de 
     * un vertice al siguiente, y cerrandose en (x0,y0).
     * Por defecto, el poligono es de color azul (Color.BLUE).
     * @param x double[], las abscisas.
     * @param y double[], las ordenadas.
     */
    public Polygon(double[] x, double[] y) {
        /* COMPLETAR */
        v = new Point[x.length];
        v = new Point[y.length];
        for (int i = 0; i < x.length; i++){
            Point p = new Point(x[i], y[i]);
            v[i] = p;
        }
        color = Color.BLUE;
    }

    /** Devuelve el color del poligono.
     *  @return Color, el color. 
     */
    public Color getColor() { 
        /* COMPLETAR */
        return color;
    }
    
    /** Actualiza el color del poligono a un color dado.
     *  @param nC Color, el nuevo color.
     */
    public void setColor(Color nC) {
        /* COMPLETAR */
        color = nC;
    }
    
    /** Devuelve las abcisas de los vertices del poligono. 
     *  @return double[], las abscisas de los vertices.
     */
    public double[] verticesX() {
        
        /* COMPLETAR */ 
        double[] vertx = new double[v.length];
        for(int i=0; i < v.length; i++){
            Point p = v[i];
            vertx[i]= p.getX();
        }
        return vertx;
    }
    
    /** Devuelve las ordenadas de los vertices del poligono.
     *  @return double[], las ordenadas de los vertices. 
     */
    public double[] verticesY() {
        /* COMPLETAR */ 
        double[] verty = new double[v.length];
        for(int i=0; i< v.length; i++){
            Point p = v[i];
            verty[i]= p.getY();
        }
        return verty;    
        
    }
    
    /** Traslada los vertices del poligono: 
     *  incX en el eje X e incY en el eje Y.
     *  @param incX double, el incremento o decremento en X.
     *  @param incY double, el incremento o decremento en Y.
     */
    public void translate(double incX, double incY) {
        /* COMPLETAR */  
        for(int i=0; i < v.length; i++){
            v[i].move(v[i].getX() + incX, v[i].getY() + incY);
        }
    }
            
    /** Devuelve el perimetro del poligono.
     *  @return double, el perimetro.
     */
    public double perimeter() {
        double suma = 0;
        for (int i= 0; i < v.length - 1; i++){
            suma = suma + v[i].distance(v[i + 1]);
        }
        
        suma = suma + v[v.length -1].distance(v[0]);
        
        return suma;
        /* COMPLETAR */
    }   
          
    /** Comprueba si el Point p es interior al poligono.
     *  PRECONDICION: p no esta sobre los lados del poligono.
     *  Si el punto es interior al poligono devuelve true; 
     *  en caso contrario, devuelve false.
     *  @param p Point, el punto.
     *  @return boolean, true si el punto es interior o false
     *  si es exterior.
     */
    public boolean inside(Point p) {
        int nCuts = 0, n = v.length; 
        int cross;
        
        for (int i =0; i < n - 1; i++){
            cross = p.cross(v[i], v[i + 1]);
            if (cross == Point.CROSS || cross == Point.LOW_CROSS) {
                nCuts++;
            }
        }
        cross = p.cross(v[n - 1], v[0]);
        if (cross == Point.CROSS || cross == Point.LOW_CROSS) {
            nCuts++;
        }
        if (nCuts % 2 == 0){
            return false;
        } else {
            return true;
        }
        
        // public boolean inside (Point p) {
            //int nCuts = 0; int res;
            //for(int i = 0; i < v.length - 1 ; i++) {
                // res = p.cross(v[i], v[i +1]);
                //if(res == Point.CROSS|| res ==Point.LOW_CROSS) {
                    //nCuts++;
                //}
            //}
            //res = p.cross(v[v.length - 1], v[0];
            // if (res == Point.CROSS || res == Point.LOW_CROSS) {
                //nCuts++; }
            //return nCuts % 2 == 1;
        
    }
}/* COMPLETAR */ 
    

