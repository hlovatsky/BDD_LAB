package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

import java.util.concurrent.TimeUnit;

import static pages.BasePage.getDriver;

public class Hooks {

    @Before
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.prestashop.com/");
        BasePage.setDriver(driver);

        try {
            WebElement webElement = new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("loadingMessage")));
        } catch (Exception e) {
            System.out.println("Element is not visibility");
        }

        try {
            Boolean webElement = new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingMessage")));
        } catch (Exception e) {
            System.out.println("Element is not visibility");
        }

        driver.switchTo().frame("framelive");
    }

    @After
    public void closeDriver() {
        getDriver().quit();
    }
}
