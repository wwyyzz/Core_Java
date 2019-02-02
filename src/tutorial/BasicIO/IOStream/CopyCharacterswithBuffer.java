package tutorial.BasicIO.IOStream;

import java.io.*;

/**
 * @program: Core_Java
 * @description: copycharacters
 * @author: Jun Wang
 * @create: 2019-02-01 09:25
 */
public class CopyCharacterswithBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try{
            in = new BufferedReader(new FileReader("src/v2/ch2/tutorial/xanadu.txt"));
//            in = new FileReader("src/v2/ch2/tutorial/employee.dat");
            out = new BufferedWriter(new FileWriter("src/v2/ch2/tutorial/characteroutputwithbuffer.txt"));

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
