package v2.ch4.urlConnection;

import com.sun.activation.registries.MailcapParseException;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: Core_Java
 * @description: url
 * @author: Jun Wang
 * @create: 2019-02-02 16:28
 */
public class URLConnectionTest {
    public static void main(String[] args) {
        try
        {
            String urlName;
            if (args.length > 0 ) urlName = args[0];
            else urlName= "http://horstmann.com";

            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();

            if (args.length > 2)
            {
                String username = args[1];
                String password = args[2];
                String input = username + ":" + password;
                Base64.Encoder encoder = Base64.getEncoder();
                String encoding = encoder.encodeToString((input.getBytes(StandardCharsets.UTF_8)));
                connection.setRequestProperty("Authorization", "Basic " + encoding);
            }

            connection.connect();

            Map<String, List<String>> headers = connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry: headers.entrySet()
                 ) {
                String key = entry.getKey();
                for (String value:entry.getValue()
                     ) {
                    System.out.println(key + ": " + value);
                }
            }

            System.out.println("---------------");
            System.out.println("getContentType: " + connection.getContentType());
            System.out.println("getContentLength: " + connection.getContentLength());
            System.out.println("getContentEncoding: " + connection.getContentEncoding());
            System.out.println("getDate: " + connection.getDate());
            System.out.println("getExpiration: " + connection.getExpiration());
            System.out.println("getLastModified: " + connection.getLastModified());
            System.out.println("----------------");

            String encoding = connection.getContentEncoding();
            if (encoding == null) encoding = "UTF-8";
            try (Scanner in = new Scanner(connection.getInputStream(), encoding))
            {
                for (int i = 1; in.hasNextLine() && i <= 10; i++) {
                    System.out.println(in.nextLine());
                }
                if (in.hasNextLine()) System.out.println("...");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
