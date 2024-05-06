public class Waluta {
    //nieudany arek
    private String nazwa;
    private double kurs;

    public Waluta(String nazwa, double kurs) {
        this.nazwa = nazwa;
        this.kurs = kurs;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }
}
