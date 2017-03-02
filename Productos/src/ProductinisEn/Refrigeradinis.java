
package ProductinisEn;


import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman
 */
public class Refrigeradinis extends Productos {

    public String empresaSu, producto;
    public Date fecha;
    public float temperatura;

    public Refrigeradinis() {
    }

    public void giveLote() {
        System.out.println("El numero te lote del porducto refriquerado es:  " + lote);
    }

    public String getCompany() {
        empresaSu = JOptionPane.showInputDialog("Dame la empresa proveedora");

        return empresaSu;
    }

    public Date getDateOfProduct() {
        return fecha;
    }

    public double getTemperature() {
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Dame la temperatura ideal"));
        return temperatura;
    }

}
