package worker;

/**
 * Worker thread that finds the average value of the given numbers.
 *
 * @author OS-BKK Group
 * @author Benjapol Worakan 5710546577
 * @author Kasidit Phoncharoen 5710546151
 * @author Kundjanasith Thonglek 5710545023
 * @version 16.2.28
 */
public class AverageWorker extends AbstractStatisticalValueWorker {
    private double[] numbers;
    public AverageWorker(double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        double sum = 0;
        for (double d : numbers) {
            sum += d;
        }
        double average = sum / numbers.length;
        result = "The average value is " + average;
    }

}
