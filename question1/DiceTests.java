package question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiceTests {

    @Test
    public void testDieOneFace() {
        // arrange
        var die = new Dice();
        final int MAX_VALUE = 6;
        final int MIN_VALUE = 0;

        die.rollDieOne();

        boolean expected = false;

        // actual

        boolean actual;
        if (die.getDieOne() < MIN_VALUE || die.getDieOne() > MAX_VALUE)
            actual = true;
        else
            actual = false;

        // Assert
        assertEquals(expected, actual);

    }

    // Test the second die face
    @Test
    public void testDieTwoFace() {
        // arrange
        var die = new Dice();
        final int MAX_VALUE = 6;
        final int MIN_VALUE = 0;

        die.rollDieTwo();

        boolean expected = false;

        // actual
        boolean actual;
        if (die.getDieTwo() < MIN_VALUE || die.getDieTwo() > MAX_VALUE)
            actual = true;
        else
            actual = false;

        assertEquals(expected, actual);

    }

    // Test the frequecy of distribution to be seven
    @Test
    public void testMostFrequency() {
        final int MAX_PLAYS = 3000;
        var playerOne = new Dice();
        int expected = 5;
        int[] frequecy;
        int currentLargestValue = 0;
        int currentLargestIndex = 0;

        // Roll the dice
        for (int play = 1; play <= MAX_PLAYS; play++) {
            playerOne.playerRollDice();

        }

        frequecy = playerOne.getFrequency();

        for (int index = 0; index < 12; index++) {
            // get the highest frequecy
            currentLargestValue = Math.max(frequecy[index], currentLargestValue);
        }

        // get the index with the value
        for (int index = 0; index < 12; index++) {
            if (currentLargestValue == frequecy[index]) {
                currentLargestIndex = index;
            }
        }

        int actual = currentLargestIndex;

        assertEquals(expected, actual);

    }

    // Test the frequecy of distribution to be either 0 or 11 for min index
    @Test
    public void testMinFrequency() {
        // Arrange
        final int MAX_PLAYS = 3000;
        var playerOne = new Dice();
        int min1 = 0;
        int min2 = 11;
        int[] frequecy;
        boolean expected = true;
        int currentValue = 0;
        int currentIndex = 0;

        // Roll the dice
        for (int play = 1; play <= MAX_PLAYS; play++) {
            playerOne.playerRollDice();

        }

        frequecy = playerOne.getFrequency();

        for (int index = 0; index < 12; index++) {
            // get the highest frequecy
            currentValue = Math.min(frequecy[index], currentValue);
        }

        // get the index with the value
        for (int index = 0; index < 12; index++) {
            if (currentValue == frequecy[index]) {
                currentIndex = index;
            }
        }

        boolean actual = false;
        if (currentIndex == min1 || currentIndex == min2)
            actual = true;

        assertEquals(expected, actual);

    }

}
