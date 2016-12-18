import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by McKay on 18.12.2016.
 */
public class FirstCase {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest(){
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("software-testing.ru");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("software-testing.ru - Поиск в Google"));
    }
        @After
    public void stop(){
            driver.quit();
            driver = null;

        }


}
