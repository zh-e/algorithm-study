package com.zhe.other.wheelTimer;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {


        HashedWheelTimer timer = new HashedWheelTimer(Executors.defaultThreadFactory(), 1, TimeUnit.MILLISECONDS, 10, 0);

        timer.newTimeout(new TestTimeTask(), 10, TimeUnit.MILLISECONDS);

        System.out.println("end");
    }

    private static class TestTimeTask implements TimerTask {
        @Override
        public void run(Timeout timeout) throws Exception {
            System.out.printf("run, time:%s", LocalDateTime.now().toString());
        }
    }

}
