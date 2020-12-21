import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, California");
        /*
        Thread.sleep is use because in this example the script was running faster that the page loading so without the sleep,
        the program does not worked well. 
         */
        Thread.sleep(1000);

        WebElement autocompleteResultd = driver.findElement(By.className("pac-item"));
        autocompleteResultd.click();

        driver.quit();
    }
}
