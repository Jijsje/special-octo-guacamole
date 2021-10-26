package L4;

public class Seasons {

    enum Temperature {cold, warm}

    public static void main(String[] args) {
        Temperature output;
        switch(args[0]) {
            case "spring":
            case "summer":
                System.out.println(Temperature.warm);
                break;
            case "fall":
            case "winter":
                System.out.println(Temperature.cold);
                break;
            default:
                System.out.println("unknown");
        }
    }
}