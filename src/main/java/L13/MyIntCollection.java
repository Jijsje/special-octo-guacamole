package L13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyIntCollection<E extends Object> {

    List<E> internalList;
    private int length;
    int doubler = 1;

    public static void main(String[] args) {
        MyIntCollection<Integer> myColl = new MyIntCollection<>();
        myColl.createList();
        System.out.println("Oorspronkelijke lengte: " + myColl.getLength());
        System.out.println("------------------------");
        myColl.add(18);
        myColl.add(36);
        myColl.add(41);
        myColl.add(52);
        myColl.printArray();
        System.out.println("Lengte na toevoegen 4 items: " + myColl.getLength());
        System.out.println("------------------------");
        myColl.add(316);
        myColl.printArray();
        System.out.println("Lengte na toevoegen 5 items: " + myColl.getLength());
        System.out.println("------------------------");
        myColl.add(7);
        myColl.add(8);
        myColl.add(9);
        myColl.add(10);
        myColl.printArray();
        System.out.println("Lengte na toevoegen 9 items: " + myColl.getLength());
        System.out.println("------------------------");


        MyIntCollection<String> myOtherColl = new MyIntCollection<>();
        myOtherColl.createList();
        myOtherColl.add("Jan");
        myOtherColl.add("Huigen");
        myOtherColl.add("in");
        myOtherColl.add("de");
        myOtherColl.add("ton");
        myOtherColl.getLength();
        myOtherColl.printArray();
        System.out.println("Lengte van de nieuwe List<String>: " + myColl.getLength());
        System.out.println("------------------------");
    }

    private void createList() {
        List<E> emptyList = new ArrayList<>(Arrays.asList(null, null, null, null)); // er wordt een lijst gevuld met null objecten
        if (internalList == null) {
            internalList = emptyList;
        } else { // als de lijst bestaat moet er verdubbeld worden
            for (int i = 1; i <= doubler; i++) {
                internalList.addAll(emptyList);
            }
            doubler *= 2;
        }
    }

    private int getLength() {
        length = internalList.size();
        return length;
    }

    private boolean anyNulls() {
        return internalList.contains(null);
    }

    void add(E invoer) {
        if (anyNulls()) {
            // vind de eerste null en vervang deze met de invoer
            internalList.set(internalList.indexOf(null), invoer);
        } else {
            createList();
            add(invoer);
        }
    }

    public void printArray() {
        for (E element : internalList) {
            System.out.println(element);
        }
    }

}
