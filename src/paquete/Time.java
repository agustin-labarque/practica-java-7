package paquete;

import java.util.Date;

public class Time {

    private long start;
    private long stop;

    public Time(){
        start = 0;
        stop = 0;
    }

    public void start(){
        start = System.currentTimeMillis();
        stop = 0;
    }

    public void stop(){
        stop = System.currentTimeMillis();
    }

    /*
    este metodo debe ser invocado unicamente luego de haber hecho start() y stop(), en ese orden
     */
    public long elapsedTime(){
        return stop - start;
    }

}
