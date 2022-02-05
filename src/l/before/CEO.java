package l.before;

public class CEO extends Employee {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        salary = baseAmount * rank;
    }

    @Override
    public void assignManager(Employee manager) {
        throw new UnsupportedOperationException("The CEO has no manager");
    }

    public void generatePerformanceReview() {
        System.out.println("I'm reviewing a direct report's performance.");
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}
