import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
        newTabBtn.click();

        String originalHandle = driver.getWindowHandle();
        /*
        Change to new window
         */
        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        /*
        Returns to original window
         */
        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
