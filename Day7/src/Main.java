public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee(1,"marshad",20000,1000),
                new PartTimeEmployee(2,"Asma",30000,8,200)
        };

        Company company = new Company();
        company.addEmployee(employees[0]);
        company.addEmployee(employees[1]);

        System.out.println ("Printing all the employees : ");
        company.printEmployees();
        System.out.println();

        Employee findEmployee1 = company.findEmployeeByName("Fathima", company.getEmployeesCount() - 1);
        if (findEmployee1 != null) {
            findEmployee1.printEmployeeDetails();
        }
        Employee findEmployee2 = company.findEmployeeByName("Marshad", company.getEmployeesCount() - 1);
        System.out.println();
        System.out.println ("Finding employee by their name using recursion : ");
        if (findEmployee2 != null) {
            findEmployee2.printEmployeeDetails();
        }

        Employee highestPaidEmployee = company.findEmployeeWhoGetHighestSalary(company.getEmployeesCount() - 1, company.getEmployeesCount() - 2 );
        System.out.println ("\nHighest paid employee : ");
        highestPaidEmployee.printEmployeeDetails();
    }
}
