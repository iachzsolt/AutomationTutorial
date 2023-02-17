package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.css.model.Value;

public class ProjectMethods {

    public WebDriver driver;
    public ProjectMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void WaitMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void Click(WebElement Element){
        Element.click();
    }

    public void FillOutEmptyField(WebElement Element, String FieldValue){
        Element.sendKeys(FieldValue);
    }
}

