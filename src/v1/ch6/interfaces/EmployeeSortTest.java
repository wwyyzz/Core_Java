package v1.ch6.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry      Hacker", 35000);
        staff[1] = new Employee("Carl   Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

//        Arrays.sort(staff);
        Comparator comp = new LengthComparator();
//        Arrays.sort(staff, comp);

//        lambda sort

//        Arrays.sort(staff, Comparator.comparing(Employee::getName));
        Arrays.sort(staff, Comparator.comparing(Employee::getSalary));



        for (Employee e :staff)
        {
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary());
        }
    }


}

class LengthComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
