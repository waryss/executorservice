package com.vsct.idh.demo;

import static com.vsct.idh.demo.Common.*;

public class RainbowStep2 {

    public static void main(String[] args) {
        print("THIS IS NOT A RAINBOW\n");
        cachedThreadPool.execute(getRunnable());
        resetConsoleColor();
        print("END OF PRINT\n");
    }

    private static Runnable getRunnable() {
        return () -> RAINBOW_COLORS.forEach(Common::draw);
    }

}
