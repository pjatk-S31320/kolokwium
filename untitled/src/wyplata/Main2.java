package wyplata;
//szymon
public class Main2 {
    public static void main(String[] args) {
        Konto konto = new Konto("Olek", 566);
        konto.wyswietlInformacje();
        konto.dodajPieniadze(570);
        konto.wyswietlInformacje();
    }
}
