package Project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProjectMethods {

    public WebDriver driver;

    public void ScrollDownMethod(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,450)");
    }
}
