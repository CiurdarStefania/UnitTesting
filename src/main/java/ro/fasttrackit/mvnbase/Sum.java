package ro.fasttrackit.mvnbase;

public class Sum {
    public int sum(int n){
        if(n<0) throw  new IllegalArgumentException("n should be postivie!");
        if (n<= 1){
            return n;
        }else{
            return sum(n-1) +n;
        }

    }
}
