package v1.ch9.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String ,Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Copper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));


        Set<String> keys = staff.keySet();
        System.out.println("keySet =" + keys);

        for (String s:keys
             ) {
            System.out.println("staff: " + staff.get(s).getName());
        }

        Collection<Employee> values = staff.values();
        for (Employee e:values
             ) {
            System.out.println(e.getName());
        }
        System.out.println("valueSet" + values);


        Set entrys = staff.entrySet();
        System.out.println("entrySet = " + entrys);

        staff.forEach((k,v) ->{
                System.out.println(" k = " + k + " v = " + v.getName());
                }
        );



        System.out.println(staff);

        staff.remove("456-62-5527");
        staff.put("456-62-5527", new Employee("Francesca Miller"));

        System.out.println(staff.get("157-62-7935").getName());

        staff.forEach((k, v) ->
                System.out.println("key=" + k + ", value= " + v.getName())
        );


    }
}
