public class AddTwoNumber{
    public static void main(String[] args) {
        int arr1[]={5,3,1,4};
        int arr2[]={7,8,9,3};
        int len=arr1.length;
        int sum=0;
        String str="";
        int borrow=0;
        for(int i=len-1;i>=0;i--){
            sum=arr1[i]+arr2[i]+borrow;
                sum=sum%10;
                borrow=sum/10;
                
        }
        
    }
}