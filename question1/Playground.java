// package question1;

// public class Playground {
//     public static void main(String[] args) {
//         testFrequency();
//     }

//     public static void testFrequency() {
//         final int MAX_PLAYS = 3000;
//         var playerOne = new Dice();
//         int min1 = 0;
//         int min2 = 11;
//         int[] frequecy;
//         boolean expected = true;
//         int currentValue = 0;
//         int currentIndex = 0;

//         // Roll the dice
//         for (int play = 1; play <= MAX_PLAYS; play++) {
//             playerOne.playerRollDice();

//         }

//         frequecy = playerOne.getFrequency();

//         for (int index = 0; index < 12; index++) {
//             // get the highest frequecy
//             currentValue = Math.min(frequecy[index], currentValue);
//         }

//         //get the index with the value
//         for(int index = 0; index<12; index++){
//             if(currentValue==frequecy[index]){
//                 currentIndex = index;
//             }
//         }

//         boolean actual = false;
//         if(currentIndex == min1 || currentIndex == min2)
//             actual = true;
//             System.out.println("Smallest:" + currentValue);
//             System.out.println("Index:" +currentIndex);
            
//             for(int index = 1; index<=2; index++){
                
//                 System.out.println(frequecy[index-1]);
//         }
//     }
// }
