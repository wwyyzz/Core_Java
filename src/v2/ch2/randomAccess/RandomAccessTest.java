//package v2.ch2.randomAccess;
//
//import v2.ch2.textFile.Employee;
//
//import java.io.DataOutputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.RandomAccessFile;
//
//
///**
// * @program: Core_Java
// * @description: randomaccess
// * @author: Jun Wang
// * @create: 2019-01-31 13:56
// */
//public class RandomAccessTest {
//    public static void main(String[] args) throws IOException {
//        Employee[] staff = new Employee[3];
//
//        staff[0] = new Employee("Carl Cracker", 75000, 1987,12,15);
//        staff[1] = new Employee("Harry Hacker", 50000, 1989,10,1);
//        staff[2] = new Employee("Tony Tester", 40000, 1990,3,15);
//
//        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("src/v2/ch2/randomAccess/employee.dat")))
//        {
//            for (Employee e:staff
//                 ) {
//                writeData(out, e);
//            }
//        }
//
//        try(RandomAccessFile in = new RandomAccessFile("src/v2/ch2/randomAccess/employee.dat", "r")
//        {
////            int n = (int)(in.length() / Employee.RECORD_SIZE);
////            Employee[] newStaff = new Employee[n];
//
//
//        }
//    }
//
//    public static void writeData(DataOutputStream out, Employee e) throws IOException
//    {
////        DataIO.writeFixedString(e.getName(), Employee.NAME_SIZE, out);
//        out.writeDouble(e.getSalary());
//
//        out.writeInt(e.getYear());
//        out.writeInt(e.getMonth());
//        out.writeInt(e.getDay());
//    }
//}
