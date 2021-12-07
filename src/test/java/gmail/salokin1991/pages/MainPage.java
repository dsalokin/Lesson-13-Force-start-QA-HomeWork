package gmail.salokin1991.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement HEADER_MENU = $("#menu-glavnoe-menyu"),
            LOGO = $(".logo__img");
    private final String BASE_URL = "https://evotor.ru/",
            LOGO_URL = "https://evotor.ru/wp-content/uploads/2019/05/logo.svg",
            HEADER_ITEM_0 = "Онлайн-кассы",
            HEADER_ITEM_1 = "Сервисы для бизнеса",
            HEADER_ITEM_2 = "Поддержка",
            HEADER_ITEM_3 = "О компании",
            HEADER_ITEM_4 = "Наша сеть";


    public MainPage openBasePage() {
        open(BASE_URL);
        return this;
    }

    public MainPage checkingHeaderItems() {

        HEADER_MENU.shouldHave(text(HEADER_ITEM_0),
                text(HEADER_ITEM_1),
                text(HEADER_ITEM_2),
                text(HEADER_ITEM_3),
                text(HEADER_ITEM_4)).shouldBe(visible);
        return this;
    }

    public MainPage checkingLogoImg() {
        LOGO.shouldHave(attribute("src", LOGO_URL)).shouldBe(visible);
        return this;
    }
}
