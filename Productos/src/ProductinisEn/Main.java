
package ProductinisEn;


/**
 *
 * @author By Gatoman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("-----------------------");
        Fresquinis uno = new Fresquinis();
        String paiss = uno.getCountry();
        System.out.println("El pais es " + paiss);
        Fresquinis dos = new Fresquinis();
        String pro = dos.getProduct();
        System.out.println("El producto freco es " + pro);
        Fresquinis jo = new Fresquinis();
        jo.getDateCaducidad();
        Fresquinis ji = new Fresquinis();
        ji.giveLote();
        System.out.println("-----------------------");

        Congeladinis tres = new Congeladinis();
        String prod = tres.getProduct();
        System.out.println("El producto freco es " + prod);
        Congeladinis cuatro = new Congeladinis();
        double tempe = cuatro.getTemperature();
        System.out.println("La temperatura ideal es " + tempe);
        Congeladinis cinco = new Congeladinis();
        String pais = cinco.getCountry();
        System.out.println("El pais  es " + pais);
        Congeladinis tre = new Congeladinis();
        tre.giveLote();
        System.out.println("-----------------------");

        Refrigeradinis seis = new Refrigeradinis();
        String empre = seis.getCompany();
        System.out.println("La empresa provedora es " + empre);
        Refrigeradinis siete = new Refrigeradinis();
        siete.getDateOfProduct();
        Refrigeradinis ocho = new Refrigeradinis();
        double temp = ocho.getTemperature();
        System.out.println("La temperatura ideal es " + tempe);
        Refrigeradinis cuatr = new Refrigeradinis();
        cuatr.giveLote();
        System.out.println("-----------------------");
    }

}
