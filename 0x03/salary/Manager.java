import java.math.BigDecimal;
import java.math.RoundingMode;


public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return BigDecimal.valueOf(getFixedSalary())
                    .multiply(BigDecimal.valueOf(0.20))
                    .setScale(2, RoundingMode.HALF_UP)
                    .doubleValue();
        } else {
            return 0.0;
        }
    }

    @Override
    public double calculateTotalSalary(Department department) {
        BigDecimal total = BigDecimal.valueOf(getFixedSalary())
                .add(BigDecimal.valueOf(calculateBonus(department)))
                .setScale(2, RoundingMode.HALF_UP);
        return total.doubleValue();
    }
}
