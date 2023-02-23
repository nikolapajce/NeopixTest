package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest extends BasicTests{
    @Test(priority = 100)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated() {
        driver.navigate().to(baseUrl + "home");
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"), "[Error] URL does not contain /login");
    }
}
