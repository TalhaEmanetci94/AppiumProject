package pagesapp;

import base.BaseElements;
import base.HomeBase;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

public class CategoryPage extends HomeBase {

    @Step("Katagori Sekmesine tıklanır.")
    public void clickCategory(){
        findElement(BaseElements.clickCategory).click();
        logger.info("Kategori sekmesine tıklandı.");
    }

    @Step("Kategori sekmesine gidildiği kontrol edilir.")
    public void checkCategory(){
        String checkCategory = findElement(BaseElements.checkCategory).getAttribute("content-desc");
        Assertions.assertEquals("Kategoriler",checkCategory);
        logger.info("Kategori sekmesine tıklandı.");
    }

    @Step("Kadın kategorisine tıklanır.")
    public void clickWoman(){
        findElement(BaseElements.clickWoman).click();
        logger.info("Kadın kategorisine tıklandı.");
    }

    @Step("Pantolon kategorisi seçilir.")
    public void clickTrousers(){
        findElement(BaseElements.clickTrousers).click();
        logger.info("Pantolon seçeneğine tıklandı.");
    }
}
