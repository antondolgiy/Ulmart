package ru.dolgiy;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Anton on 28.02.2016.
 */
public class CheckOutPage {

    public void orderDelivery(){
        $(By.xpath("html/body/div[2]/div[1]/div/section/div[1]/div[2]/div/div[1]/h3/span")).click();
        $(By.xpath(".//*[@id='street']")).setValue("ул Маршала Захарова");
        $(By.xpath(".//*[@id='home']")).setValue("21");
        $(By.xpath(".//*[@id='flat']")).setValue("15");
        $(By.xpath(".//*[@id='zipCode']")).setValue("198332");
        $(By.xpath(".//*[@id='buttonNext']")).click();
        sleep(10000);



    }
}
