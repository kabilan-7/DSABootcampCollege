public class SadlePoint {
    public static void main(String[] args) {
        int arr[][]={
            {1,0,3},
           {4,3,6},
           {7   ,2,9}
            
        };
        int m=arr.length;
        int n=arr[0].length;
        int idx=0;
       for(int row=0;row<m;row++){
        for(int col=0;col<n;col++){
           idx=findmin(arr, row, n);
        }
        int max=findmax(arr,idx,m);
        if(max==arr[row][idx]) System.out.println(max);

       }
        
        }
       static int findmin(int arr[][],int row,int n){
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<n;i++){
               if(min>arr[row][i]){
                     idx=i;
                     min=arr[row][i];
               }
            }
            return idx;
        }
        static int findmax(int arr[][],int col,int m){
            int max=0;
            for(int i=0;i<m;i++){
                max=Math.max(max,arr[i][col]);
            }
            return max;
        }
        
    }

