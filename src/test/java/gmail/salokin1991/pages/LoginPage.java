package gmail.salokin1991.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement LOGIN_FORM = $(".auth-form.ng-star-inserted"),
            LOGIN_BY_TEXT = $(byText("Войти"));

    private final String AUTH_FORM_HEADER = "Вход в личный кабинет Эвотора",
            WARN_TEXT_0 = "Введите номер телефона",
            WARN_TEXT_1 = "Заполните поле";


    public LoginPage checkingForm() {
        LOGIN_FORM
                .shouldHave(text(AUTH_FORM_HEADER))
                .shouldNotHave(text(WARN_TEXT_0), text(WARN_TEXT_1));
        return this;
    }

    public LoginPage checkingAfterLogin() {
        LOGIN_BY_TEXT.click();
        LOGIN_FORM.shouldHave(text(WARN_TEXT_0), text(WARN_TEXT_1));
        return this;
    }
}
