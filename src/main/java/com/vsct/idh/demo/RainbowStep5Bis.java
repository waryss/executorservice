package com.vsct.idh.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static com.vsct.idh.demo.Common.*;

public class RainbowStep5Bis {

    public static void main(String[] args) throws InterruptedException {
        List<Callable<String>> callableTasks = new ArrayList<>();
        print("THIS IS NOT A RAINBOW\n");
        RAINBOW_COLORS.forEach(color -> callableTasks.add(() -> {
            draw(color);
            return "TASK EXECUTION";
        }));
        sevenThreadsPool.invokeAll(callableTasks);
        resetConsoleColor();
        print("END OF PRINT\n");
        cachedThreadPool.shutdown();
        print("END OF ALL PROCESSES\n");
    }

}
