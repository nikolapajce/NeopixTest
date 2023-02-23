package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    private WebDriver driver;
    public Homepage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getButton() {
        return driver.findElement(By.className(""));
    }
}
