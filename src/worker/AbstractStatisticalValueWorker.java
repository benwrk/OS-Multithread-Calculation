package worker;

/**
 * An abstract worker thread, as a template for workers that
 * calculate the statistical value of the given numbers.
 *
 * @author OS-BKK Group
 * @author Benjapol Worakan 5710546577
 * @author Kasidit Phoncharoen 5710546151
 * @author Kundjanasith Thonglek 5710545023
 * @version 16.2.28
 */
public abstract class AbstractStatisticalValueWorker extends Thread {
    protected String result;
    public AbstractStatisticalValueWorker() {
        result = "Not yet processed";
    }
    public String getResultString() {
        return result;
    }
}
