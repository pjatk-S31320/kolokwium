package Invioce;
//korki
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faktura {
    private String kupujacy;
    private String sprzedajacy;
    private LocalDate terminZaplaty;
    private LocalDate dataWystawienia; //pola
    private List<String > pozycjeFaktury= new ArrayList<>();

    public String getKupujacy() {
        return kupujacy;
    }

    public void setKupujacy(String kupujacy) {
        this.kupujacy = kupujacy;
    }

    public String getSprzedajacy() {
        return sprzedajacy;
    }

    public void setSprzedajacy(String sprzedajacy) {
        this.sprzedajacy = sprzedajacy;
    }

    public LocalDate getTerminZaplaty() {
        return terminZaplaty;
    }

    public void setTerminZaplaty(LocalDate terminZaplaty) {
        this.terminZaplaty = terminZaplaty;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public Faktura(String kupujacy, String sprzedajacy, LocalDate terminZaplaty, LocalDate dataWystawienia) {
        this.kupujacy = kupujacy;
        this.sprzedajacy = sprzedajacy;
        this.terminZaplaty = terminZaplaty;
        this.dataWystawienia = dataWystawienia;

    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    @Override
    public String toString() {
        return "Faktura{" +
                "kupujacy='" + kupujacy + '\'' +
                ", sprzedajacy='" + sprzedajacy + '\'' +
                ", terminZaplaty=" + terminZaplaty +
                ", dataWystawienia=" + dataWystawienia +
                ", pozycjeFaktury=" + pozycjeFaktury +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faktura faktura = (Faktura) o;
        return Objects.equals(kupujacy, faktura.kupujacy) && Objects.equals(sprzedajacy, faktura.sprzedajacy) && Objects.equals(terminZaplaty, faktura.terminZaplaty) && Objects.equals(dataWystawienia, faktura.dataWystawienia) && Objects.equals(pozycjeFaktury, faktura.pozycjeFaktury);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kupujacy, sprzedajacy, terminZaplaty, dataWystawienia, pozycjeFaktury);
    }

    public void dodajPozycjeDoFaktury(String pozycja){
        pozycjeFaktury.add(pozycja);


    }
}
