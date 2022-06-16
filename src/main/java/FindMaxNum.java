public class FindMaxNum {
    public Integer num1;
    public Integer num2;
    public Integer num3;

    public FindMaxNum(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int maxNumber() {
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
            System.out.println(num1);
            return num1;
        } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
            System.out.println(num2);
            return num2;
        } else
            System.out.println(num3);
            return num3;
    }
}
