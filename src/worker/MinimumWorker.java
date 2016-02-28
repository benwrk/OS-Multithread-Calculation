package worker;

/**
 * Worker thread that finds the minimum value of the given numbers.
 *
 * @author OS-BKK Group
 * @author Benjapol Worakan 5710546577
 * @author Kasidit Phoncharoen 5710546151
 * @author Kundjanasith Thonglek 5710545023
 * @version 16.2.28
 */
public class MinimumWorker extends AbstractStatisticalValueWorker {
    private double[] numbers;
    public MinimumWorker(double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        double min = numbers[0];
        for (double d : numbers) {
            min = d < min ? d : min;
        }
        result = "The minimum value is " + min;
    }
}
