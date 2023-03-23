package question3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FibonacciTests {
    @Test
    public void FibonacciIntTest(){
        //arrange
        var fib = new FibonacciCalc();
        var expected = new ArrayList<Integer>();
        int[] list = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        for(int index =0; index<list.length; index++)
            expected.add(list[index]);
        
        fib.Fibonacci(10);
        //actual
        ArrayList<Integer> actual = fib.getList();

        assertEquals(expected, actual);

    }

    @Test
    public void FibonacciDouleTest(){
        //arrange
        var fib = new FibonacciCalc();
        var expected = new ArrayList<Double>();
        double[] list = {0.0, 1.0, 1.0, 2.0, 3.0, 5.0, 8.0, 13.0, 21.0, 34.0};

        for(int index =0; index<list.length; index++)
            expected.add(list[index]);
        
        fib.Fibonacci(10.0);
        //actual
        ArrayList<Double> actual = fib.getLIstDouble();

        assertEquals(expected, actual);

    }

    //Test the highest value fibonacci inteder
    @Test
    public void highestFibInteger(){
        //arrange
        var fib = new FibonacciCalc();
        fib.Fibonacci(47);
        int expected = 1836311903;

        int actual = fib.getHighestInt();

        assertEquals(expected, actual);
    }

    @Test
    public void highestFibDouble(){
        //arrange
        var fib = new FibonacciCalc();
        fib.Fibonacci(10000.00);
        String expected = "Infinity";

        String actual = String.format("%s",fib.getHighestDouble());
        
        assertEquals(expected, actual);
    }

    
}
