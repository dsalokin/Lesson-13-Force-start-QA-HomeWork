package gmail.salokin1991.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement HEADER_MENU = $("#menu-glavnoe-menyu"),
            LOGO = $(".logo__img"),
            ACCOUNT_BTN = $(".btn.btn--text-upper.header-cabinet__desktop"),
            LOGIN_FORM = $(".auth-form.ng-star-inserted"),
            LOGIN_BY_TEXT = $(byText("Войти")),
            SLIDER = $("#main-slider");
    private final String BASE_URL = "https://evotor.ru/",
            LOGO_URL = "https://evotor.ru/wp-content/uploads/2019/05/logo.svg",
            HEADER_ITEM_0 = "Онлайн-кассы",
            HEADER_ITEM_1 = "Сервисы для бизнеса",
            HEADER_ITEM_2 = "Поддержка",
            HEADER_ITEM_3 = "О компании",
            HEADER_ITEM_4 = "Наша сеть",
            ACCOUNT_BTN_NAME = "Личный кабинет",
            AUTH_FORM_HEADER = "Вход в личный кабинет Эвотора",
            WARN_TEXT_0 = "Введите номер телефона",
            WARN_TEXT_1 = "Заполните поле",
            SLIDER_ITEM_0 = "Скидка 50% на приложения для Эвотора",
            SLIDER_ITEM_1 = "Линейка смарт-терминалов «Эвотор»",
            SLIDER_ITEM_2 = "Эвотор Select";

    public MainPage openBasePage() {
        open(BASE_URL);
        return this;
    }

    public MainPage checkingHeaderItems() {
        HEADER_MENU.shouldHave(
                text(HEADER_ITEM_0),
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

    public MainPage checkingSliderContent() {
        SLIDER.shouldHave(text(SLIDER_ITEM_0)).shouldBe(visible, Duration.ofMillis(20000));
        SLIDER.shouldHave(text(SLIDER_ITEM_1)).shouldBe(visible, Duration.ofMillis(20000));
        SLIDER.shouldHave(text(SLIDER_ITEM_2)).shouldBe(visible, Duration.ofMillis(20000));
        return this;
    }

    public MainPage checkingSliderItemsVisibility() {
        $(byText(SLIDER_ITEM_0)).shouldBe(visible, Duration.ofMillis(20000));
        $(byText(SLIDER_ITEM_1)).shouldBe(visible, Duration.ofMillis(20000));
        $(byText(SLIDER_ITEM_2)).shouldBe(visible, Duration.ofMillis(20000));
        return this;
    }

    public MainPage checkAndClickAccount() {
        ACCOUNT_BTN.shouldHave(text(ACCOUNT_BTN_NAME)).click();
        return this;
    }

    public MainPage goToWindow1() {
        Selenide.switchTo().window(1);
        return this;
    }
}
