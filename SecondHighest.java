import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighest {
    
    public static void main(String[] args) {
        
        int secondHighest = 0;
        int highest = 0;
        
        List<Integer> s = Arrays.asList(1,8,7,4,5,6,6);

        for(int a : s)
        {
            if(a > highest){
                secondHighest = highest;
                highest = a;
            }
            
            else if
                    (a>secondHighest)
                secondHighest = a;
            

        }
        System.out.println(secondHighest);
        }
}
