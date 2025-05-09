public class Department {
    public double targetValue;
    public double achievedTargetValue;

    // Constructor
    public Department(double targetValue, double achievedTargetValue) {
        this.targetValue = targetValue;
        this.achievedTargetValue = achievedTargetValue;
    }

    // Getter for targetValue
    public double getTargetValue() {
        return this.targetValue;
    }

    // Getter for achievedTargerValue
    public double getAchievedTargetValue() {
        return this.achievedTargetValue;
    }

    // Method that returns true if the goal is achieved
    public boolean reachedTarget() {
        return this.achievedTargetValue >= targetValue;
    }
}
