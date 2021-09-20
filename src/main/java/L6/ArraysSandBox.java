package L6;

import java.util.Arrays;

public class ArraysSandBox {
    public static void main(String[] args) {

        arrayDoubler(new long[]{1, 2, 3, 4, 5});
        multiply(new long[]{1, 2, 3, 4, 5}, 2);
        new ArraysSandBox().sommetjes(args);
    }

    public static void arrayDoubler(long[] oldArray) {

        long[] resultArray = new long[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            resultArray[i] = oldArray[i];
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public static void multiply(long[] input, int multiplier) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= multiplier;
        }
        System.out.println(Arrays.toString(input));

    }

    public void sommetjes(String[] args){
        int[] alleGetallen = new int[args.length];
        int totaal = 0;
        for(int i = 0; i<args.length; i++){
            alleGetallen[i] = Integer.valueOf(args[i]);
            totaal = totaal + alleGetallen[i];
        }
        System.out.println("Totaal = " + totaal);
    }

}
