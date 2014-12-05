import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class YandexTest
{
    private FirefoxDriver driver;

    @Before
    public  void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://pogoda.yandex.ru/");
    }

    @After
    public void tearDown(){
       driver.close();
    }

    @Test
    public void CheckCity(){
        WeatherPage weather = new WeatherPage(driver);
        assertTrue("Город определился не верно",weather.getCity().equals("Погода в Пензе"));
    }
}
