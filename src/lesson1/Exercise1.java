package lesson1;//Exercise 1: Create a string that consists of the first letter of each word in
//        the list of Strings provided. HINT: Use a StringBuilder to construct the
//        result.

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {

    static String[] sa = {"test", "your", "program", "works", "or", "not"};

    public static void main(String[] args) {

        System.out.println("The Original ArrayList Items Are: ");
        Arrays.stream(sa).forEach(System.out::println);
        System.out.println("\nThe Output String Is: ");
        System.out.println(getString(getArrayList()));
    }

    public static String getString(ArrayList<String> s) {

        StringBuilder sb = new StringBuilder();
        s.forEach(a -> sb.append(a.charAt(0)));
        return sb.toString();

    }

    public static ArrayList<String> getArrayList() {
        return new ArrayList(Arrays.asList(sa));
    }
}
