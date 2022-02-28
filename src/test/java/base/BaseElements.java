package base;

import org.openqa.selenium.By;

public class BaseElements {
    public static By startShopping = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    public static By checkShopping = By.id("com.ozdilek.ozdilekteyim:id/relLayStore");
    public static By clickCategory = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    public static By checkCategory = By.xpath("//android.widget.LinearLayout[@content-desc='Kategoriler']");
    public static By clickWoman = By.xpath("//android.widget.RelativeLayout[@index='1']");
    public static By clickTrousers = By.xpath("//android.widget.RelativeLayout[@index='13']");
    public static By selectProduct = By.id("com.ozdilek.ozdilekteyim:id/textView");
    public static By checkProductDetail = By.xpath("//android.widget.TextView[@text='Listeme Ekle']");
    public static By clickFav = By.id("com.ozdilek.ozdilekteyim:id/relLayAddFav");
    public static By login = By.id("com.ozdilek.ozdilekteyim:id/btnLogin");
    public static By sendEmail = By.id("com.ozdilek.ozdilekteyim:id/etEposta");
    public static By sendPassword = By.id("com.ozdilek.ozdilekteyim:id/etPassword");
    public static By backButton = By.id("com.ozdilek.ozdilekteyim:id/ivBack");
    public static By checkBodySize = By.id("com.ozdilek.ozdilekteyim:id/recyclerSizeList");
    public static By selectBodySize = By.xpath("//androidx.recyclerview.widget.RecyclerView[2]//android.widget.RelativeLayout");
    public static By addCart = By.id("com.ozdilek.ozdilekteyim:id/imgCart");
}
