import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
    @Test
    public void givenIntegerNum_AtFirstPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        int maxNumAtFirst = (int) number.maxNumber(10, 1, 2);
        Assert.assertEquals(10, maxNumAtFirst);
        FindMaxNum.sort(10,1,2);
    }
    @Test
    public void givenIntegerNum_AtSecondPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        int maxNumAtSecond = (int) number.maxNumber(2, 10, 1);
        Assert.assertEquals(10, maxNumAtSecond);
        FindMaxNum.sort(2, 10, 1);
    }
    @Test
    public void givenIntegerNum_AtThirdPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Integer> number = new FindMaxNum();
        int maxNumAtThird = (int) number.maxNumber(2, 2, 10);
        Assert.assertEquals(10, maxNumAtThird);
        FindMaxNum.sort(2, 2, 10);
    }
    @Test
    public void givenFloatNum_AtFirstPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        double maxNumAtFirst = (double) number.maxNumber(10.8, 2.6, 1.4);
        Assert.assertEquals(10.8, maxNumAtFirst, 8);
        FindMaxNum.sort(10.8, 2.6, 1.4);
    }

    @Test
    public void givenFloatNum_AtSecondPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        double maxNumAtSecond = (double) number.maxNumber(2.6, 10.8, 1.4);
        Assert.assertEquals(10.8, maxNumAtSecond, 8);
        FindMaxNum.sort(2.6, 10.8, 1.4);
    }
    @Test
    public void givenFloatNum_AtThirdPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        double maxNumAtThird = (double) number.maxNumber(2.6, 1.4, 10.8);
        Assert.assertEquals(10.8, maxNumAtThird, 8);
        FindMaxNum.sort(2.6, 1.4, 10.8);
    }
    @Test
    public void givenString_AtFirstPosition_WhenMax_ShouldReturnSameString() {
        FindMaxNum string = new FindMaxNum();
        String stringAtFirstPos = (String) string.maxNumber("peach", "apple", "banana");
        Assert.assertEquals("peach", stringAtFirstPos);
        FindMaxNum.sort("peach", "apple", "banana");
    }

    @Test
    public void givenString_AtSecondPosition_WhenMax_ShouldReturnSameString() {
        FindMaxNum string = new FindMaxNum();
        String stringAtSecondPos = (String) string.maxNumber("apple", "peach", "banana");
        Assert.assertEquals("peach", stringAtSecondPos);
        FindMaxNum.sort("peach", "apple", "banana");
    }
    @Test
    public void givenString_AtThirdPosition_WhenMax_ShouldReturnSameString() {
        FindMaxNum string = new FindMaxNum();
        String stringAtThirdPos = (String) string.maxNumber("apple", "banana", "peach");
        Assert.assertEquals("peach", stringAtThirdPos);
        FindMaxNum.sort("apple", "banana", "peach");

    }

    @Test
    public void givenValue_AtFirstPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Integer> number = new FindMaxNum(1, 1, 2, 10, 20);
        int maxNumAtFirst = number.testMaximum();
        Assert.assertEquals(20, maxNumAtFirst);
        FindMaxNum.sort(1, 1, 2, 10, 20);
    }
    @Test
    public void givenValue_AtSecondPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<Double> number = new FindMaxNum(2.9, 10.8, 1.8, 2.6, 4.9);
        Double maxNumAtSecond = number.testMaximum();
        Assert.assertEquals(10.8, maxNumAtSecond, 8);
        FindMaxNum.sort(2.9, 10.8, 1.8, 2.6, 4.9);
    }
    @Test
    public void givenValue_AtThirdPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum<String> number = new FindMaxNum("apple", "banana", "peach", "ball", "goal");
        String stringAtThirdPos =  number.testMaximum();
        Assert.assertEquals("peach", stringAtThirdPos);
        FindMaxNum.sort("apple", "banana", "peach", "ball", "goal");
    }
}
