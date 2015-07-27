import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cchang on 15-07-24.
 */

//Exercise 5: Create a new thread that prints the numbers from the list.
//        HINT: This is a straightforward Lambda expression.

public class Exercise5 {

    static String[] sa = {"test1", "y1our2", "pro2gram3", "works5", "or8", "not1"};

    public static void main(String[] args) {

        System.out.println("The Original ArrayList Items Are: ");
        Arrays.stream(sa).forEach(System.out::println);
        System.out.println("\nThe Output String Is: ");
        printNumbers(getArrayList());

    }

    private static void printNumbers(ArrayList<String> al) {

        Thread thread = new Thread(() -> al.forEach(a ->System.out.println(a.replaceAll("[^\\d.]", "").trim())));
        thread.start();

    }

    public static ArrayList<String> getArrayList() {
        return new ArrayList(Arrays.asList(sa));
    }
}
