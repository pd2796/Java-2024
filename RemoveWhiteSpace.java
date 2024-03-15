public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s = "hello don";
        StringBuilder sp = new StringBuilder();
        char[] chars = s.toCharArray();

        for(char c : chars)
        {
            if(!Character.isWhitespace(c))
            {
                sp.append(c);
            }
        }
        System.out.println(sp.toString());

    }
}
