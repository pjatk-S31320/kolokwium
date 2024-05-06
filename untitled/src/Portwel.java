import java.util.HashMap;

public class Portwel {
    private double iloscPieniedzy;
    private String waluta;

    public double getIloscPieniedzy() {
        return iloscPieniedzy;
    }

    public void setIloscPieniedzy(double iloscPieniedzy) {
        this.iloscPieniedzy = iloscPieniedzy;
    }
    public void addIloscPieniedzy(double iloscPieniedzyDoDodania) { // drugi
        this.iloscPieniedzy += iloscPieniedzyDoDodania;
    }

    public  String getWaluta() {
        return waluta;
    }

    public void setWaluta( String nowaWaluta) {

        this.waluta = nowaWaluta;
        
    }

    public Portwel(double iloscPieniedzy, String waluta) {
        this.iloscPieniedzy = iloscPieniedzy;
        this.waluta = waluta;


    }
}
