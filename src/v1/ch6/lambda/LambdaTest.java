package v1.ch6.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Predicate;

/**
 * @program: Core_Java
 * @description: lambdatest
 * @author: Jun Wang
 * @create: 2019-01-16 08:58
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] plants = new String[]{"Mecury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted by Length:");
        Arrays.sort(plants, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plants));

        Arrays.sort(plants, String::compareToIgnoreCase);
        System.out.println("Sorted ignoreCase:");
        System.out.println(Arrays.toString(plants));



        Timer t = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program");
        System.exit(0);

    }
}
