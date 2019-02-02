package v2.ch4.inetAddress;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @program: Core_Java
 * @description: inetaddress
 * @author: Jun Wang
 * @create: 2019-02-02 11:25
 */
public class InetAddressTest
{
    public static void main(String[] args) throws IOException {
        if (args.length > 0)
        {
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for ( InetAddress a:addresses
                 ) {
                System.out.println(a);
            }

        }
        else
        {
            InetAddress localHostAddress = InetAddress.getLocalHost();
            System.out.println(localHostAddress);
        }
    }
}
