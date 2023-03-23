package question1;

/*
 * This is the class for the dice problem
 * lab No. 3
 * 
 * @author  Gilbert Ng'andu
 * @date    21-03-2023
 */

import java.util.Random;

public class Dice {
    private int dieOne;
    private int dieTwo;
    private int[] frequency;

    // create the constructor
    public Dice() {
        this(1, 1);
    }

    // initialize the variables
    public Dice(int dieOne, int dieTwo) {
        this.dieOne = dieOne;
        this.dieTwo = dieTwo;
        this.frequency = new int[12];
    }

    // getter for die one
    public int getDieOne() {
        return this.dieOne;
    }

    // getter for die two
    public int getDieTwo() {
        return this.dieTwo;
    }

    // roll the first dice
    public void rollDieOne() {
        this.dieOne = this.rollDice();
    }

    // roll the second dice
    public void rollDieTwo() {
        this.dieTwo = this.rollDice();
    }

    // getter for frequency
    public int[] getFrequency() {
        return this.frequency;
    }

    // let the player roll the dice
    public void playerRollDice() {
        this.rollDieOne();
        this.rollDieTwo();
        updateFrequency();
    }

    // generate the random value for die one
    private int rollDice() {
        var rollDie = new Random();
        int dieFace = rollDie.nextInt(6) + 1;

        return dieFace;
    }

    // update the frequency
    private void updateFrequency() {
        int sum = this.dieOne + this.dieTwo;
        for (int index = 2; index <= 12; index++) {
            if (sum == (index)) {
                this.frequency[index - 2]++;
            }
        }

    }

}
