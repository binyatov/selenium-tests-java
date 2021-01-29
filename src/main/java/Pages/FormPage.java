package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
    public  static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Pasha");
        driver.findElement(By.id("last-name")).sendKeys("Binyatov");
        driver.findElement(By.id("job-title")).sendKeys("Dev");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='3']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("01/01/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    public static void waitForAlert(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getAlertText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}
