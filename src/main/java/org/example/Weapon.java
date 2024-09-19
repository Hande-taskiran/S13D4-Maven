package org.example;

public enum Weapon {
    SWORD(5, 3.0),
    ARROW(4, 4.0);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }


}
