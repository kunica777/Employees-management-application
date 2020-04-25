import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MockitoFactorialTest {

    @Mock
    private Factorial factorial;

    @Test
    public void testFactorial(){
        Mockito //with mockito the method has to be nonstatic!
                .when(factorial.getFactorial2(2))
                .thenReturn(2);
        Mockito
                .when(factorial.getFactorial2(5))
                .thenReturn(120);

            int actualResult = factorial.getFactorial2(5);
            Assert.assertEquals(120, actualResult);
        }
    }

