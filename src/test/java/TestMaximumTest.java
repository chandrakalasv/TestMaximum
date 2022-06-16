import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
    @Test
    public void givenIntegerNum_AtFirstPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        int maxNumAtFirst = number.maxNumber(10, 1, 2);
        Assert.assertEquals(10, maxNumAtFirst);
    }
    @Test
    public void givenIntegerNum_AtSecondPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        int maxNumAtSecond = number.maxNumber(2, 10, 1);
        Assert.assertEquals(10, maxNumAtSecond);
    }
    @Test
    public void givenIntegerNum_AtThirdPosition_WhenMax_ShouldReturnSameNUmberr() {
        FindMaxNum number = new FindMaxNum();
        int maxNumAtThird = number.maxNumber(2, 2, 10);
        Assert.assertEquals(10, maxNumAtThird);
    }
    @Test
    public void givenFloatNum_AtFirstPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        double maxNumAtFirst = number.maxNumber(10.8, 2.6, 1.4);
        Assert.assertEquals(10.8, maxNumAtFirst, 8);
    }

    @Test
    public void givenFloatNum_AtSecondPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        double maxNumAtSecond = number.maxNumber(2.6, 10.8, 1.4);
        Assert.assertEquals(10.8, maxNumAtSecond, 8);
    }
    @Test
    public void givenFloatNum_AtThirdPosition_WhenMax_ShouldReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum();
        double maxNumAtThird = number.maxNumber(2.6, 1.4, 10.8);
        Assert.assertEquals(10.8, maxNumAtThird, 8);
    }
}
