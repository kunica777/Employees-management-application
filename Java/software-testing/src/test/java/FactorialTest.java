import org.junit.*;

public class FactorialTest {
    @BeforeClass
    public static void setup(){
        System.out.println("Setting up the environment");
    }
    @Before
    public void setupEach(){
        System.out.println("Setting up before the method");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Tearing down the environment");
    }
    @After
    public void tearDownEach(){
        System.out.println("Tearing down after method");
    }


    @Test
    public void getFactorialTest(){
        System.out.println("Running getFactorialTest1");
        int actualResult = Factorial.getFactorial(3);
        //assert actualResult==24; //this is assert keyword
        Assert.assertEquals(6,actualResult); //assert static method

        actualResult = Factorial.getFactorial(4);
        Assert.assertEquals(24,actualResult);

        actualResult = Factorial.getFactorial(-5);
        Assert.assertEquals("white your explanation here",0,actualResult);
    }
    @Test
    public void getFactorialTest2(){
        System.out.println("Running getFactorialTest2");
        int actualResult = Factorial.getFactorial(3);
        //assert actualResult==24; //this is assert keyword
        Assert.assertEquals(6,actualResult); //assert static method

        actualResult = Factorial.getFactorial(4);
        Assert.assertEquals(24,actualResult);

        actualResult = Factorial.getFactorial(-5);
        Assert.assertEquals("white your explanation here",0,actualResult);
    }

}
