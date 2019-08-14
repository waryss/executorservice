package com.vsct.idh.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static com.vsct.idh.demo.Common.*;

public class RainbowStep3Bis {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        print("THIS IS NOT A RAINBOW\n");
        final Future<String> result = cachedThreadPool.submit(getCallable());
        print("\n" + result.get());
        resetConsoleColor();
        print("END OF PRINT\n");
        cachedThreadPool.shutdown();
        print("END OF ALL PROCESSES\n");
    }

    private static Callable<String> getCallable() {
        return () -> {
            for (String color : RAINBOW_COLORS) {
                draw(color);
            }
            return "TASK EXECUTION";
        };
    }

}
