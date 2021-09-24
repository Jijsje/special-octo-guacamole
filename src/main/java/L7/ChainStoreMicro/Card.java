package L7.ChainStoreMicro;

public abstract class Card {
    public final int cardId;
    public String name;
    double credit;

    public Card(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }

    abstract boolean pay(int amount);
}
