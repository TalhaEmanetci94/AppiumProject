package pagesapp;

import base.BaseElements;
import base.HomeBase;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;


import java.util.concurrent.TimeUnit;

public class LoginPage extends HomeBase {

    @Step("Üye giriş sayfasına gidildiği kontrol edilir.")
    public void checkLogin(){
        String checkLogin = findElement(BaseElements.login).getText();
        Assertions.assertEquals("Giriş Yap",checkLogin);
        logger.info("Üye giriş sayfası açıldı.");
    }

    @Step("Kullanıcı e-posta girişini yapar.")
    public void sendEmail(){
        findElement(BaseElements.sendEmail).sendKeys("e-mail@gmail.com");
        logger.info("E-posta Girişi Yapıldı");
    }
    @Step("Kullanıcı sifre girişini yapar.")
    public void sendPassword(){
        findElement(BaseElements.sendPassword).sendKeys("password");
        logger.info("Şifre Girişi Yapıldı");
    }
    @Step("Geri dönülür.")
    public void comeBackTwoTimes() throws InterruptedException {
        clickBack();
        TimeUnit.SECONDS.sleep(3);
        clickBack();
        logger.info("Geçmiş Sekmelere Dönüş Sağlandı");
    }
}
