import java.util.HashMap;

public class Main {
    static HashMap<String,Double> waluta;
    public static void main(String[] args) {

//                // Tworzenie obiektów Money
//                Money pln = new Money(100.0, "PLN");
//                Money usd = new Money(50.0, "USD");
//                Money eur = new Money(30.0, "EUR");
//
//                Biuro Kowalski = new Biuro("olek","kasjer",5000);
//
//                // Tworzenie portfela i dodawanie pieniędzy
//                Wallet wallet = new Wallet();
//                wallet.addMoney(pln);
//                wallet.addMoney(usd);
//                wallet.addMoney(eur);
//                System.out.println("Stan portfela po dodaniu pieniędzy: " + wallet);
//
//                // Dodawanie więcej pieniędzy w USD
//                wallet.addMoney(new Money(25.0, "USD"));
//                System.out.println("Stan portfela po dodaniu 25 USD: " + wallet);
//
//                // Wymiana 50 USD na EUR z kursem 0.95
//                wallet.exchangeMoney("USD", "EUR", 0.95);
//                System.out.println("Stan portfela po wymianie 50 USD na EUR: " + wallet);
//
//                // Porównanie dwóch portfeli
//                Wallet wallet2 = new Wallet();
//                wallet2.addMoney(new Money(100.0, "PLN"));
//                wallet2.addMoney(new Money(25.0, "USD"));
//                wallet2.addMoney(new Money(77.5, "EUR"));  // Dodajemy wynik wymiany z pierwszego portfela
//
//                System.out.println("Czy portfel 1 jest równy portfelowi 2? " + Wallet.compareWallets(wallet, wallet2));
//            }
//        }

//        ZADANIE Z ARKIEM

        waluta = new HashMap<>();
        waluta.put("pln", 1.00);
        waluta.put("euro", 2.00);
        waluta.put("usd", 3.00); //pierwsze / przetrzymanie wartosci pieniadza za pomoca hashmapy


        Portwel pierwszy = new Portwel(500, "pln");
        Portwel drugi = new Portwel(375, "euro");

        pierwszy.addIloscPieniedzy(500); //  drugi

        przewalutowanie(drugi, "usd");
        double wartoscPierwszego = pierwszy.getIloscPieniedzy() * waluta.get(pierwszy.getWaluta());
        double wartoscDrugiego = drugi.getIloscPieniedzy() * waluta.get(drugi.getWaluta());
        if (wartoscPierwszego > wartoscDrugiego) {
            System.out.println("wartosc pierwszego jest wieksza:" + wartoscPierwszego);

        } else if (wartoscPierwszego < wartoscDrugiego) {
            System.out.println("wartosc drugiego jest wieksza" + wartoscDrugiego);

        } else {
            System.out.println("sa rowne");


        }
    }
    private static void przewalutowanie(Portwel porfel, String nowaWaluta){
    double wartoscPortfela = porfel.getIloscPieniedzy()* waluta.get(porfel.getWaluta());
    double nowaIloscPieniedzy = wartoscPortfela / waluta.get(nowaWaluta);
    porfel.setWaluta(nowaWaluta);
    porfel.setIloscPieniedzy(nowaIloscPieniedzy);
    }
}