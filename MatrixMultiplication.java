public class MatrixMultiplication {
    
    public static void main(String[] args) {
        int arr1[][]={
            {1,2},
            {4,5},
            {7,8}
        };
        int arr2[][]={
            {1,2,3},
            {4,5,6}
        };
        int r1=arr1.length,c1=arr1[0].length;
        int r2=arr2.length,c2=arr2[0].length;
        int ans[][]=new int[r1][c2];

        for(int i=0;i<ans.length;i++){
            
            for(int j=0;j<ans[0].length;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                sum+=arr1[i][k]*arr2[k][j];
                }
                ans[i][j]=sum;
            }
        }
        display(ans, r1, c2);
    }
    static void display(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
