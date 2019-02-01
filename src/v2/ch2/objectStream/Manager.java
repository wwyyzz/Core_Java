package v2.ch2.objectStream;

import v2.ch2.textFile.Employee;

/**
 * @program: Core_Java
 * @description: manager
 * @author: Jun Wang
 * @create: 2019-01-31 14:37
 */
public class Manager extends Employee {
    private Employee secretary;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }
}
