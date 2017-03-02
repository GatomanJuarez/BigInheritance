
package ProductinisEn;


import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman
 */
public class Fresquinis extends Productos {

    public String pais, producto;
    public Date envazado;

    public Fresquinis() {

    }

    public void giveLote() {
        System.out.println("El numero te lote del porducto fresco:  " + lote);
    }

    public String getCountry() {
        pais = JOptionPane.showInputDialog("Dame el paisini de origen");
        return pais;
    }

    public String getProduct() {
        producto = JOptionPane.showInputDialog("Dame el nombre del producto");
        return producto;
    }

    public void getDateCaducidad() {
        int añocadu = 2020, mescadu = 05, diacadu = 25;
        if ((añocadu - año) <= 0) {
            if ((mescadu - mes) <= 0) {
                if ((diacadu - dia) <= 0) {
                    System.out.println("El producto ya caduco");
                }
            }
        } else {
            System.out.println("el producto todavia esta freco");
        }

    }
}
