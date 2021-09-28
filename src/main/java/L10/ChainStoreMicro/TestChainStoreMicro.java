package L10.ChainStoreMicro;

import java.util.HashSet;

public class TestChainStoreMicro {
    static HashSet<Card> allCardHolders = new HashSet<>();

    public static void main(String[] args) {
        RegularCard a = new RegularCard(123456, "Bob", 9000);
        allCardHolders.add(a);
        RegularCard b = new RegularCard(23456, "Dirk", 9000);
        allCardHolders.add(b);
        GoldCard c = new GoldCard(6543, "Frans", 9000);
        allCardHolders.add(c);
        GoldCard d = new GoldCard(87591, "Teun", 9000);
        allCardHolders.add(d);
        allCardHolders.forEach(System.out::println);
        System.out.println("------------------------------------");

        a.pay(400); // regular
        System.out.println(a);
        c.pay(1000); // gold, no discount
        System.out.println(c);
        c.setDiscount(25);
        c.pay(1000); // should return 8000 - 750 = 7250
        System.out.println(c);
        System.out.println("------------------------------------");
        System.out.println(b.name + " probeert 10.000 af te rekenen...");
        b.pay(10000);
        System.out.println(b);
        System.out.println("------------------------------------");
        System.out.println(d.name + " probeert 10.000 af te rekenen...");
        d.pay(10000);
        System.out.println(d);


    }
}
