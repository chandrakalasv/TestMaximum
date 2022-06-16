import java.util.Arrays;

public class FindMaxNum<T extends Comparable<T>>{

    public FindMaxNum() {
    }

    public static <T extends Comparable<T>> T maxNumber(T...num) {
        T max = num[0];
        for(int i = 0; i < num.length; i++) {
            if (num[i].compareTo(max) > 0) {
                max = num[i];
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void sort(T...num) {
        T temp;
        for(int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) {
                if (num[i].compareTo(num[j]) < 0) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }

}
