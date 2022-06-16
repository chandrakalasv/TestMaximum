import java.util.Arrays;

public class FindMaxNum<T extends Comparable<T>>{
    public T num1, num2, num3, num4, num5;

    public FindMaxNum(T num1, T num2, T num3, T num4, T num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

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
    public <T extends Comparable <T>> T testMaximum() {
       return (T) FindMaxNum.maxNumber(num1, num2, num3, num4, num5);
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
