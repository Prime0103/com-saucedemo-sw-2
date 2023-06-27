package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        // Open browser and launch base url
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        // Enter "standard_user" Username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        // Enter "secret_sauce"password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        // Click on the loginLink
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //Verify the expected  “PRODUCTS"
        String expectedText ="Products";
        String actualText=driver.findElement(By.xpath("//span[@class ='title']")).getText();
        Assert.assertEquals(expectedText,actualText);

    }





}
