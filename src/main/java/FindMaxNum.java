public class FindMaxNum {
    public Integer num1, num2, num3;
    public Double num4, num5, num6;

    public FindMaxNum() {

    }

    public int maxNumber(Integer num1, Integer num2, Integer num3) {
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
            return num1;
        } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
            return num2;
        } else
            return num3;
    }

    public double maxNumber(Double num4, Double num5, Double num6) {
        if ((num4.compareTo(num5)) > 0 && (num4.compareTo(num6)) > 0) {
            return num4;
        } else if (num5.compareTo(num6) > 0 && num5.compareTo(num4) > 0) {
            return num5;
        }
        return num6;
    }
}
