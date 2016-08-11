import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by pavilion on 11.08.2016.
 */
public class lesson2 {

    @Test
    public void testName() throws Exception
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://finance.i.ua/");
        driver.manage().window().maximize();

        driver.findElement(By.id("fn_s1")).sendKeys("2000");
        new Select(driver.findElement(By.id("fn_s1"))).selectByVisibleText("USD");
        new Select(driver.findElement(By.id("fn_bank"))).selectByVisibleText("НБУ");





        driver.quit();

    }

}
