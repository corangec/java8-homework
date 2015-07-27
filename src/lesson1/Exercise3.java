package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cchang on 15-07-24.
 */

//Exercise 3: Replace every word in the list with its upper case equivalent.
//        HINT: Again, use one of the new methods from JDK 8.

public class Exercise3 {

    private static final String[] sa = {"test", "your", "program", "works", "or", "not"};

    public static void main(String[] args) {

        System.out.println("The Original ArrayList Items Are: ");
        Arrays.stream(sa).forEach(System.out::println);
        System.out.println("\nThe Output String Is: ");
        replaceAllToUpperCase(getArrayList()).forEach(System.out::println);

    }

    private static ArrayList<String> replaceAllToUpperCase(ArrayList<String> al) {

        al.replaceAll(String::toUpperCase);

        return al;
    }

    private static ArrayList<String> getArrayList() {
        return new ArrayList(Arrays.asList(sa));
    }
}
