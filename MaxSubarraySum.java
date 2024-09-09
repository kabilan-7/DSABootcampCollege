public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[]={-1,3,-4,5,10,-15};
        int k=3;
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=Math.max(sum, max);
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            max=Math.max(sum,max);
        }
        System.out.println(max);

    }
}
