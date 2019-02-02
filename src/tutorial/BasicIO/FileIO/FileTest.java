package tutorial.BasicIO.FileIO;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @program: Core_Java
 * @description: fileIO
 * @author: Jun Wang
 * @create: 2019-02-02 09:54
 */
public class FileTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/tmp/foo");
//        Path p2 = Paths.get(args[0]);
        Path p3 = Paths.get(URI.create("file:///Users/joe/FileTest.java"));
        Path p4 = FileSystems.getDefault().getPath("users/sally");

        System.out.println("p1 :" + p1);
//        System.out.println("p2 :" + p2);
        System.out.println("p3 :" + p3);
        System.out.println("p4 :" + p4);

//        Path path = Paths.get("/home/joe/foo");
        Path path = Paths.get("sally/bar");

        System.out.println("toString: " + path.toString());
        System.out.println("getFilename: " + path.getFileName());
        System.out.println("getName(0): " + path.getName(0));
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0,2): " + path.subpath(0, 2));
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
    }
}
