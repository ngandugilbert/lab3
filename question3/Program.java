package question3;

public class Program {
    public static void main(String[] args){
        var fab = new FibonacciCalc();
        fab.Fibonacci(47);
        System.out.println(fab.getHighestInt());

        // fab.Fibonacci(10000000.0);
        // System.out.println(fab.getHighestDouble());
        // System.out.println(fab.getLIstDouble().size());
        
    }
}
