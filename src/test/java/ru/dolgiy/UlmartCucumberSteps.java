package ru.dolgiy;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.*;

/**
 * Created by Anton on 29.02.2016.
 */
public class UlmartCucumberSteps {
    HomePage homepage=page(HomePage.class);
    CategoryPage catPage = page(CategoryPage.class);
    ProductPage productPage = page(ProductPage.class);
    CartPage cartpage = page(CartPage.class);
    LoginPage loginPage = page(LoginPage.class);
    CheckOutPage checkOutPage = page(CheckOutPage.class);


    @Given("^I navigate to ulmart\\.ru site$")
    public void i_navigate_to_ulmart_ru_site()  {

        open("http://www.ulmart.ru/", HomePage.class);

    assertEquals("Юлмарт – интернет-магазин",Selenide.title());
    assertTrue($(By.xpath(".//*[@id='b-dropdown-catalog-menu']/span")).isDisplayed());
    }

    @When("^I click on confirmcitybutton$")
    public void i_click_on_confirmcitybutton()  {
        homepage.clickElementByX(".//*[@id='cityOk']");

    }

    @When("^I click on choose group \"([^\"]*)\"$")
    public void i_click_on_choose_group(String group)  {
        homepage.chooseCategory(group);

    assertTrue($(By.xpath(".//*[@id='search-cat-b']")).is(Condition.type("button")));
    assertEquals("Комплектующие для ПК – интернет-магазин Юлмарт",Selenide.title());

    }

    @When("^I click on choose subgroup \"([^\"]*)\"$")
    public void i_click_on_choose_subgroup(String subprod) {
        catPage.chooseSubCategory(subprod);


    }

    @When("^I select random available model$")
    public void i_select_random_available_model()  {
        productPage.ChooseRandomAvailable2buy();



    }

    @When("^I click on confirm order$")
    public void i_click_on_confirm_order()  {
        cartpage.confirmOrder();


    }

    @When("^I do login$")
    public void i_do_login()  {
        loginPage.putLoginInfo();

    assertTrue("ENTER KAPCHA MANUALY",$(By.xpath(".//*[@id='captchaInput']")).is(Condition.not(Condition.empty)));

        loginPage.confirmLoinInfo();


    }

    @When("^I order delivery$")
    public void i_order_delivery()  {
        checkOutPage.orderDelivery();


    }

    @Then("^I get to page checkoutnew$")
    public void i_get_to_page_checkoutnew() {

    assertEquals("Оформление заказа",Selenide.title());



    }

}
