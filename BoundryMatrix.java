public class BoundryMatrix {
    public static void main(String[] args) {
        char arr[][]={
            {'a','b','c','d'},
            {'e','f','g','h'},
            {'i','j','k','l'}
        };
        int m=arr.length;
        int n=arr[0].length;
        int left=0,right=n-1;
        int top=0,bottom=m-1;
        for(int i=left;i<=right;i++){
            System.out.print(arr[top][i]+" ");
        }
        top++;
        System.out.println();
        for(int i=top;i<=bottom;i++){
               System.out.print(arr[i][right]+" ");
        }
        right--;
        System.out.println();
        for(int i=right;i>=0;i--){
            System.out.print(arr[bottom][i]+" ");
        }
        bottom--;
        System.out.println();
        for(int i=bottom;i>=top;i--){
            System.out.println(arr[i][left]+" ");
        }
    }
}
