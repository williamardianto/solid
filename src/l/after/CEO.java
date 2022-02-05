package l.after;

public class CEO extends BaseEmployee implements Manager {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        salary = baseAmount * rank;
    }

    public void generatePerformanceReview() {
        System.out.println("I'm reviewing a direct report's performance.");
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}
