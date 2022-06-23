package main.java.com;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGTesting {

    testNGDemo ts = new testNGDemo();

    @Test(priority = 4)
    public void testAdd()
    {
        int ans = ts.Addition(6,5);
        Assert.assertEquals(ans,11);
    }

    @Test(priority = 3)
    public void testSub()
    {
        int ans = ts.Subtraction(6,5);
        Assert.assertEquals(ans,1);

    }

    @Test(priority = 2)
    public void testMul()
    {
        int ans = ts.Multiplication(6,5);
        Assert.assertEquals(ans,30);

    }

    @Test(priority = 1)
    public void testDiv()
    {
        int ans = ts.Division(6,3);
        Assert.assertEquals(ans,2);

    }
}
