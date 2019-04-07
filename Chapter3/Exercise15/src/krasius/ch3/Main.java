/**
 * Write a call to Arrays.sort that sorts employees by salary, breaking ties by
 * name. Use Comparator.thenComparing. Then do this in reverse order
 */
package krasius.ch3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Sandor", 3500);
        employees[1] = new Employee("Clegane", 4500);
        employees[2] = new Employee("The mountain", 3000);
        employees[3] = new Employee("Tyrion", 7000);
        employees[4] = new Employee("Jaime", 5000);

        System.out.println("Unsorted list: ");
        for(Employee e : employees){
            System.out.print("Name: " + e.getName() + " Salary: " + e.getSalary());
            System.out.println();
        }

        System.out.println("===================");

        /*Uncomment .reversed() for a reverse order*/
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName)/*.reversed()*/);

        System.out.println("Sorted list: ");
        for(Employee e : employees){
            System.out.print("Name: " + e.getName() + " Salary: " + e.getSalary());
            System.out.println();
        }

    }
}
