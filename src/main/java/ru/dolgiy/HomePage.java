package ru.dolgiy;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Anton on 26.02.2016.
 */
public class HomePage {

    public void clickElementByX (String xpath)
    {
        if ($(By.xpath(xpath)).isDisplayed()){
        $(By.xpath(xpath)).click();
        sleep(5000);}
    }

    public void chooseCategory (String category)
    {
        //$(By.xpath(".//*[@id='b-dropdown-catalog-menu']/div/div/div/div/ul/*/a")).shouldHave(text(category)).click();
        $(By.xpath(".//*[@id='b-dropdown-catalog-menu']/div/div/div/div/ul/*/a[@data-gtm-eventcontent='"+category+"']")).click();
        sleep(5000);
    }
}
