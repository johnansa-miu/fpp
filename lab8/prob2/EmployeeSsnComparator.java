package lab8.prob2;

import java.util.Comparator;

public class EmployeeSsnComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSsn().compareTo(e2.getSsn());
    }
}
