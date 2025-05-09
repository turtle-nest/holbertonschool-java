import java.text.NumberFormat;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Department engineeringDepartment = new Department(1000, 1100);
        Department documentationDepartment = new Department(1000, 800);

        Employee engineeringEmployee1 = new Employee(2300);
        Employee engineeringEmployee2 = new Employee(3650);
        Manager engineeringManager = new Manager(5800);

        Employee documentationEmployee1 = new Employee(2500);
        Employee documentationEmployee2 = new Employee(3000);
        Manager documentationManager = new Manager(4980);

        // Création du formateur avec virgule comme séparateur décimal
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.FRANCE);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        printFormatted(engineeringEmployee1, engineeringDepartment, nf);
        printFormatted(engineeringEmployee2, engineeringDepartment, nf);
        printFormatted(engineeringManager, engineeringDepartment, nf);
        printFormatted(documentationEmployee1, documentationDepartment, nf);
        printFormatted(documentationEmployee2, documentationDepartment, nf);
        printFormatted(documentationManager, documentationDepartment, nf);
    }

    private static void printFormatted(Employee emp, Department dept, NumberFormat nf) {
        System.out.printf("Fixed Salary: %s - Total Salary: %s - Bonus Amount: %s\n",
                nf.format(emp.getFixedSalary()),
                nf.format(emp.calculateTotalSalary(dept)),
                nf.format(emp.calculateBonus(dept)));
    }
}
