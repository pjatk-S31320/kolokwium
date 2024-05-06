import java.util.HashMap;
import java.util.Map;

public class Wallet {
    private Map<String, Money> funds;  // Mapa przechowująca pieniądze w różnych walutach

    // Konstruktor portfela
    public Wallet() {
        funds = new HashMap<>();
    }

    // Dodawanie pieniędzy do portfela
    public void addMoney(Money money) {
        funds.merge(money.getCurrency(), money, (existing, incoming) -> {
            existing.addMoney(incoming);
            return existing;
        });
    }

    // Wymiana pieniędzy na inną walutę
    public void exchangeMoney(String fromCurrency, String toCurrency, double rate) {
        Money oldMoney = funds.remove(fromCurrency);
        if (oldMoney == null) {
            throw new IllegalArgumentException("No money in the specified currency");
        }
        double convertedAmount = oldMoney.getAmount() * rate;
        addMoney(new Money(convertedAmount, toCurrency));
    }

    // Metoda do porównywania pieniędzy w portfelach
    public static boolean compareWallets(Wallet w1, Wallet w2) {
        return w1.funds.equals(w2.funds);
    }

    // Metoda toString dla portfela
    @Override
    public String toString() {
        return funds.values().toString();
    }
}