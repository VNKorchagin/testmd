import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.ws.WebEndpoint;
import java.util.concurrent.TimeUnit;

public class WeatherPage {
    private WebDriver driver;

    @FindBy(className = "navigation-city__city")
    private WebElement cityField;

    public WeatherPage(FirefoxDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getCity() {
        return cityField.getText();
    }
}
