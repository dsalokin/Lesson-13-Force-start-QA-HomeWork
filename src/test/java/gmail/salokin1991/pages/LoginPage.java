package gmail.salokin1991.pages;

import static com.codeborne.selenide.Condition.text;
import static gmail.salokin1991.pages.StaticTestData.*;

public class LoginPage {

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

    public LoginPage clikLogo() {
        EVOTOR_SVG_LOGO.click();
        return this;
    }
}
