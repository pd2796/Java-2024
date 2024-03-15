import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sml {
    public static void main(String[] args) {
        
  
                List<Integer> number = Arrays.asList(2,2, 3, 4, 5, 1, 1,6);

       Integer t = number.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(t);
    }
}
