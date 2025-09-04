import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            employee.printEmployeeDetails();
            System.out.println();
        }
    }

    public Employee findEmployeeByName(String name, int index) {

        if (index < 0) {
            System.out.println("Employee not found");
            return null;
        }

        if (employees.get(index).getName().equalsIgnoreCase(name)) {
            return employees.get(index);
        }

        return findEmployeeByName(name,index - 1);
    }

    public Employee findEmployeeWhoGetHighestSalary(int index,int topIndex) {

        if (index < 0) {
            System.out.println ("Employee not found");
            return null;
        }

        if (index == 0) {
            return employees.get(topIndex);
        }

        if (employees.get(index).returnSalary() > employees.get(topIndex).returnSalary()) {
            return findEmployeeWhoGetHighestSalary(index - 1, index);
        }

        return findEmployeeWhoGetHighestSalary(index - 1, topIndex);
    }

    public int getEmployeesCount() {
        return employees.size();
    }
}
