package DSABootcampCollege.matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        char arr[][]={
            {'a','b','c','d'},
            {'e','f','g','h'},
            {'i','j','k','l'},
            {'m','n','o','p'},
            {'q','r','s','t'}
        };
        int m=arr.length;
        int n=arr[0].length;
        int left=0,right=n-1;
        int top=0,bottom=m-1;
        int count=0;
        while(count<=m*n){
        for(int i=left;i<=right;i++){
            System.out.print(arr[top][i]+" ");
            count++;
        }
        top++;
        
        for(int i=top;i<=bottom;i++){
            System.out.print(arr[i][right]+" ");
            count++;
        }
        right--;
        for(int i=right;i>=left;i--){
            System.out.print(arr[bottom][i]+" ");
            count++;
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            System.out.print(arr[i][left]+" ");
            count++;
        }
        left++;
    
        
    }
    }
}
