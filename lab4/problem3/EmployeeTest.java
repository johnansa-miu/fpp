package lab4.problem3;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("John", "Doe", "111-11-1111", 800.0),
            new CommissionEmployee("Emmeh", "Asuquo", "222-22-2222", 10000.0, 0.06),
            new BasePlusCommissionEmployee("Paulinus", "Ansa", "333-33-3333", 5000.0, 0.04, 300.0),
            new HourlyEmployee("Solomon", "Wayne", "444-44-4444", 15.0, 40.0),
            new CommissionEmployee("Etim", "Edet", "555-55-5555", 2000.0, 0.05)
        };

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        double salary = 500.0;
        Employee[] lowSalaryEmployees = findSalaryList(employees, salary);

        System.out.println("\nEmployees with salary less than $" + salary + ":");
        for (Employee employee : lowSalaryEmployees) {
            System.out.println(employee);
        }
    }

    public static Employee[] findSalaryList(Employee[] col, double salary) {
        if (col == null) return new Employee[0];

        int i = 0;
        for (Employee employee : col) {
            if (employee != null && employee.getPayment() < salary) {
                i++;
            }
        }

        Employee[] employees = new Employee[i];
        int j = 0;
        for (Employee employee : col) {
            if (employee != null && employee.getPayment() < salary) {
                employees[j++] = employee;
            }
        }

        return employees;
    }
}