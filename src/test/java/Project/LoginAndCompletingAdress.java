package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginAndCompletingAdress extends ProjectMethods{

    public WebDriver driver;

    @Test
    public void MetodaTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://shop.demoqa.com/");

        driver.manage().window().maximize();


        WebElement DismissBtn = driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']"));
        DismissBtn.click();

        //Login into an account

        Thread.sleep(1000);
        WebElement MyAccountBtn = driver.findElement(By.xpath("//a[text()='My Account']"));
        MyAccountBtn.click();

        Thread.sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,450)");

        WebElement Username = driver.findElement(By.id("username"));
        String UsernameValue = "user1234";
        Username.sendKeys(UsernameValue);

        WebElement Password = driver.findElement(By.id("password"));
        String PasswordValue = "123456Asdfg.";
        Password.sendKeys(PasswordValue);

        Thread.sleep(1000);
        WebElement VisiblePasswordBtn = driver.findElement(By.xpath("//span[@class='show-password-input']"));
        VisiblePasswordBtn.click();

        Thread.sleep(1000);
        WebElement RememberMeBtn = driver.findElement(By.id("rememberme"));
        RememberMeBtn.click();

        WebElement LoginBtn = driver.findElement(By.xpath("//button[@value='Log in']"));
        LoginBtn.click();

        //Completing billing address



    }
}
