
package oracleone.challenge2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JComboBox;

/**
 *
 * @author dante
 */
public class ConvTemp {
    
    String newTemp;
    
    public ConvTemp(){
    
    }
    
     public BigDecimal objetosTemp(JComboBox parametros1, JComboBox parametros2, double multiplicador){
        BigDecimal temperatura = null;
        this.newTemp = parametros1.getSelectedItem().toString() + " - " + parametros2.getSelectedItem().toString();
        
        switch(this.newTemp){
            
            case "Celsius (ºC) - Celsius (ºC)":
                temperatura = new BigDecimal(multiplicador);
                break;
            case "Celsius (ºC) - Fahrenheit (ºF)":
                temperatura = new BigDecimal((multiplicador * 9/5) + 32);
                break;
            case "Celsius (ºC) - Kelvin (K)":
                temperatura = new BigDecimal(multiplicador + 273.15);
                break;
                
            case "Fahrenheit (ºF) - Fahrenheit (ºF)":
                temperatura = new BigDecimal(multiplicador);
                break;
            case "Fahrenheit (ºF) - Celsius (ºC)":
                temperatura = new BigDecimal((multiplicador - 32) * 5/9);  
                break;
            case "Fahrenheit (ºF) - Kelvin (K)":
                temperatura = new BigDecimal((multiplicador - 32) * 5/9 + 273.15);
                break;
                
            case "Kelvin (K) - Kelvin (K)":
                temperatura = new BigDecimal(multiplicador);
                break;
            case "Kelvin (K) - Celsius (ºC)":
                temperatura = new BigDecimal(multiplicador - 273.15);  
                break;
            case "Kelvin (K) - Fahrenheit (ºF)":
                temperatura = new BigDecimal((multiplicador - 273.15) * 9/5 + 32);
                break;
                
        }
        temperatura = temperatura.setScale(3, RoundingMode.DOWN);
        return temperatura;
    }
    
}
