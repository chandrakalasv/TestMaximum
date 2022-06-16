public class FindMaxNum<T extends Comparable>{

    public <T extends Comparable> T maxNumber(T num1, T num2, T num3) {
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
            return num1;
        } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
            return num2;
        } else
            return num3;
    }
}
