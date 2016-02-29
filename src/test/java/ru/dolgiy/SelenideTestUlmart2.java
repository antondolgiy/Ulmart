package ru.dolgiy;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Anton on 28.02.2016.
 */
public class SelenideTestUlmart2 {
    @Test
    public void orderVideoCard() {

        HomePage homepage = Selenide.open("http://www.ulmart.ru/", HomePage.class);
        homepage.clickElementByX(".//*[@id='cityOk']");
        homepage.chooseCategory("Комплектующие для ПК");

        CategoryPage catPage = page(CategoryPage.class);
        catPage.chooseSubCategory("Видеокарты");

        ProductPage productPage = page(ProductPage.class);
        productPage.ChooseRandomAvailable2buy();

        CartPage cartpage = page(CartPage.class);
        cartpage.changeQntity(2);
        cartpage.confirmOrder();

        LoginPage loginPage = page(LoginPage.class);
        loginPage.putLoginInfo();


        CheckOutPage checkOutPage = page(CheckOutPage.class);
        checkOutPage.orderDelivery();

    }
}