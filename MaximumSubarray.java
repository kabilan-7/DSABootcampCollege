public class MaximumSubarray {
    public static void main(String[] args) {
        int arr[]={10,-20,30,40,20};
        int n=arr.length;
        int len=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>max){
                    len=j-i+1;
                    max=sum;
                }
            }
        }
        System.out.println(len);
    }
}
