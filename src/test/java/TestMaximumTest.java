import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
    @Test
    public void givenIntegerNum_AtFirstPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Integer> number = new FindMaxNum();
        int maxNumAtFirst = number.maxNumber(10, 1, 2);
        Assert.assertEquals(10, maxNumAtFirst);
        FindMaxNum.sort(10,1,2);
    }
    @Test
    public void givenIntegerNum_AtSecondPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Integer> number = new FindMaxNum();
        int maxNumAtSecond = number.maxNumber(2, 10, 1);
        Assert.assertEquals(10, maxNumAtSecond);
        FindMaxNum.sort(2, 10, 1);
    }
    @Test
    public void givenIntegerNum_AtThirdPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Integer> number = new FindMaxNum();
        int maxNumAtThird = number.maxNumber(2, 2, 10);
        Assert.assertEquals(10, maxNumAtThird);
        FindMaxNum.sort(2, 2, 10);
    }
    @Test
    public void givenFloatNum_AtFirstPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Double> number = new FindMaxNum();
        double maxNumAtFirst = number.maxNumber(10.8, 2.6, 1.4);
        Assert.assertEquals(10.8, maxNumAtFirst, 8);
        FindMaxNum.sort(10.8, 2.6, 1.4);
    }

    @Test
    public void givenFloatNum_AtSecondPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Double> number = new FindMaxNum();
        double maxNumAtSecond = number.maxNumber(2.6, 10.8, 1.4);
        Assert.assertEquals(10.8, maxNumAtSecond, 8);
        FindMaxNum.sort(2.6, 10.8, 1.4);
    }
    @Test
    public void givenFloatNum_AtThirdPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Double> number = new FindMaxNum();
        double maxNumAtThird = number.maxNumber(2.6, 1.4, 10.8);
        Assert.assertEquals(10.8, maxNumAtThird, 8);
        FindMaxNum.sort(2.6, 1.4, 10.8);
    }
    @Test
    public void givenString_AtFirstPosition_WhenMax_ShouldReturnSameString() {
        FindMaxNum<String> string = new FindMaxNum();
        String stringAtFirstPos = string.maxNumber("peach", "apple", "banana");
        Assert.assertEquals("peach", stringAtFirstPos);
        FindMaxNum.sort("peach", "apple", "banana");
    }

    @Test
    public void givenString_AtSecondPosition_WhenMax_ShouldReturnSameString() {
        FindMaxNum<String> string = new FindMaxNum();
        String stringAtSecondPos = string.maxNumber("apple", "peach", "banana");
        Assert.assertEquals("peach", stringAtSecondPos);
        FindMaxNum.sort("peach", "apple", "banana");
    }
    @Test
    public void givenString_AtThirdPosition_WhenMax_ShouldReturnSameString() {
        FindMaxNum<String> string = new FindMaxNum();
        String stringAtThirdPos = string.maxNumber("apple", "banana", "peach");
        Assert.assertEquals("peach", stringAtThirdPos);
        FindMaxNum.sort("apple", "banana", "peach");
    }
}
