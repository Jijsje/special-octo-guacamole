package L7.ChainStoreMicro;

public class TestChainStoreMicro {
    public static void main(String[] args) {
        RegularCard rc = new RegularCard(123456, "Bob", 9000);
        rc.pay(400);
        System.out.println(rc);
    }
}
