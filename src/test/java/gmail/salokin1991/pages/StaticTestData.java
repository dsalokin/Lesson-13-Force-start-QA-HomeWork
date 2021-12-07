package gmail.salokin1991.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StaticTestData {

    public static final SelenideElement HEADER_MENU = $("#menu-glavnoe-menyu"),
            LOGO = $(".logo__img"),
            ACCOUNT_BTN = $(".btn.btn--text-upper.header-cabinet__desktop"),
            LOGIN_FORM = $(".auth-form.ng-star-inserted"),
            LOGIN_BY_TEXT = $(byText("Войти")),
            SLIDER = $("#main-slider"),
            EVOTOR_SVG_LOGO = $(".auth__header-logo"),

    SEARCH_FIELD = $(".input.ng-untouched.ng-pristine.ng-valid"),
            FAST_SEARCH_RESULT_TAB = $(".search-result__list.ng-star-inserted");

    public static final String BASE_URL = "https://evotor.ru/",
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
            SLIDER_ITEM_2 = "Эвотор Select",
            RESPONSE_0 = "Услуги",
            RESPONSE_1 = "Маркировка",
            RESULT_0 = "Кассовый интерфейс",
            RESULT_1 = "Редакторы товаров";
}
