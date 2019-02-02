package v2.ch4.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: Core_Java
 * @description: socket
 * @author: Jun Wang
 * @create: 2019-02-02 11:03
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        try(
                Socket s = new Socket("time-a.nist.gov", 13);
                Scanner in = new Scanner(s.getInputStream(), "UTF-8")
        )
        {
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }
        }

    }
}
