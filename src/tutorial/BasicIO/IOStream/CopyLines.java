package tutorial.BasicIO.IOStream;

import java.io.*;

/**
 * @program: Core_Java
 * @description: copyLines
 * @author: Jun Wang
 * @create: 2019-02-01 09:34
 */
public class CopyLines {


    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            in = new BufferedReader(new FileReader("src/v2/ch2/tutorial/xanadu.txt"));
//            in = new BufferedReader(new FileReader("src/v2/ch2/tutorial/employee.dat"));
            out = new PrintWriter(new FileWriter("src/v2/ch2/tutorial/lineoutput.txt"));

            String l;

            while ((l = in.readLine()) != null)
            {
                System.out.println("l =" + l);
                out.println(l);
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
