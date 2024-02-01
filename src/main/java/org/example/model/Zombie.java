package org.example.model;

import org.example.util.Die;

public abstract class Zombie {
    protected int baseHP;
    protected int speed;
    protected int arm;
    protected int leg;
//////////////////////////////////////////////////
    public int getBaseHP() {
        return baseHP;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }
////////////////////////////////////////////////////
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
//////////////////////////////////////////////////
    public int getArm() {
        return arm;
    }

    public void setArm(int arm) {
        this.arm = arm;
    }
/////////////////////////////////////////////////
    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
///////////////////////////////////////////
    public abstract int attackRoll();

//////////////////////////////////////////////////////
    public int roll(int count, int side){
        Die dice = new Die();
        int result = dice.roll(count, side);
        return result;
    }
//////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Zombie{" +
                "baseHP=" + baseHP +
                ", speed=" + speed +
                ", arm=" + arm +
                ", leg=" + leg +
                '}';
    }
}
