import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxNum_AtFirstPosition_ReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum(10, 1, 1);
        int maxNumAtFirst =  number.maxNumber();
        Assert.assertEquals(10, maxNumAtFirst);
    }
    @Test
    public void givenMaxNum_AtSecondPosition_ReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum(2, 10, 1);
        int maxNumAtSecond = number.maxNumber();
        Assert.assertEquals(10, maxNumAtSecond);
    }
    @Test
    public void givenMaxNum_AtThirdPosition_ReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum(2, 2, 10);
        int maxNumAtThird = (int) number.maxNumber();
        Assert.assertEquals(10, maxNumAtThird);
    }
}
