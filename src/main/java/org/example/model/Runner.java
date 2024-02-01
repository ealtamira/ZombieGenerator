package org.example.model;

import org.example.util.Die;

import java.util.Random;

public class Runner extends Zombie {
    private Die dice = new Die();
    private Random rand = new Random();
    private int climbSpeed;

    public int getClimbSpeed() {
        return climbSpeed;
    }

    public void setClimbSpeed(int climbSpeed) {
        this.climbSpeed = climbSpeed;
    }

    public Runner(){
        setArm(rand.nextInt(3));
        setLeg(rand.nextInt(3));
        setBaseHP(rand.nextInt(22-10)+10);
        setSpeed(rand.nextInt(25-15)+15);
        setClimbSpeed(divide());
    }

    public int divide(){
        float result = (getSpeed() * (1/3));
        if (result <= 0) {
            result = 0;
        }
        return (int) result;
    }

    @Override
    public int attackRoll() {
        int action = dice.rollOneDice(20);
        int result = 0;
        if (action > 5 & action < 18){
            result = dice.roll(3,6);
            System.out.println("Hit");
        } else if (action >= 19) {
            int damage = dice.roll(3,6);
            result = damage * 2;
            System.out.println("Crit");
        } else {
            System.out.println("Miss");
        }
        return result;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "climbSpeed=" + climbSpeed +
                ", baseHP=" + baseHP +
                ", speed=" + speed +
                ", arm=" + arm +
                ", leg=" + leg +
                ", attack=" + attackRoll() +
                '}';
    }
}
