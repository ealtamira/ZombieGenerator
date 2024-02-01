package org.example.util;

import java.util.Random;

public class Die {
    private Random rand = new Random();
    public int rollOneDice(int sides){
        return rand.nextInt(1, sides + 1);
    }

    public int roll(int count, int sides){
        int iReturn = 0;
        for (int iCount = 0; iCount < count; iCount++){
            iReturn += rollOneDice(sides);
        }
        return iReturn;
    }

}
