package worker;

/**
 * Worker thread that finds the maximum value of the given numbers.
 *
 * @author OS-BKK Group
 * @author Benjapol Worakan 5710546577
 * @author Kasidit Phoncharoen 5710546151
 * @author Kundjanasith Thonglek 5710545023
 * @version 16.2.28
 */
public class MaximumWorker extends AbstractStatisticalValueWorker {
    private double[] numbers;
    public MaximumWorker(double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        double max = numbers[0];
        for (double d : numbers) {
            max = d > max ? d : max;
        }
        result = "The maximum value is " + max;
    }
}
