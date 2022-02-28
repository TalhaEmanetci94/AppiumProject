package pagesapp;

import base.BaseElements;
import base.HomeBase;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ProductDetailPage extends HomeBase {


    @Step("Ürün detay sayfasının açıldığı kontrol edilir.")
    public void checkProductDetail() {
        String checkProductDetail = findElement(BaseElements.checkProductDetail).getText();
        Assertions.assertEquals("Listeme Ekle", checkProductDetail);
        logger.info("Ürün Detay Sayfası açıldı.");
    }

    @Step("Ürün favorilere eklenir.")
    public void addFav() {
        findElement(BaseElements.clickFav).click();
        logger.info("Favorilere ekle butotuna tıklandı.");
    }

   /* @Step("Ürün sepete eklenir.")
    public void addCart(){
        if (findElement(BaseElements.checkBodySize).getAttribute("enabled").equals("true")){
            randomSelect(BaseElements.selectBodySize).click();
            findElement(BaseElements.addCart).click();
        }
        else {
            findElement(BaseElements.addCart).click();
        }
        logger.info("Sepete Ekle Butonuna Tıklandı");
    }*/
    @Step("Ürün sepete eklenir.")
    public void addToCart() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(BaseElements.addCart).click();
        System.out.println("Sepete ekle butonuna basildi.");
        Thread.sleep(3000);
    }
}