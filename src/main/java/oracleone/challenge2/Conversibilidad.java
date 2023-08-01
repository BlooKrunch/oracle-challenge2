
package oracleone.challenge2;

import java.math.BigDecimal;

/**
 *
 * @author dante
 */
public interface Conversibilidad {
    
    public BigDecimal convertir(Convertibles moneda, double multiplicador);
}
