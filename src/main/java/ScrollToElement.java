import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(name);
        name.click();
        name.sendKeys("Pasha Binyatov");

        WebElement date = driver.findElement(By.id("date"));
        date.click();
        date.sendKeys("01/01/2021");
        Thread.sleep(1000);
        driver.quit();
    }
}
