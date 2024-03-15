import java.util.*;
class Hsm{
    public static void main(String a[])
    {
HashMap<> m = new HashMap();
Field tableField = HashMap.class.getDeclaredField("table");
tableField.setAccessible(true);
Object[] table = (Object[]) tableField.get(m);
System.out.println(table == null ? 0 : table.length);
    }
}