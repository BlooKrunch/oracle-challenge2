
package oracleone.challenge2;

/**
 *
 * @author dante
 */
public class Valores {
    
    private double pMexico = 0.060;
    private double dolar = 1;
    private double euro = 1.1;
    private double librasE = 1.28;
    private double yen = 0.0071;
    private double won = 0.00079;
    
    private final double kilometro = 1000000;
    private final double metro = 1000;
    private final double centimetro = 10;
    private final double milimetro = 1;
    private final double pulgada = 25.4;
    private final double pie = 304.8;
    private final double yarda = 914.4;
    
    private final double[] divisas = new double[]{pMexico,dolar,euro,librasE,yen,won};
    
    private final double[] longitud = new double[]{kilometro,metro,centimetro,milimetro,pulgada,pie,yarda};
    
    public double[] getValoresDiv(int index){
        return this.divisas;
    }
    
    public double[] getValoresLong(int index){
        return this.longitud;
    }

}
