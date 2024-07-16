import java.util.*;


public class MapExercises {
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, c - 'a' + 1);
        }
        return map;
    }

    public static Map<Integer, Integer> squares(List<Integer> num) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : num) {
            map.put(i, i * i);
        }
        return map;
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            int count = 0;
            for (String word2 : words) {
                if (word.equals(word2)) {
                    count += 1;
                }
            }
            map.put(word, count);
            count = 0;
        }
        return map;
    }


    public static void main(String[] args) {
        Map<Character, Integer> letterToNumMap = letterToNum();
        for (Map.Entry<Character, Integer> entry : letterToNumMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        List<Integer> num = new ArrayList<Integer>();
        Map<Integer, Integer> squares = squares(num);
        System.out.println(squares);

        List<String> words = Arrays.asList("ass", "bitch", "cunt", "dick", "ass", "fuck", "gulp", "horn");
        Map<String, Integer> countWords = countWords(words);
        System.out.println(countWords);
    }
}
