package question2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        int choice = 0;
        var input = new Scanner(System.in);
        var plane1 = new Reservation();
    
        do{
            System.out.print("\nWelcome to flight 828\n\n");
            System.out.print("\nSelect seat to reserve\n1. First Class\n2. Economy\n3. Exit\nChoice: ");
            choice = input.nextInt();

            //attempt to reserve seat
            if(plane1.reserveSeat(choice, 0)){
                //print receipt
                printReceipt(plane1.getReservedSeatNumber(), plane1.getReservedSeatClass());
            }
            else{
                //Ask if user would like to reserve in another section
                System.out.println("Unfortunately, seats are full in "+plane1.getClass(choice)+", would you like to reserve in other class?\n");
                System.out.print("1. Yes\n2. No\nChoice: ");
                
                int choice2 = 0;
                
                choice2 = input.nextInt();
                if(choice2 == 1){
                    //attempt to reserve in alt reserve
                    if(plane1.reserveSeat(choice, 1)){
                        //print receipt
                        printReceipt(plane1.getReservedSeatNumber(), plane1.getReservedSeatClass());
                    }
                    else{
                        //if all the seats are taken
                        System.out.println("\n\nOops! all seats are full and the plane leaves in 3 hours.\n\n");
                        break;
                    } 
                }
                if(choice2==2){
                    System.out.println("Next flight leaves in 3 hours.");
                    break;
                }
            }
    
        }while(choice != 3);

        input.close();
    }

    //print receipt
    public static void printReceipt(int seatNo, String seatClass){
        System.out.println("\nSeat Reserved Successfully!");
        System.out.printf(
                "--------------------------------%nSeat No.%10sSeat Section%n--------------------------------%n %2d%26s%n%n%n--------------------------------%n",
                "", seatNo, seatClass);
    }

}
