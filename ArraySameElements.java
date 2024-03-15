import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {
    public static void main(String[] args) {
        Integer[] a1 ={1,2,3};
        Integer[] a2 ={1,2,3,4};
        Integer[] a3 ={1,2,3,4,5};
        System.out.println(sameElements(a1, a2));

            System.out.println(sameElements(a1, a3));
        
    }
    static boolean sameElements(Object[] array1,Object[] array2)
    {
        Set<Object> uniqueEle1 = new HashSet<>(Arrays.asList(array1,array2));
        Set<Object> uniqueEle2 = new HashSet<>(Arrays.asList(array1,array2));

        if(uniqueEle1.size()!= uniqueEle2.size())
            return false;
        for(Object obj : uniqueEle2)
        {
            if (!uniqueEle2.contains(obj)) {
                return false;
            }
        }
        return true;

    }

}
