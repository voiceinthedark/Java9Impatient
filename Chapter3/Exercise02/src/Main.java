/**
 * Continue with the preceding exercise and provide a method Measurable
 * largest(Measurable[] objects). Use it to find the name of the employee with
 * the largest salary. Why do you need a cast?
 */
public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        for (int i = 0; i< employees.length; i++){
            employees[i] = new Employee("Employee" + i, Math.random() * 10000);
        }

        System.out.println("Average salary for the employees: " + average(employees));
        Employee e = (Employee) largest(employees);
        System.out.println("The employee with the largest salary is: " + e.getName());
    }

    public static double average(Measurable[] objects){
        double avgSalary = 0.0;
        for(Measurable object : objects){
            avgSalary += object.getMeasure();
        }

        return avgSalary / objects.length;
    }

    /**
     * Method used to find the name of the employee with the largest income
     * @param objects
     * @return
     */
    public static Measurable largest(Measurable[] objects){
        double largest = 0.0;
        String name = "";
        for(Measurable object : objects){
            if(object instanceof Employee){
                Employee e = (Employee) object;
                if(e.getMeasure() > largest){
                    largest = e.getMeasure();
                    name = e.getName();
                }
            }
        }

        return new Employee(name, largest);
    }
}
