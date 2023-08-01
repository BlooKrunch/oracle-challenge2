
package oracleone.challenge2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author dante
 */
public class Convertibles implements Conversibilidad {
    
    private String nombre = "";
    private double valor = 0;
    BigDecimal conversion;
    
    public Convertibles(String nombre, double valor){
        this.nombre = nombre;
        this.valor = valor;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getValor(){
        return this.valor;
    }

    @Override
    public BigDecimal convertir(Convertibles moneda, double multiplicador) {
        conversion = new BigDecimal((this.valor / moneda.getValor()) * multiplicador);
        conversion = conversion.setScale(5,RoundingMode.HALF_EVEN);
        return conversion;
    }
}
