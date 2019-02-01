package v2.ch2.objectStream;

import v2.ch2.textFile.Employee;

import java.io.*;

/**
 * @program: Core_Java
 * @description: objectstream
 * @author: Jun Wang
 * @create: 2019-01-31 14:34
 */
public class ObjectStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee harry = new Employee("Harry hacker", 50000, 1989, 10, 1);
        Manager carl = new Manager("Carl Cracker", 75000, 1987,12,15);
        carl.setSecretary(harry);

        Manager tony = new Manager("Tony Tester", 40000, 1990,3,15);
        tony.setSecretary(harry);

        Employee[] staff = new Employee[3];

        staff[0] = carl;
        staff[1] = harry;
        staff[2] = tony;

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/v2/ch2/objectStream/employee.dat")))
        {
            out.writeObject(staff);
//            out.writeObject(12345678);
            out.writeInt(12345678);
        }



        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/v2/ch2/objectStream/employee.dat")))
        {
            Employee[] newStaff = (Employee[])in.readObject();

            for (Employee e: newStaff
                 ) {
                System.out.println(e);
            }

            int number = (int)in.readInt();
//            int number = (int)in.readObject();
            System.out.println(number);

        }
    }
}
