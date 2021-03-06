package v1.ch3;

import java.util.*;

public class LotteryOdds {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i < k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }

}
