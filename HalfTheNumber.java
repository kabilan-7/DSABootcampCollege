import java.util.Scanner;
public class HalfTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        int count=0;
        while(n!=1){
            count++;
        }
        System.out.println(count);
    }
    

}
