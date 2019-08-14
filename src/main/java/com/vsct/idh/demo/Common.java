package com.vsct.idh.demo;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;
import static java.lang.Thread.currentThread;

class Common {

    static final List<String> RAINBOW_COLORS = List.of(
            "\u001B[101m", "\u001B[43m", "\u001B[103m", "\u001B[42m",
            "\u001B[44m", "\u001B[104m", "\u001B[45m");

    static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    static ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
    static final ExecutorService sevenThreadsPool = Executors.newFixedThreadPool(7);

    static void draw(String val) {
        try {
            TimeUnit.SECONDS.sleep(2);
            out.print("\u001B[30m" + val + " Thread : " + currentThread().getName() + " ");
        } catch (InterruptedException e) {
            out.println(e);
        }
    }

    static void resetConsoleColor() {
        out.print("\u001B[0m\n\n");
    }

    static void print(String val) {
        out.println("\u001B[30m"  + "Thread " + currentThread().getName() + " : " + val);
    }
}
