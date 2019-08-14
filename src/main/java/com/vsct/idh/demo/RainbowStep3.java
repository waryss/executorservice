package com.vsct.idh.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static com.vsct.idh.demo.Common.*;

public class RainbowStep3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        print("THIS IS NOT A RAINBOW\n");
        final Future<?> result = cachedThreadPool.submit(getRunnable());
        result.get();
        resetConsoleColor();
        print("END OF PRINT\n");
        cachedThreadPool.shutdown();
        print("END OF ALL PROCESSES\n");
    }

    private static Runnable getRunnable() {
        return () -> RAINBOW_COLORS.forEach(Common::draw);
    }

}
