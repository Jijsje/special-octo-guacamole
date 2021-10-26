package L7.Person;

public class Android extends Human implements  Chargeable{

    public int level = 0;

    @Override
    public String greet() {
        return "I'm only half human, but human still..." + " My energy level is " + level + "%.";
    }

    @Override
    public int charge(int amount) {
        if(level+amount <= 100) {
            level = level + amount;
            System.out.println("Ahh, refreshing..");
            return level;
        } else {
            System.out.println("Vegeta! What does the scouter say about his power level?" +
            "\nIt's over 100!!!!" +
            "\nWhat?! 100?! There's no way that could be right!");
            return level;
        }
    }
}
