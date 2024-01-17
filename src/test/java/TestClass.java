import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void testNG(){
        System.out.println("Testing");
    }

    @Test
    public void TestGoogle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void TestFacebook() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("nitansshujain", Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }

}
