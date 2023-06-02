package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Worker2 {
    private String name;

    public Worker2(String name) {
        this.name = name;
    }

    public void serveCustomer() {
        System.out.println(this.name + " is serving customer");
    }
}

class CustomerServerCenter {
    private static CustomerServerCenter __instance = null;
    private boolean holiday;
    private List<Worker2> holidayWorkers;
    private List<Worker2> nonHolidayWorkers;

    public static CustomerServerCenter getInstance() {
        if (__instance == null) {
            __instance = new CustomerServerCenter();
        }
        return __instance;
    }


    public CustomerServerCenter() {

        if (__instance != null) {
            throw new RuntimeException("Singleton object cannot be initialized more than once");
        } else {
            __instance = this;
        }

        this.holiday = false;
        this.holidayWorkers = new ArrayList<>(Arrays.asList(new Worker2("holidayWorkers1"), new Worker2("holidayWorkers2"), new Worker2("holidayWorkers3")));
        this.nonHolidayWorkers = new ArrayList<>(Arrays.asList(new Worker2("nonholidayWorkers1"), new Worker2("nonholidayWorkers2"), new Worker2("nonholidayWorkers3")));


    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }

    public void serveCustomer() {
        if (this.holiday) {
            // Service by holiday workers
            for (Worker2 worker : this.holidayWorkers) {
                worker.serveCustomer();
            }
        } else {
            // Service by non-holiday workers
            for (Worker2 worker : this.nonHolidayWorkers) {
                worker.serveCustomer();
            }
        }
    }
}

public class F1_Singleton_2 {

    public static void main(String[] args) {
        CustomerServerCenter customerServiceCenter1 = CustomerServerCenter.getInstance();
        customerServiceCenter1.serveCustomer();
        CustomerServerCenter customerServiceCenter2 = CustomerServerCenter.getInstance();
        customerServiceCenter2.serveCustomer();

        customerServiceCenter1.setHoliday(true);
        customerServiceCenter1.serveCustomer();
        customerServiceCenter2.serveCustomer();
    }
}
