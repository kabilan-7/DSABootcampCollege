public class Diagonal {
    public static void main(String[] args) {
        char arr[][]={
            {'a','b','c','d'},
            {'e','f','g','h'},
            {'i','j','k','l'}
        };
        int m=arr.length;
        int n=arr[0].length;
        for(int dia=0;dia<n;dia++){
            int row=0;
            int col=dia;
            while(row<m && col<n){
                System.out.print(arr[row][col]+" ");
                row++;
                col++;
            }
            System.out.println();
        }
    }
}
