import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NewStream {

    public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(1,22,2,2,5,3,8);

              Integer max =  numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
    
                System.out.println(max);

                Integer min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();

                System.err.println(min);

                List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());

                System.out.println(sorted);
            }   
    
}
