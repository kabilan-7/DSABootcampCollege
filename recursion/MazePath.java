package DSABootcampCollege.recursion;

import java.util.ArrayList;

public class MazePath {
    static ArrayList<String> res=new ArrayList<>();
    public static void main(String[] args) {
    int arr[][]=new int[3][3];
        findpath(arr,0,0,"");
    }
    static void findpath(int arr[][],int row,int col,String s){
        if(row==arr.length-1 && col==arr[0].length-1   ){
            System.out.println(s);
            return;
        }
        if(row==arr.length) return;
        if(col==arr.length) return;
        
        findpath(arr, row, col+1, s+"h");
        findpath(arr, row+1, col, s+"v");
        findpath(arr, row+1, col+1, s+"d");
    }
}
