package ru.dolgiy;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.page;
import com.codeborne.selenide.SelenideElement;
import java.util.List;

/**
 * Created by Anton on 26.02.2016.
 */
public class SelenideTestUlmart {
    @Test
    public void orderProccessor() {

        HomePage homepage = Selenide.open("http://www.ulmart.ru/", HomePage.class);
        homepage.clickElementByX(".//*[@id='cityOk']");
        homepage.chooseCategory("Комплектующие для ПК");

        CategoryPage catPage = page(CategoryPage.class);
        catPage.chooseSubCategory("Процессоры");

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
