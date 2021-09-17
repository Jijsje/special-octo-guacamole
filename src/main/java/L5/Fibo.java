public class Fibo {

    public static void main(String[] args) {
        for (long i = 0; i <= 92; i++) {
            System.out.println(run(i));
        }
        System.out.println(run(1, 5));
        System.out.println(run(2, 5));
        System.out.println( run(3, 5));
        System.out.println(run(4, 6));
        System.out.println(run(8, 8));
        System.out.println(run(4, 5, 6));
        System.out.println(run(1, 3, 6));
        System.out.println(run(6));
    }

    public static long run(long n) {
        return run(1, n);
    }

    public static long run(long start, long n) {
        return run(start, start, n);
    }

    public static long run(long f1, long f2, long n) {
        long leading = f1;
        long lagging = f2;
        long teller = 1;
        while (teller <= n) {
            if (teller % 2 == 0) {
                System.out.print(lagging + " ");
                lagging = leading + lagging;
            } else {
                System.out.print(leading + " ");
                leading = leading + lagging;
            }
            teller++;
        }
        System.out.println();
        double leadingD = Double.valueOf(leading), laggingD = Double.valueOf(lagging);
        double gr = ((leadingD>laggingD) ? leadingD/laggingD : laggingD/leadingD);
        System.out.println("Golden ratio approximation: " + gr);
        return Math.abs(leading - lagging);
    }
}
