package ch9.shuffle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }

        System.out.println("i's position is:" + Collections.binarySearch(numbers, 90));
        System.out.println("Original is:" + numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffle is:" + numbers);

        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);


    }
}
