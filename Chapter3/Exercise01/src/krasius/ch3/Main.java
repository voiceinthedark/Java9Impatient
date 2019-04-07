/**
 * Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees.
 */
package krasius.ch3;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        for (int i = 0; i< employees.length; i++){
            employees[i] = new Employee("Employee" + i, Math.random() * 10000);
        }

        System.out.println("Average salary for the employees: " + average(employees));
    }

    public static double average(Measurable[] objects){
        double avgSalary = 0.0;
        for(Measurable object : objects){
            avgSalary += object.getMeasure();
        }

        return avgSalary / objects.length;
    }
}
