package pagesapp;

import base.BaseElements;
import base.HomeBase;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

public class FirstOpenPage extends HomeBase {


    @Step("Ozdilek uygulamasının çalıştığı kontrol edilir.")
    public void checkOpen(){
        String checkText = findElement(BaseElements.startShopping).getText();
        Assertions.assertEquals("ALIŞVERİŞE BAŞLA",checkText);
        logger.info("Uygulama doğru bir şekilde çalışıyor.");
    }
}
