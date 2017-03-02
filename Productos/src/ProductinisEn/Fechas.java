package ProductinisEn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman
 */
public abstract class Fechas extends Productos {
/*
    public void FechadeCaducidad() {
        Calendar fechaSiste;
        fecha = JOptionPane.showInputDialog("Dame la fecha de caducidad en el formato dd-MM-yyyy");
        SimpleDateFormat formateado = new SimpleDateFormat("dd-MM-yyyy");
        fechaSiste = formateado.format(fecha);

    }
*/
    public void getStock() {
        lote = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de lote"));

    }
}
