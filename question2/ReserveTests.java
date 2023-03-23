package question2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReserveTests {
    @Test
    // test get first class seat class
    public void getClassFirstTest() {
        // arrange
        var plane = new Reservation();
        String expected = "First Class";

        String actual = plane.getClass(1);

        assertEquals(expected, actual);
    }

    @Test
    // test get economy class seat class
    public void getClassEconomyTest() {
        // arrange
        var plane = new Reservation();
        String expected = "Economy Class";

        // actual
        String actual = plane.getClass(2);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    //Test reserve first class
    public void reserSeatTests1(){
        //arrange
        var plane = new Reservation();
       boolean expected = true;
       //expected 
       boolean actual = plane.reserveSeat(1, 0);

       //assert
       assertEquals(expected, actual);
    }

    @Test
    //Test reserve Economy class
    public void reserSeatTests2(){
        //arrange
        var plane = new Reservation();
       boolean expected = true;
       //expected 
       boolean actual = plane.reserveSeat(2, 0);

       //assert
       assertEquals(expected, actual);
    }

}
