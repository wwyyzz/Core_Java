package v2.ch4.threaded;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: Core_Java
 * @description: threaded
 * @author: Jun Wang
 * @create: 2019-02-02 15:34
 */
public class ThreadedEchoServer {
    public static void main(String[] args) {
        try(ServerSocket s = new ServerSocket(8189))
        {
            int i = 1;

            while (true) {
                Socket incoming = s.accept();
                System.out.println("Spawning " + i);
                Runnable r = new ThreadedEchoHandler(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}

class ThreadedEchoHandler implements Runnable
{
    private  Socket incoming;

    public ThreadedEchoHandler(Socket incoming) {
        this.incoming = incoming;
    }

    @Override
    public void run() {
        try (InputStream inStream = incoming.getInputStream();
             OutputStream outStream = incoming.getOutputStream())
        {
            Scanner in = new Scanner(inStream, "UTF-8");
            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(outStream, "UTF-8")
                    ,true);
            out.println("Hello! Enter BYE to exit.");

            boolean done = false;
            while (!done && in.hasNextLine())
            {
                String line = in.nextLine();
                out.println("Echo: " + line);
                if (line.trim().equals("BYE")) done = true;
                System.out.println("server:");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
