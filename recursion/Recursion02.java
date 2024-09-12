package DSABootcampCollege.recursion;

public class Recursion02{
    public static void main(String[] args) {
        func(3);
    }
    static void func(int n){
        if(n<=0){
            System.out.println("Base case hit");
            return;
        }
        System.err.println("Pre"+n);
        func(n-1);
        System.err.println("In"+n);
        func(n-2);
        System.err.println("Post"+n);
    }
}