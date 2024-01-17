import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsTest {
    @Test
    @Parameters({"firstValue","secondValue"})
    public void testMethod1(int a, int b) {
        System.out.println("Test Method 1");
        int sum = a+b;
        System.out.println(sum);
        Assert.assertEquals(sum,30);
    }

    @Test
    @Parameters("name")
    public void testMethod2(@Optional("Default_Name")String name) {
        System.out.println("Test Method 2");
        System.out.println(name);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }
}
