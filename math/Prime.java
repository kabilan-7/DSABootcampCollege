package DSABootcampCollege.math;

import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        for(int i=2;i<=n;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
       
    }
    public static boolean checkPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==2) return true;
        return false;
    }
}
