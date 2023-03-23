package question3;

import java.util.ArrayList;

public class FibonacciCalc {
    private ArrayList<Integer> list;
    private ArrayList<Double> listDouble;

    public FibonacciCalc() {
        this.list = new ArrayList<Integer>();
        this.listDouble = new ArrayList<Double>();

        this.list.add(0);
        this.list.add(1);

        this.listDouble.add(0.0);
        this.listDouble.add(1.0);

    }

    // get list integer
    public ArrayList<Integer> getList() {
        return this.list;
    }

    // get list double
    public ArrayList<Double> getLIstDouble() {
        return this.listDouble;
    }

    // get the highest integer
    public int getHighestInt() {

        return this.list.get((this.list.size() - 1));
    }

    // get the highest integer
    public double getHighestDouble() {
        return this.listDouble.get((this.listDouble.size() - 1));
    }

    // Fibonacci Calculator using integers
    public void Fibonacci(int n) {
        while (this.list.size() < n) {
            int previous = this.list.get(this.list.size() - 1);
            int current = this.list.get(this.list.size() - 2);
            int sum = current + previous;
            if (sum < 0) {
                break;
            }
            this.list.add(sum);
        }
    }

    // Fibonacci Calculator using double
    public void Fibonacci(double n) {
        while (this.listDouble.size() < n) {
            double previous = this.listDouble.get(this.listDouble.size() - 1);
            double current = this.listDouble.get(this.listDouble.size() - 2);
            double sum = current + previous;
            if (sum < 0) {
                break;
            }
            this.listDouble.add(sum);
        }
    }

    // validate user input

}
