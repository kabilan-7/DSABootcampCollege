package DSABootcampCollege.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        String src="A",des="B",helper="C";
        int ans=findWays(n,src,des,helper);
        System.out.println(ans);
    }
    static int findWays(int n,String src,String des,String helper){
        //base case
        if(n==1){
            System.out.println("move disk "+n+" from rod "+src+" to rod "+des);
            return 1;
        }

      int res=findWays(n-1,src,helper,des);
        System.out.println("move disk "+n+" from rod "+src+" to rod "+des);
        res+=1;
        res=res+findWays(n-1,helper,des,src);
        return res;
    }
}
