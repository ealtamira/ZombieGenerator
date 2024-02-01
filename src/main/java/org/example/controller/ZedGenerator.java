package org.example.controller;


import org.example.model.Runner;
import org.example.model.Tank;
import org.example.model.Walker;
import org.example.model.Zombie;

import java.util.ArrayList;
import java.util.Random;
public class ZedGenerator {
    private Zombie walker = new Walker();
    private Zombie runner = new Runner();
    private Zombie tank = new Tank();
    private Random rand = new Random();
    private ArrayList<Zombie> zed = new ArrayList<Zombie>();
    public void gen1Zed(){
        int sum = rand.nextInt(3);
        ArrayList<Zombie> temp = new ArrayList<>();
        switch (sum){
            case 0:
                zed.add(walker);
                break;
            case 1:
                zed.add(runner);
                break;
            case 2:
                zed.add(tank);
                break;
        }
        System.out.println(zed);
        zed = temp;
    }

    public void genSomeZed(){
       int sum = rand.nextInt(10-1)+1;
        for (int i = 0; i < sum; i++) {
            gen1Zed();
        }
        System.out.println(zed.toString());
    }

    public void genUserNumZed(int userNum) {
            for (int i = 0; i < userNum; i++) {
               gen1Zed();
            }
            System.out.println(zed.toString());
    }
}
