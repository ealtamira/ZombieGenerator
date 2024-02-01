package org.example.model;

import org.example.util.Die;

import java.util.Random;

public class Tank extends Zombie{
    private Die dice = new Die();
    private Random rand = new Random();

    public Tank(){
        setArm(rand.nextInt(3));
        setLeg(rand.nextInt(3));
        setBaseHP(rand.nextInt(70-45)+45);
        setSpeed(rand.nextInt(8-4)+4);
    }

    // --------------------------------------------
    @Override
    public int attackRoll() {
        int damageModifier = rand.nextInt(20-10)+10;
        int action = dice.rollOneDice(20);
        int result = 0;
        if (action > 10 & action < 19){
            result = dice.roll(3,6);
            result = result + damageModifier;
            System.out.println("Hit");
        } else if (action == 20) {
            int damage = dice.roll(3,6);
            damage = damage + damageModifier;
            result = damage * 3;
            System.out.println("Crit");
        }else {
            System.out.println("Miss");
        }
        return result;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "baseHP=" + baseHP +
                ", speed=" + speed +
                ", arm=" + arm +
                ", leg=" + leg +
                ", attack=" + attackRoll() +
                '}';
    }
}
