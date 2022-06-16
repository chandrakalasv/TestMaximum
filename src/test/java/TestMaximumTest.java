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
        FindMaxNum num = new FindMaxNum(2, 10, 1);
        int maxNumAtSecond = num.maxNumber();
        Assert.assertEquals(10, maxNumAtSecond);
    }
}
