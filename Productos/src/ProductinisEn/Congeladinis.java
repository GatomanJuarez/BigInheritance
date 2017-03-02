
package ProductinisEn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman 
 */
public class Congeladinis extends Productos {

    private Date fecha;
    private String pais, producto;
    private float temperatura;

    public Congeladinis() {

    }

    public void giveLote() {
        System.out.println("El numero te lote del porducto congelado es:  " + lote);
    }

    public String getProduct() {
        producto = JOptionPane.showInputDialog("Dame el nombre del producto congelado");
        return producto;
    }

    public double getTemperature() {
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Dame la temperatura ideal"));
        return temperatura;
    }

    public String getCountry() {
        pais = JOptionPane.showInputDialog("Dame el paisini de origen");
        return pais;
    }

}
