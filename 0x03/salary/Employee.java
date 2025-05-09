public class Employee {
    public double fixedSalary;

    public Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return this.fixedSalary;
    }

    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return fixedSalary * 0.10;
        } else {
            return 0.00;
        }
    }

    public double calculateTotalSalary(Department department) {
        return fixedSalary + calculateBonus(department);
    }
}
