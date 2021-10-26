package L6;

import java.util.*;

public class Sudoku {
    public static void main(String[] args) {
        // mooi
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) { // genereer 9 getallen en zet ze in een arraylist
            numbers.add(i);
        }
        Collections.shuffle(numbers); // schuifelen

        int[][] sudoku = new int[3][3]; // aanmaken van 2D array
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                sudoku[i][j] = numbers.get(i * 3 + j); // creeer index voor numbers met 3-tallig stelsel en vul de sudoku
            }
            System.out.println(Arrays.toString(sudoku[i]));
        }
    }
}
