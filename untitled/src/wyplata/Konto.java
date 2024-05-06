package wyplata;

public class Konto {
    private String wlasciciel;
    private double stanKonta;

    public Konto(String wlasciciel, double stanKonta) { //get otrzymujesz, dostep. set ustawiasz
        this.wlasciciel = wlasciciel;
        this.stanKonta = stanKonta;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void wyswietlInformacje(){ // to string / wyswietla innformacje
        String wlasciciec = this.getWlasciciel();
        double stanKonta = this.getStanKonta();
        System.out.println("wlasciciel: " + wlasciciec);
        System.out.println("stanKonta:" + stanKonta);
    }


    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;

    }
    public void dodajPieniadze(double kwota){
        double iloscKasy = this.getStanKonta();
        double nowystan = iloscKasy + kwota;
        setStanKonta(nowystan);
    }








}
