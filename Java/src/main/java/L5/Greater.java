package L5;

public class Greater {

    public static void main(String[] args) {
        int a = 43, b = 67;
        System.out.println("Methode 1: " + greatest(a, b));
        String c = "HokusPokus", d = "PilatesPas";
        System.out.println("Methode 2: " + greatest(c, d));
        String e = "SuperCali", f = "FragilisticExpialiDocious";
        System.out.println("Methode 2: " + greatest(e, f));
        int[] rijtje = new int[]{1, 15, 65, 108, 92, 44};
        System.out.println("Methode 3: " + greatest(rijtje));
        System.out.println("Methode 4: " + factorial(12));
    }

    public static int greatest(int a, int b) {
        return Integer.max(a, b);
    }

    public static String greatest(String a, String b) {
        int result = Integer.compare(a.length(), b.length());
        if (result == 0) {
            return "Beide Strings zijn van gelijke lengte.";
        } else if (result < 0) {
            return "B is de grootste";
        } else {
            return "A is de grootste.";
        }
    }

    public static int greatest(int... inputs) {
        int grootste = inputs[0];
        for (int input : inputs) {
            if (input > grootste) {
                grootste = input;
            }
        }
        return grootste;
    }

    public static int factorial(int base) {
        if (base == 0) {
            System.out.println("0! = 1");
            return 1;
        } else {
            int sum = base;
            System.out.print(base + "! = " + base);
            while (base > 1) {
                sum = sum * --base;
                System.out.print(" * " + base);
            }
            System.out.println(" ");
            return sum;
        }
    }
}
