package com.vsct.idh.demo;

import static com.vsct.idh.demo.Common.*;

public class RainbowStep4 {

    public static void main(String[] args) {
        print("THIS IS NOT A RAINBOW\n");
        RAINBOW_COLORS.forEach(color -> sevenThreadsPool.execute(getRunnable(color)));
        resetConsoleColor();
        print("END OF PRINT\n");
        cachedThreadPool.shutdown();
        print("END OF ALL PROCESSES\n");
    }

    private static Runnable getRunnable(String color) {
        return () -> draw(color);
    }

}
