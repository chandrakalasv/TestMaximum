import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
    @Test
    public void givenMaxNum_AtFirstPosition_ReturnSameNUmber() {
        FindMaxNum number = new FindMaxNum(10, 1, 1);
        int MaxNumAtFirst = (int) number.maxNumber();
        Assert.assertEquals(10, MaxNumAtFirst);
    }
}
