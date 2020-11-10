package ro.fasttrackit.mvnbase;

public class Factorial {
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be positive");
        if (n <= 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }

    }
    public int suma(int a, int b){
        return a+b;
    }

}
