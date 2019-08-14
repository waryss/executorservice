package com.vsct.idh.demo;

import static com.vsct.idh.demo.Common.*;

public class RainbowStep1 {

    public static void main(String[] args) {
        print("THIS IS NOT A RAINBOW\n");
        RAINBOW_COLORS.forEach(Common::draw);
        resetConsoleColor();
        print("END OF PRINT\n");
    }

}
