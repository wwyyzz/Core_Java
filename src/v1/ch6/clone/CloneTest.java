package v1.ch6.clone;


public class CloneTest {
    public static void main(String[] args) {
        try
        {
            Employee original = new Employee("John Q. Public", 50000);
            original.setHireDate(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDate(2002, 12, 31);
            System.out.println("original = " + original);
            System.out.println("copy = " + copy);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
