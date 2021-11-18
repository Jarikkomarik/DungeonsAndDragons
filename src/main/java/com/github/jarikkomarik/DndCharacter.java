package com.github.jarikkomarik;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Random;


@ToString
@Getter
public class DndCharacter {
    @ToString.Exclude
    private Random r = new Random();

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitPoint;

    public DndCharacter(){
        strength = generateAbilityValue(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
        dexterity = generateAbilityValue(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
        constitution = generateAbilityValue(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
        intelligence = generateAbilityValue(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
        wisdom = generateAbilityValue(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
        charisma = generateAbilityValue(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
        hitPoint = calculateModifier(constitution);
    }

    public int calculateModifier(int constitution) {
        return 10 + (int)Math.floor(((double) constitution - 10) / 2);
    }

    public int generateAbilityValue(int a, int b, int c, int d) {
        return Arrays
                .stream(new int []{a,b,c,d})
                .sorted()
                .skip(1)
                .sum();
    }
}
