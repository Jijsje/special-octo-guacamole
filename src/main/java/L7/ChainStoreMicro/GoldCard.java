package L7.ChainStoreMicro;

public class GoldCard extends Card {
    private int discount;

    public GoldCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
    }

    @Override
    boolean pay(int amount) {
        return false;
    }
}
