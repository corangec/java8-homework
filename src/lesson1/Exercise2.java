package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cchang on 15-07-24.
 */

//Exercise 2: Remove the words that have odd length s from the list.
//        HINT: Use one of the new methods from JDK 8.

public class Exercise2 {

    private static final String[] sa = {"test", "your", "program", "works", "or", "not"};

    public static void main(String[] args) {

        System.out.println("The Original ArrayList Items Are: ");
        Arrays.stream(sa).forEach(System.out::println);
        System.out.println("\nThe Output String Is: ");
        removeOddLengthWords(getArrayList()).forEach(System.out::println);

    }

    private static ArrayList<String> removeOddLengthWords(ArrayList<String> s) {

        s.removeIf(a -> a.length() % 2 == 0);
        return s;
    }

    private static ArrayList<String> getArrayList() {
        return new ArrayList(Arrays.asList(sa));
    }
}
