package ru.dolgiy;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Anton on 26.02.2016.
 */
public class CartPage {

    public void confirmOrder(){
   $(By.xpath(".//*[@id='pre-cart-summary']//a[1]")).click();
    }

    public void changeQntity(int q){
        $(By.xpath(".//*[@id='qty_item_0']")).setValue(Integer.toString(q)).pressEnter();
        sleep(5000);
    }
}
