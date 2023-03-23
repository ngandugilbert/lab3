package question2;

public class Reservation {
    private boolean[] seats;
    private final int MAX_SEATS = 10;
    private int reservedSeatNumber;
    private String reservedSeatClass;
    private final String fclass = "First Class";
    private final String economy = "Economy Class";

    public Reservation() {
        this.seats = new boolean[this.MAX_SEATS];
        for (int index = 0; index < this.MAX_SEATS; index++) {
            this.seats[index] = false; // empty all the seats
        }
    }

    // get which class
    public String getClass(int section) {
        if (section == 1)
            return this.fclass;
        else if (section == 2)
            return this.economy;

        return "";//return nothing
    }

    //get the reserved seat number
    public int getReservedSeatNumber(){
        return this.reservedSeatNumber;
    }

    //get reserved seat class
    public String getReservedSeatClass(){
        return this.reservedSeatClass;
    }

    // reserve seat
    public boolean reserveSeat(int section, int flag) {
        //The flag is used to check if its alt reserve
        if(flag == 1){
            //if alternative reserve switch sections
            if(section == 1){
                section = 2;
            }
            else if(section == 2){
                section = 1;
            }

        }
        if (section == 1) {
            // Reserve first class
            // check if there is space
            if (isFClassFull()) {
                // if full
                return false; // not reserved
            }
            // not full and must reserve
            // but make sure that same seat is not taken
            for (int index = 0; index < 5; index++) {
                // check that seat is not taken
                if (!isTaken(index)) {
                    // if not taken then reserve
                    this.seats[index] = true;
                    this.generateTicket(index, this.fclass);
                    return true;
                }
            }
        } else if (section == 2) {
            // Reserve economy class
            // check if there is space
            if (isEconnomyFull()) {
                // if full
                return false; // not reserved
            }
            // not full and must reserve
            // but make sure that same seat is not taken
            for (int index = 5; index < 10; index++) {
                // check that seat is not taken
                if (!isTaken(index)) {
                    // if not taken then reserve
                    this.seats[index] = true;
                    this.generateTicket(index, this.economy);
                    return true;
                }
            }
        }
        return false;
    }

    // Check if first class is full
   private boolean isFClassFull() {
        for (int index = 0; index < 5; index++) {
            if (this.seats[index] == false) {
                return false;
            }
        }
        return true;
    }

    // check if economy is full
   private boolean isEconnomyFull() {
        for (int index = 5; index < 10; index++) {
            if (this.seats[index] == false) {
                return false;
            }
        }
        return true;
    }

    // check if seat is taken
    private boolean isTaken(int index) {
        if (this.seats[index] == true) {
            return true;
        } else
            return false;
    }

    // collect ticket information
    private void generateTicket(int seat, String section) {
        this.reservedSeatNumber = seat+1;
        this.reservedSeatClass = section;
    }

}
