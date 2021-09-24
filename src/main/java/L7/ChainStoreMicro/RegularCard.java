package L7.ChainStoreMicro;

public class RegularCard extends Card{

    public RegularCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
    }

    @Override
    boolean pay(int amount) {
        if(amount>credit) {
            return false;
        }
        credit -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "RegularCard{" +
                "cardId=" + cardId +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
