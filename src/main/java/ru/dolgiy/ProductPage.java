package ru.dolgiy;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Anton on 28.02.2016.
 */
public class ProductPage {
    public void ChooseRandomAvailable2buy(){
        List<SelenideElement> buttonlist=$$(By.xpath(".//*/div/div[1]/div[2]/a[1][@data-goodid]"));
        int a=(int)(Math.random()*(buttonlist.size()-1));
        SelenideElement buybutton=buttonlist.get(a);
        buybutton.click();
        sleep(5000);


    }
}
