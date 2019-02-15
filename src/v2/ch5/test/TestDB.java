package v2.ch5.test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

/**
 * @program: Core_Java
 * @description: testDB
 * @author: Jun Wang
 * @create: 2019-02-13 09:01
 */
public class TestDB {
    public static void main(String[] args) throws IOException {
        try
        {
            runTest();
        }
        catch (SQLException ex)
        {
            for (Throwable t : ex)
                t.printStackTrace();
        }
    }

    public static void runTest() throws SQLException, IOException
    {
        try(Connection conn = getConnection();
            Statement stat = conn.createStatement())
        {
            stat.executeUpdate("CREATE TABLE Greetings(Message CHAR(20))");
            stat.executeUpdate("INSERT INTO Greetings VALUES('Hello, World!')");

            System.out.println("Starting querying...:");

//            try (ResultSet result = stat.executeQuery("SELECT * FROM Greetings"))
            try (ResultSet result = stat.executeQuery("SELECT * FROM Books"))
            {
                if (result.next())
                {
                    System.out.println("query Greetings");
                    System.out.println("result:");
                    System.out.println(result.getString(1));
                }
                stat.executeUpdate("DROP TABLE Greetings");
            }
        }
    }

    public static Connection getConnection() throws SQLException,IOException
    {
        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get("src/v2/ch5/test/database.properties")))
        {
            props.load(in);
        }

        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }
}
