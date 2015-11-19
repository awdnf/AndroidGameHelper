package br.edu.ifspsaocarlos.sdm.gameshelper.model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by alexandrewiggert on 15/11/15.
 */
public class Dice {

    private Integer sides;

    private static final Random RAND = new Random();

    public Dice() {

    }

    public Dice(Integer sides) {
        this.sides = sides;
    }

    public Integer roll() {
        return RAND.nextInt(sides) + 1;
    }

    public void setSides(Integer sides) {
        this.sides = sides;
    }

    public Integer getSides() {
        return this.sides;
    }

}
