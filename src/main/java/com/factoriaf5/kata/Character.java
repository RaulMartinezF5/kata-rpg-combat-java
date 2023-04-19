package com.factoriaf5.kata;

public class Character {

    private String name;
    private int health;
    private int level;
    private boolean alive;

    public Character(String name) {
        this.name = name;
        this.health = 1000;
        this.level = 1;
        this.alive = true;
    }

    public Character() {
        this("");
    }

    public void dealDamage(Character damagedCharacter, int damage) {
        if (damagedCharacter.getHealth() <= damage) {
            damagedCharacter.setAlive(false);
            damagedCharacter.setHealth(0);
        } else {
            damagedCharacter.setHealth(damagedCharacter.getHealth() - damage);
        }
    }

    public void heal(Character healedCharacter, int healing) {
        if (!healedCharacter.isAlive()) {
            System.out.println(healedCharacter.getName() + " can not be healed");
        } else if (healedCharacter.getHealth() + healing <= 1000) {
            healedCharacter.setHealth(healedCharacter.getHealth() + healing);
        } else {
            healedCharacter.setHealth(1000);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Character [name=" + name + ", health=" + health + ", level=" + level + ", alive=" + alive + "]";
    }
}

