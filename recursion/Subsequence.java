package DSABootcampCollege.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
   static  List<List<Character>> ans=new ArrayList<>();
    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        findSubsequence(0,"abc",list);
        System.out.println(ans);
    }
    static void findSubsequence(int idx,String s,List<Character> list){
        if(idx==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(s.charAt(idx));
        findSubsequence(idx+1,s,list);
        list.remove(list.size()-1);
        findSubsequence(idx+1,s,list);
    }
}
