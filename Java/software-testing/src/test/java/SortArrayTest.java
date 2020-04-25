import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortArrayTest {

    @Parameterized.Parameter(0)
    public int number;
    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][]{
                {-2,0},
                {1,1},
                {3,6},
                {4,24},
                {5,120}
        });
    }

    @Test
    public void testFactorial() {
        int actualResult= Factorial.getFactorial(number);
        Assert.assertEquals(expectedResult,actualResult);
    }
}
