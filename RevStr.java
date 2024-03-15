import java.util.HashMap;
import java.util.Map;

public class RevStr {
    public static void main(String[] args) {
        String s = "aaaabbaabbbbbaaaaa";

        char[] ch = s.toCharArray();

        Map<Character,Integer> mp = new HashMap<>();

        for(char c :ch)
        {
            if(mp.containsKey(c))
            {
                mp.put(c,mp.get(c)+1);
            }
            else{
                mp.put(c,1);
            }
        }
        System.out.println(mp);
    }
}
