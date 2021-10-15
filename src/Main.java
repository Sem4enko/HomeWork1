import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input words: ");
        String text = in.nextLine().toLowerCase();
        System.out.println("\nList of your words: " + text);
        String[] words = text.split(" ");

        Set<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
        for (String i : words) {
            uniqueWords.add(i);
        }

        System.out.println("\nList of unique:" + uniqueWords);

        Set<String> uniqeSortWords = uniqueWords.stream()
                .map(item -> sortString(item))
                .collect(Collectors.toSet());
        Integer quantityOfAnagrams = uniqueWords.size() - uniqeSortWords.size();

        System.out.printf("\nQuantity of anagrams: " + String.valueOf(quantityOfAnagrams));
    }

    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }


}