

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void verifyLoginPageTitle() {
        String expectedTitle = "Login Page";
        String actualTitle = "Login Page";

        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test
    public void verifyValidLogin() {
        String username = "admin";
        String password = "admin123";

        Assert.assertEquals(username, "admin", "Username is incorrect");
        Assert.assertEquals(password, "admin123", "Password is incorrect");
    }

    @Test
    public void verifyCartTotal() {
        int itemOnePrice = 100;
        int itemTwoPrice = 200;
        int expectedTotal = 300;

        int actualTotal = itemOnePrice + itemTwoPrice;

        Assert.assertEquals(actualTotal, expectedTotal, "Cart total is incorrect");
    }

    @Test
    public void sampleFailingTest() {
        Assert.assertEquals("Login Successful", "Login Failed");
    }
}