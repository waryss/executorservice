package com.vsct.idh.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static com.vsct.idh.demo.Common.*;

public class RainbowStep5 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Future<?>> futures = new ArrayList<>();
        print("THIS IS NOT A RAINBOW\n");
        RAINBOW_COLORS.forEach(color -> futures.add(sevenThreadsPool.submit(getRunnable(color))));
        for (Future<?> future : futures) {
            future.get();
        }
        resetConsoleColor();
        print("END OF PRINT\n");
        cachedThreadPool.shutdown();
        print("END OF ALL PROCESSES\n");
    }

    private static Runnable getRunnable(String color) {
        return () -> draw(color);
    }

}
