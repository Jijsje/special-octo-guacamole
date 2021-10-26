package L10.ChainStoreMicro;

public class GoldCard extends Card {
    private int discount;

    public GoldCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
        this.discount = 0;
    }

    public void setDiscount(int discount) {
        try {
            if (discount >= 1 && discount <= 30) {
                this.discount = discount;
            } else throw new OutOfRangeException();
        } catch (OutOfRangeException e) {
            System.out.println("Discount needs to be between 1 and 30%.");
        }
    }

    @Override
    boolean pay(int amount) {
        credit -= (amount * (1-((double)discount/100))); // 30% == amount*0,7
        return true;
    }

    @Override
    public String toString() {
        return "GoldCard{" +
                "cardId=" + cardId +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", discount=" + discount +
                '}';
    }

    private class OutOfRangeException extends Throwable {
    }
}
