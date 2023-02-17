package Project;

import HelpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.text.Element;

public class LoginAndCompletingAddress {

    public WebDriver driver;
    ProjectMethods projectMethods= new ProjectMethods(driver);

    @Test
    public void MetodaTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.manage().window().maximize();


        WebElement DismissBtn = driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']"));
        DismissBtn.click();

        //Login into an account

        projectMethods.WaitMethod();
        WebElement MyAccountBtn = driver.findElement(By.xpath("//a[text()='My Account']"));
        MyAccountBtn.click();

        projectMethods.WaitMethod();
        jse.executeScript("window.scrollBy(0,450)");

        WebElement Username = driver.findElement(By.id("username"));
        String UsernameValue = "user1234";
        projectMethods.FillOutEmptyField(Username, UsernameValue);

        WebElement Password = driver.findElement(By.id("password"));
        String PasswordValue = "123456Asdfg.";
        projectMethods.FillOutEmptyField(Password, PasswordValue);

        projectMethods.WaitMethod();
        WebElement VisiblePasswordBtn = driver.findElement(By.xpath("//span[@class='show-password-input']"));
        projectMethods.Click(VisiblePasswordBtn);

        projectMethods.WaitMethod();
        WebElement RememberMeBtn = driver.findElement(By.id("rememberme"));
        projectMethods.Click(RememberMeBtn);

        WebElement LoginBtn = driver.findElement(By.xpath("//button[@value='Log in']"));
        projectMethods.Click(LoginBtn);

        //Completing billing address

        projectMethods.WaitMethod();
        jse.executeScript("window.scrollBy(0,450)");

        WebElement AddressesBtn = driver.findElement(By.xpath("//a[text()='Addresses']"));
        projectMethods.Click(AddressesBtn);

        projectMethods.WaitMethod();
        jse.executeScript("window.scrollBy(0,450)");

        WebElement AddBillingAddressBtn = driver.findElement(By.xpath("//a[@href='https://shop.demoqa.com/my-account/edit-address/billing/'] "));
        projectMethods.Click(AddBillingAddressBtn);

        projectMethods.WaitMethod();
        jse.executeScript("window.scrollBy(0,450)");

        WebElement FirstName = driver.findElement(By.id("billing_first_name"));
        String FistNameValue = "FirstNameTest";
        projectMethods.FillOutEmptyField(FirstName, FistNameValue);

        WebElement LastName = driver.findElement(By.id("billing_last_name"));
        String LastNameValue = "LastNameTest";
        projectMethods.FillOutEmptyField(LastName, LastNameValue);

        WebElement BillingCompanyName = driver.findElement(By.id("billing_company"));
        String BillingCompanyNameValue = "Test SRL.";
        projectMethods.FillOutEmptyField(BillingCompanyName, BillingCompanyNameValue);
    }
}
