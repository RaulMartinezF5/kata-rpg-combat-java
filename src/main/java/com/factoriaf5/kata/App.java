package com.factoriaf5.kata;

public final class App {
    private App() {}

    public static void main(String[] args) {
        Character bathman = new Character("Bathman");
        Character superman = new Character("Superman");

        System.out.println("//START\\");

        printCharacterHealth(bathman);
        printCharacterHealth(superman);

        System.out.println("//Round 1\\");
        bathman.dealDamage(superman, 500);
        printCharacterHealth(bathman);
        printCharacterHealth(superman);

        System.out.println("//Round 2\\");
        bathman.heal(superman, 50);
        printCharacterHealth(bathman);
        printCharacterHealth(superman);

        System.out.println("//Round 3\\");
        superman.dealDamage(bathman, 1500);
        printCharacterHealth(bathman);
        printCharacterHealth(superman);

        System.out.println("//Round 4\\");
        superman.heal(bathman, 50);
        printCharacterHealth(bathman);
        printCharacterHealth(superman);

        System.out.println("//ENDGAME\\");
    }

    private static void printCharacterHealth(Character character) {
        System.out.println(character.getName() + " health: " + character.getHealth());
    }
}

