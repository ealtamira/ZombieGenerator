package org.example.model;

import org.example.util.Die;

import java.util.Random;

public class Walker extends Zombie {
    private Die dice = new Die();
    private Random rand = new Random();
    public Walker(){
        setArm(rand.nextInt(3));
        setLeg(rand.nextInt(3));
        setBaseHP(rand.nextInt(30-15)+15);
        setSpeed(rand.nextInt(10-6)+6);
    }
    
// --------------------------------------------
    @Override
    public int attackRoll() {
        int action = dice.rollOneDice(20);
        int result = 0;
        if (action > 8 & action < 19){
            result = dice.roll(3,6);
            System.out.println("Hit");
        } else if (action == 20) {
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
        return "Walker{" +
                "baseHP=" + baseHP +
                ", speed=" + speed +
                ", arm=" + arm +
                ", leg=" + leg +
                ", attack=" + attackRoll() +
                '}';
    }
}
