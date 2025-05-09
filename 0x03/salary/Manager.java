public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return Math.ceil(getFixedSalary() * 0.20);
        } else {
            return 0.00;
        }
    }
}
