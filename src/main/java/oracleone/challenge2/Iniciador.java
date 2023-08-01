
package oracleone.challenge2;
import java.math.BigDecimal;
import javax.swing.JComboBox;
/**
 *
 * @author dante
 */
public class Iniciador {
    
    Convertibles obj1;
    Convertibles obj2;
    
    public Iniciador() {
         
    }
    
    public BigDecimal objetosConv(JComboBox parametros1, JComboBox parametros2,double[] valores, double multiplicador){ 
        obj1 = new Convertibles(parametros1.getSelectedItem().toString(),valores[parametros1.getSelectedIndex()]);
        obj2 = new Convertibles(parametros2.getSelectedItem().toString(),valores[parametros2.getSelectedIndex()]);
        
        return obj1.convertir(obj2,multiplicador);
    }
    
}
