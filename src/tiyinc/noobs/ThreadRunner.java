package tiyinc.noobs;

import java.text.DecimalFormat;
import java.time.Instant;

/**
 * Created by DTG2 on 08/18/16.
 */
public class ThreadRunner {

    public static void main(String[] args) {
        System.out.println("ThreadRunner running");

        int numThreadsStarted = 0;
        DecimalFormat timerFormatter = new DecimalFormat("###,###");

        long startMillis = Instant.now().toEpochMilli();

        while (true) {
            System.out.println("Number of threads started = " + numThreadsStarted);
            SampleThread sampleCode = new SampleThread();
            Thread anotherActualThread = new Thread(sampleCode);
            anotherActualThread.start();
//            localThread.run();
            numThreadsStarted++;
            if (numThreadsStarted > 10) {
                break;
            }
        }

        long endMillis = Instant.now().toEpochMilli();

        System.out.println("Ran in " + timerFormatter.format(endMillis - startMillis) + " ms");

        System.out.println("ThreadRunner done!");
    }
}
