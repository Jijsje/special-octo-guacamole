package TDD;

import java.util.Arrays;

public class Calculator {
    int add(String numbers) {
        if (numbers != null) {
            numbers = numbers.replace("\n", "0");
            String delimiter = numbers.substring(0,1);
            try {
                Integer.parseInt(delimiter); // success means the first char is a number
                delimiter = " ";
            } catch(Exception e) {
                numbers = (String) numbers.subSequence(1, numbers.length());
                // delimiter is not a number and stays the same
            }
            String[] array = numbers.split(delimiter);
            int sum = 0;
            for(String i: array) {
                sum += Integer.parseInt(i);
            }
            return sum;
        } else {return 0;}
    }
}
