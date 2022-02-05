package l.after;

public class BasicManager extends BasicEmployee implements Manager {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;

        salary = baseAmount + (rank * 4);
    }

    @Override
    public void generatePerformanceReview() {
        System.out.println("I'm reviewing a direct report's performance.");
    }
}
