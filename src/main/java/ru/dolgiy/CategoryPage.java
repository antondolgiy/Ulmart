package ru.dolgiy;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Anton on 26.02.2016.
 */
public class CategoryPage {
    public void chooseSubCategory (String subgoods)
    {
        $(By.xpath("//section[1]//div[1]/ul/*/a[@data-gtm-eventcontent='"+subgoods+"']")).click();
        sleep(5000);

    }
}
