import java.math.BigDecimal;
import java.math.RoundingMode;

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
            return Math.ceil(fixedSalary * 0.10);
        } else {
            return 0.00;
        }
    }

    public double calculateTotalSalary(Department department) {
        BigDecimal total = BigDecimal.valueOf(getFixedSalary())
                .add(BigDecimal.valueOf(calculateBonus(department)))
                .setScale(2, RoundingMode.HALF_UP);
        return total.doubleValue();
    }
}
