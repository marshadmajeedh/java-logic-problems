public class PartTimeEmployee extends Employee {

    private final int hoursWorked;
    private final double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * hourlyRate) + baseSalary;
    }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
    }
}
