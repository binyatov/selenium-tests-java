import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement rb1 = driver.findElement(By.id("radio-button-1"));
        rb1.click();
        Thread.sleep(1000);
        WebElement rb2 = driver.findElement(By.cssSelector("input[value='option2']"));
        rb2.click();
        Thread.sleep(1000);
        WebElement rb3 = driver.findElement(By.cssSelector("input[value='option3']"));
        rb3.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
