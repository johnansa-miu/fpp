package lab8.prob2;

import java.util.*;

public class EmployeeAdmin {

    /**

     Your method prepareReport should return a list of all Employees in the input table
     whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> eligibleEmployees = new ArrayList<>();

        if(table == null || socSecNums == null) return  eligibleEmployees;

        for (String ssn : socSecNums) {
            Employee employee = table.get(ssn);
            if (employee != null && employee.getSalary() > 80000) {
                eligibleEmployees.add(employee);
            }
        }

        Collections.sort(eligibleEmployees, new EmployeeSsnComparator());

        return eligibleEmployees;

    }

}
