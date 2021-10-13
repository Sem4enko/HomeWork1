import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input words: ");
        String text = in.nextLine().toLowerCase();
        System.out.println(text);
        String[] words = text.split(" ");

        Set<String> words2 = new HashSet<>();
//        Set<Character> words3 = new HashSet<>();
        String a ;
        for (String i : words) {
            a = sortString(i);
            words2.add(a);
        }
        System.out.println(words2);
    }

    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }

}