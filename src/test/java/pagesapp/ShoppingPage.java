package pagesapp;

import base.BaseElements;
import base.HomeBase;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;


public class ShoppingPage extends HomeBase {

    @Step("Alışverişe başlaya tıklanır.")
    public void clickStartShopping(){
        findElement(BaseElements.startShopping).click();
        logger.info("Alışverişe Başla butonuna tıklandı.");
    }

    @Step("Alışveriş sayfasına gidildiği kontrol edilir.")
    public void checkShopping(){
        String checkShop = findElement(BaseElements.checkShopping).getAttribute("resource-id");
        Assertions.assertEquals("com.ozdilek.ozdilekteyim:id/relLayStore",checkShop);
        logger.info("Alışveriş sayfası açıldı.");
    }
}
