import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.ArrayList;

public class JavaExercises {
    public static int[] makeDice(){
        return new int[]{1,2,3,4,5,6};
    }

    public static String[] takeOrder(String name) {
        if (name.equals("Ergun")) {
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        } else if (Objects.equals(name, "Erik")) {
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        } else
            return new String[3];
    }

    public static int finMinMax(int[] list) {
        int max = 0;
        int min = 0;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        for (int j : list) {
            if (j < min) {
                min = j;
            }
        }
        return max - min;
    }

    public static List<Integer> hailstone(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            list.add(n);
        }
        return list;
    }


    public static void main(String[] args) {
        int i = 9;
        List<Integer> list = hailstone(i);
        System.out.println(list);
    }
}
