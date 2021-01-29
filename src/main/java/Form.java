import Pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formPage = new FormPage();
        formPage.submitForm(driver);
        formPage.waitForAlert(driver);
        assertEquals("The form was successfully submitted!", formPage.getAlertText(driver));
        driver.quit();
    }

}
