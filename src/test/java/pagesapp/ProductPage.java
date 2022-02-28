package pagesapp;

import base.BaseElements;
import base.HomeBase;
import com.thoughtworks.gauge.Step;


public class ProductPage extends HomeBase {


    @Step("Aşağı kaydırılır.")
    public void scrollDown() throws InterruptedException {
        scroll();
        Thread.sleep(1000);
        logger.info("Sayfa iki kere aşağıya kaydırıldı.");
    }
    @Step("<wait> kadar bekle." )
    public void waitForSeconds(int wait) throws InterruptedException {
        Thread.sleep(1000*wait);
    }

    @Step("Rasgele bir ürün seçilir.")
    public void randomProduct(){
        randomSelect(BaseElements.selectProduct).click();
        logger.info("Rasgele bir ürün seçildi.");
    }
}
