package v2.ch2.textFile;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * @program: Core_Java
 * @description: textFile
 * @author: Jun Wang
 * @create: 2019-01-31 11:03
 */
public class TextFileTest {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        System.out.println(Charset.defaultCharset());
        System.out.println(System.getProperties());

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987,12,15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989,10,1);
        staff[2] = new Employee("Tony Tester", 40000, 1990,3,15);

        try(PrintWriter out = new PrintWriter("src/v2/ch2/employee.dat", "UTF-8"))
        {
            writeDate(staff, out);
        }

        try (Scanner in = new Scanner(new FileInputStream("src/v2/ch2/employee.dat"),"UTF-8"))
        {
            Employee[] newStaff = readData(in);

            for (Employee e : newStaff)
            {
                System.out.println(e);
            }
        }
    }

    private static void writeDate(Employee[] employees, PrintWriter out) throws IOException
    {
        out.println(employees.length);

        for (Employee e:employees
             ) {
            writeEmployee(out, e);
        }
    }

    private static Employee[] readData(Scanner in)
    {
        int n = in.nextInt();
        in.nextLine();

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++)
        {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    private static void writeEmployee(PrintWriter out, Employee e)
    {
        out.println(e.getName() + "|" + e.getSalary() + "|" + e.getYear() + "|" + e.getMonth() + "|" + e.getDay());
    }

    public static Employee readEmployee(Scanner in)
    {
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        int year = Integer.parseInt(tokens[2]);
        int month = Integer.parseInt(tokens[3]);
        int day = Integer.parseInt(tokens[4]);

        return new Employee(name, salary, year, month,day);

    }
}
