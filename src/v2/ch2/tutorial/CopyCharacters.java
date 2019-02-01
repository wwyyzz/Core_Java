package v2.ch2.tutorial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: Core_Java
 * @description: copycharacters
 * @author: Jun Wang
 * @create: 2019-02-01 09:25
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("src/v2/ch2/tutorial/xanadu.txt");
//            in = new FileReader("src/v2/ch2/tutorial/employee.dat");
            out = new FileWriter("src/v2/ch2/tutorial/characteroutput.txt");

            int c;

            while ((c = in.read()) != -1)
            {
                System.out.println("c =" + Integer.toString(c));
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
