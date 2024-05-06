package Invioce;
//korki
import java.time.LocalDate;

public class Mainn {
    public static void main(String[] args) {
        Faktura pierwszaFaktura = new Faktura("Olek", "Kamil", LocalDate.of(2020,5,1), LocalDate.of(2020, 8,6));
        pierwszaFaktura.dodajPozycjeDoFaktury("kwota");
        System.out.println(pierwszaFaktura); //to sring
        Faktura faktura = new Faktura("Ala", "Aleks",LocalDate.of(2020,7,9), LocalDate.of(2020,8,9));
        System.out.println(pierwszaFaktura.equals(faktura));
        System.out.println(pierwszaFaktura.getKupujacy());
        pierwszaFaktura.setKupujacy("Andrzej");
        System.out.println(pierwszaFaktura.getKupujacy()); //wypisujemy andrzeja
if (pierwszaFaktura.getDataWystawienia().isBefore(pierwszaFaktura.getTerminZaplaty())){
    System.out.println("data wystawienia przed");

}else if (pierwszaFaktura.getDataWystawienia().isAfter(pierwszaFaktura.getTerminZaplaty())){
    System.out.println("data jest po");
}
    }
}
