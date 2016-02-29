package ru.dolgiy;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.CollectionCondition.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;
import java.util.List;

/**
 * Created by Anton on 29.02.2016.
 */
public class UlmartCucumberSteps {
    @Given("^I navigate to ulmart\\.ru site$")
    public void i_navigate_to_ulmart_ru_site() throws Throwable {

        open("http://www.ulmart.ru/");

    }

    @When("^I click on confirmcitybutton$")
    public void i_click_on_button() throws Throwable {
        $(By.xpath(".//*[@id='cityOk']")).click();

    }

    @When("^I click on choose processors$")
    public void i_click_on_choose_processors() throws Throwable {
        $(By.xpath(".//*[@id='b-dropdown-catalog-menu']/div/div/div/div/ul/*/a[@data-gtm-eventcontent='Комплектующие для ПК']")).click();
        $(By.xpath("//section[1]//div[1]/ul/*/a[@data-gtm-eventcontent='Процессоры']")).click();

        sleep(5000);

    }

    @When("^I click on select random available model$")
    public void i_click_on_select_random_available_model() throws Throwable {
        List<SelenideElement> buttonlist=$$(By.xpath(".//*/div/div[1]/div[2]/a[1][@data-goodid]"));
        int a=(int)(Math.random()*(buttonlist.size()-1));
        SelenideElement buybutton=buttonlist.get(a);
        buybutton.click();
        sleep(5000);


    }



    @When("^I click on confirm order$")
    public void i_click_on_confirm_order() throws Throwable {
        $(By.xpath(".//*[@id='pre-cart-summary']//a[1]")).click();

    }

    @When("^I do login$")
    public void i_do_login() throws Throwable {
        $(By.xpath(".//*[@id='ctrl5']")).setValue("antondolgiy@mail.ru");
        $(By.xpath(".//*[@id='enter_password']")).setValue("ytrewq12");
        sleep(10000);
        // !! enter captcha manualy before it click!
        $(By.xpath("html/body//form/fieldset/div[5]//button")).click();


    }

    @When("^I order delivery$")
    public void i_order_delivery() throws Throwable {
        $(By.xpath("html/body/div[2]/div[1]/div/section/div[1]/div[2]/div/div[1]/h3/span")).click();
        $(By.xpath(".//*[@id='street']")).setValue("ул Маршала Захарова");
        $(By.xpath(".//*[@id='home']")).setValue("21");
        $(By.xpath(".//*[@id='flat']")).setValue("15");
        $(By.xpath(".//*[@id='zipCode']")).setValue("198332");
        $(By.xpath(".//*[@id='buttonNext']")).click();
        sleep(10000);


    }

    @Then("^I get to page checkoutnew$")
    public void i_get_to_page_check_out_new() throws Throwable {
        System.out.println("Don't know how, but I believe it's possible to retrieve last page url and do some EqualAssert");


    }

}
