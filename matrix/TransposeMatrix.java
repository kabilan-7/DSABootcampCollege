package DSABootcampCollege.matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
           {4,5,6},
           {7,8,9}
            
        };
        int m=arr.length;
        int n=arr[0].length;
        int ans[][]=new int[n][m];
        transpose(arr,m,n);
        display(arr,m,n);
    }
    static void display(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static void transpose(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                swap(arr,i,j);
            }
        }
    }
    static void swap(int arr[][],int i,int j){
         int temp=arr[i][j];
         arr[i][j]=arr[j][i];
         arr[j][i]=temp;
    }
    
}
