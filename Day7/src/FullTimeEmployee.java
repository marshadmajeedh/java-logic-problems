public class FullTimeEmployee extends Employee {

    private final double bonusSalary;

    public FullTimeEmployee(int id, String name, double baseSalary,double bonusSalary) {
        super(id, name, baseSalary);
        this.bonusSalary = bonusSalary;
    }

    @Override
    public double calculateSalary() {
        return bonusSalary + baseSalary;
    }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
    }



}
