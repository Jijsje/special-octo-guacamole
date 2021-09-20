package L4;

public class Tafels {

    static int teller = 1;

    public static void main(String[] args) {
        Tafels tafels = new Tafels();
        for(int i=1; i<=10;i++) {
            tafels.printTafel(i);
        }
    }

    public void printTafel(int factor) {
        int uitkomst = teller * factor;
        System.out.println(teller + " * " + factor + " = " + uitkomst);
        teller++;
        if (teller <= 10) {
            printTafel(factor);
        } else {
            teller = 1;
            System.out.println("EINDE!");
        }
    }
}
