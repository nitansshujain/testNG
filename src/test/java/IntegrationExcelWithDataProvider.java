import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationExcelWithDataProvider {
    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupplier.class)
    public void TestLogin(String userName, String password) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();
        Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
        Thread.sleep(5000);
        driver.quit();
    }
}
