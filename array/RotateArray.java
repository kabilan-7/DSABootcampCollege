package DSABootcampCollege.array;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=6;
        int len=arr.length; 
        if(k<0) k=k+len;
        k=k%len;
        reverse(arr,len-k,len-1);
        reverse(arr,0,len-k-1);
        reverse(arr,0,len-1);

        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }

    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
