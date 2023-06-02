package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }
    public void serveCustomer() {
        System.out.println(this.name + " is serving customer");
    }
}

class CustomerServiceCenter {
    private boolean holiday;
    private List<Worker> holidayWorkers;
    private List<Worker> nonholidayWorkers;

    public CustomerServiceCenter(boolean holiday) {
        this.holiday = holiday;
        this.holidayWorkers = new ArrayList<>(
                Arrays.asList(
                        new Worker("holidayWorkers1"), new Worker("holidayWorkers2"), new Worker("holidayWorkers3")
                )
        );

        this.nonholidayWorkers = new ArrayList<>(
                Arrays.asList(
                        new Worker("nonholidayWorkers1"), new Worker("nonholidayWorkers2"), new Worker("nonholidayWorkers3")
                )
        );
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }

    public void serveCustomer() {
        if (this.holiday) {
            // Service by holiday workers
            for (Worker worker : this.holidayWorkers) {
                worker.serveCustomer();
            }
        } else {
            // Service by non-holiday workers
            for (Worker worker : this.nonholidayWorkers) {
                worker.serveCustomer();
            }
        }
    }
}

public class F1_Singleton_1 {

    public static void main(String[] args) {
        CustomerServiceCenter customerServiceCenter1 = new CustomerServiceCenter(false);
        customerServiceCenter1.serveCustomer();
        CustomerServiceCenter customerServiceCenter2 = new CustomerServiceCenter(false);
        customerServiceCenter2.serveCustomer();

        customerServiceCenter1.setHoliday(true);
        customerServiceCenter1.serveCustomer();
        customerServiceCenter2.serveCustomer();
    }

}
