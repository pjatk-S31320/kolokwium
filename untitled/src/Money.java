public class Money {
    private double amount;  // Ilość pieniędzy
    private String currency;  // Waluta pieniędzy

    // Konstruktor do tworzenia pieniędzy


    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Getter dla ilości
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Getter dla waluty
    public String getCurrency() {
        return currency;
    }

    // Metoda do dodawania pieniędzy tej samej waluty
    public void addMoney(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot add different currencies");
        }
        this.amount += other.amount;
    }

    // Metoda toString dla łatwiejszej reprezentacji obiektu
    @Override
    public String toString() {
        return String.format("%.2f %s", amount, currency);
    }
}