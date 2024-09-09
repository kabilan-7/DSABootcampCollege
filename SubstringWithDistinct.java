import java.util.HashMap;
import java.util.Map;
public class SubstringWithDistinct {
    public static void main(String[] args) {
        String s="xyzaybx";
        int count=0;
        int k=4;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        if(map.size()==k) count++;
        for(int i=k;i<s.length();i++){
            map.put(s.charAt(i-k),map.get(s.charAt(i-k))-1);
            if(map.get(s.charAt(i-k))==0) map.remove(s.charAt(i-k));
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
            if(map.size()==k) count++;
        }
       System.out.println(count);
    }
}
