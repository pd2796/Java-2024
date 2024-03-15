public class StringVowels {
    public static void main(String[] args) {
        System.out.println(stringVowels("hellO"));
        System.out.println(stringVowels("TV"));
    }

    public static boolean stringVowels(String input)
    {
        return input.toLowerCase().matches(".*[aeiou]");
    }
}
