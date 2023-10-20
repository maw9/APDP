package design_patterns;

import java.util.ArrayList;
import java.util.List;

public class CompositeUsage {

    public static void main(String[] args) {
        Employee ceo = new Employee("Kaung Maw", "CEO", 1500000);
        Employee headMarketing = new Employee("Mg Mg", "Head of Marketing", 1000000);
        Employee headSales = new Employee("Mya Mya", "Head of Sales", 1100000);
        Employee saleEx1 = new Employee("Zaw Zaw", "Sale Executive", 800000);
        Employee saleEx2 = new Employee("Thin Thin", "Sale Executive", 800000);
        Employee clerk1 = new Employee("Kyaw Kyaw", "Clerk", 500000);
        Employee clerk2 = new Employee("Khin Khin", "Clerk", 500000);

        ceo.addSubordinate(headMarketing);
        ceo.addSubordinate(headSales);
        headMarketing.addSubordinate(clerk1);
        headMarketing.addSubordinate(clerk2);
        headSales.addSubordinate(saleEx1);
        headSales.addSubordinate(saleEx2);

        System.out.println(ceo);

        for (Employee each: ceo.getSubordinates()) {
            System.out.println(each.toString());
            for (Employee eachSub: each.getSubordinates())
                System.out.println(eachSub.toString());
        }
    }

}

class Employee {

    private String name;
    private String position;
    private float salary;
    private final List<Employee> subordinates;

    public Employee(String name, String position, float salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
