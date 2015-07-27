package lesson1;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by cchang on 15-07-24.
 */

//Exercise 4: Convert every key-value pair of the map into a string and
//        append them all into a single string, in iteration order. HINT: Again, use a
//        StringBuilder to construct the result String. Use one of the new JDK 8
//        methods for Map.

public class Exercise4 {

    private static Map tm = new TreeMap<>();

    public static void main(String[] args) {

        System.out.println("The Original ArrayList Items Are: ");
        getMap().forEach((a, b) -> System.out.println("Key: " + a + " Value: " + b));
        System.out.println("\nThe Output String Is: ");
        System.out.println(compileString(tm));

    }

    private static String compileString(Map hm) {

        StringBuilder sb = new StringBuilder();

        hm.forEach((a, b) -> sb.append(a.toString() + b.toString()));

        return sb.toString();

    }

    private static Map getMap() {

        tm.put("Key1", "Value1");
        tm.put("Key2", "Value2");
        tm.put("Key3", "Value3");

        return tm;
    }

}
