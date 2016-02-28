package application;

import worker.AbstractStatisticalValueWorker;
import worker.AverageWorker;
import worker.MaximumWorker;
import worker.MinimumWorker;

import java.util.ArrayList;
import java.util.List;

/**
 * Main application class, entry point of the program.
 *
 * @author OS-BKK Group
 * @author Benjapol Worakan 5710546577
 * @author Kasidit Phoncharoen 5710546151
 * @author Kundjanasith Thonglek 5710545023
 * @version 16.2.28
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR: Invalid number of arguments: " + args.length + ". Expected 1 ... *");
            System.exit(-1);
        }
        double[] input = new double[args.length];
        for (int i = 0; i < input.length; i++) {
            try {
                input[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Invalid input format! Cannot parse input.");
                System.out.println("       Please input a set of numbers, separating them using a single space.");
                System.exit(-1);
            }
        }

        List<AbstractStatisticalValueWorker> workers = new ArrayList<>();
        workers.add(new AverageWorker(input));
        workers.add(new MinimumWorker(input));
        workers.add(new MaximumWorker(input));

        workers.forEach(Thread::start);

        try {
            for (Thread t : workers) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (AbstractStatisticalValueWorker n : workers) {
            System.out.println(n.getResultString());
        }
    }
}
