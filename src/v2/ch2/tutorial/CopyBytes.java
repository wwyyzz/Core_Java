package v2.ch2.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: Core_Java
 * @description: copyBytes
 * @author: Jun Wang
 * @create: 2019-01-31 17:26
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
//            in = new FileInputStream("src/v2/ch2/tutorial/xanadu.txt");
            in = new FileInputStream("src/v2/ch2/tutorial/employee.dat");
            out = new FileOutputStream("src/v2/ch2/tutorial/outagain.txt");
            int c;

            while ((c = in.read()) != -1)
            {
                System.out.println("c =" + Integer.toString(c));
                out.write(c);
            }
        }finally {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
