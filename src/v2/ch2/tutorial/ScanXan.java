package v2.ch2.tutorial;

import java.util.Locale;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: Core_Java
 * @description: scan
 * @author: Jun Wang
 * @create: 2019-02-01 10:38
 */
public class ScanXan {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        double sum = 0;

        try
        {
//            s = new Scanner(new BufferedReader(new FileReader("src/v2/ch2/tutorial/xanadu.txt")));
            s = new Scanner(new BufferedReader(new FileReader("src/v2/ch2/tutorial/usnumbers.txt")));
            s.useLocale(Locale.US);

            while (s.hasNext())
            {
                if (s.hasNextDouble())
                {
                    sum += s.nextDouble();
                }
                else
                {
                    System.out.println(s.next());
                }

            }
        }finally {
            s.close();
        }

        System.out.println(sum);
    }
}
