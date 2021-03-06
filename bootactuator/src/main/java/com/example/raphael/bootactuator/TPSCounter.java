package com.example.raphael.bootactuator;

import java.util.Calendar;
import java.util.concurrent.atomic.LongAdder;

public class TPSCounter {
    LongAdder count;
    int threshold = 2;
    Calendar expiry = null;

    TPSCounter(){
        count = new LongAdder();
        expiry = Calendar.getInstance();
        expiry.add(Calendar.MINUTE, 1);
    }

    boolean isExpired(){
        return Calendar.getInstance().after(expiry);
    }

    boolean isWeak(){
        return (count.intValue() > threshold);
    }

    void increment(){
        count.increment();
    }
}
