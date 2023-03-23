package question1;

/*
 * This is the application for the dice question
 * lab No. 3
 * 
 * @author Gilbert Ng'andu
 * @date    21-03-2023
 */
public class Program {
    public static void main(String[] args) {
        var player = new Dice(); // player object to spin the die
        final int MAX_ROLLS = 2000;// 36000000; //the number of times a die must be rolled

        // you need to update the frequency
        for (int roll = 1; roll <= MAX_ROLLS; roll++) {
            player.playerRollDice();
        }

        printResult(player.getFrequency());

    }

    public static void printResult(int[] frequency) {
        System.out.println("\n--------------------------------");
        System.out.print("Sum\t\tFrequency\n");
        System.out.println("--------------------------------");

        int index = 0;

        for (int row = 2; row <= 12; row++) {

            System.out.printf(row+"\t\t"+frequency[index++]+"\n");

        }
    }

}
