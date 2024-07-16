import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExercises {
    public static int sum(List<Integer> list) {
        int s = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (int i : list) {
            s += i;
        }
        return s;
    }

    public static List<Integer> evens(List<Integer> list) {
        if (list.isEmpty()) {
            return list;
        }
        List<Integer> evenList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        return evenList;
    }

    public static List<Integer> common(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonList = new ArrayList<>();
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (Objects.equals(i, j)) {
                    commonList.add(i);
                }
            }
        }
        return commonList;
    }

    public static int countOccurrenceOfC(List<String> word, char c) {
        int count = 0;
        for (String s : word) {
            for (char cc : s.toCharArray()) {
                if (cc == c) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
