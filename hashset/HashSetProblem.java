package DSABootcampCollege.hashset;

import java.util.HashSet;

public class HashSetProblem {
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,4,5};
        int arr2[]={2,3,1,2,8,9};

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
               hs.add(arr1[i]);
               
        }
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                hs.remove(arr2[i]);
                System.out.println(arr2[i]);
            } 
        }
      
      
    }
}
