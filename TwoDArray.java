public class TwoDArray {
    public static void main(String[] args) {
        char arr[][]={
            {'a','b','c','d'},
            {'e','f','g','h'},
            {'i','j','k','l'},
            {'m','n','o','p'}
        };
        //RowWise
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.println(arr[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // //colWise
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.println(arr[j][i]);
        //     }
        //     System.out.println();
        // }
        int n=arr.length;
        boolean isrev=false;
        
        for(int i=0;i<n;i++){
          if(i%2==0){
            for(int j=0;j<arr[i].length;j++){
                System.out.print (arr[i][j]);
            }
          }else{
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]);
            }
          }
          System.out.println();
          isrev=true;
        }
    }
    }

