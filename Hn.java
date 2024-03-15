import java.util.*;
import java.util.stream.*;

class Hn{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 1, 1,-10,-5,17);

        findPair(numbers,7);

    }
    private static void findPair(List<Integer> numbers,int targetSum)
    {
        HashSet<Integer> complements = new HashSet<>();

        for(int number:numbers)
        {           
            int complement = targetSum - number;
                                        
            if(complements.contains(complement)){
                System.out.println("Pair: "+number+". "+complement);

            }
            complements.add(number);
        }
        
    }
}