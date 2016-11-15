package tiyinc.noobs;

/**
 * Created by DTG2 on 08/18/16.
 */
public class SampleThread implements Runnable {

    public void run() {
        System.out.println("Running " + Thread.currentThread().getId());

        try {
            Thread.sleep(2000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("Done running " + Thread.currentThread().getId());
    }
}

