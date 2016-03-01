package ru.dolgiy;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
/**
 * Created by Anton on 28.02.2016.
 */
public class LoginPage {
    public void putLoginInfo(){

        if($(By.xpath("html/body//form/fieldset/div[5]//button")).isDisplayed()){
        $(By.xpath(".//*[@id='ctrl5']")).setValue("antondolgiy@mail.ru");
        $(By.xpath(".//*[@id='enter_password']")).setValue("ytrewq12");
        sleep(10000);
        // !! enter captcha manualy before it click!
        }
    }
    public void confirmLoinInfo(){
        if($(By.xpath("html/body//form/fieldset/div[5]//button")).isDisplayed()){
        $(By.xpath("html/body//form/fieldset/div[5]//button")).click();}
    }
}
