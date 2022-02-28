package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BaseMethods {
    protected static AppiumDriver<MobileElement> appiumDriver;
    DesiredCapabilities capabilities;
    public Logger logger = LogManager.getLogger(getClass().getName());
    //final static Logger logger = LogManager.getLogger(BaseMethods.class.getName());
    protected WebDriverWait wait;

    public WebElement findElement(By by) {
        wait = new WebDriverWait(appiumDriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void scroll() throws InterruptedException {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        TimeUnit.SECONDS.sleep(2);
    }

    public void clickBack() throws InterruptedException {
        findElement(BaseElements.backButton).click();
    }

    public MobileElement randomSelect(By by){
        List<MobileElement> x = appiumDriver.findElements(by);
        int size = x.size();
        Random random = new Random();
        int randomProduct = random.nextInt(size);
        return x.get(randomProduct);
    }
    public void waitForSeconds(int wait) throws InterruptedException {
        Thread.sleep(1000*wait);
    }
}
