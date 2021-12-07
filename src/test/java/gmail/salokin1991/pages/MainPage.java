package gmail.salokin1991.pages;

import com.codeborne.selenide.Selenide;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static gmail.salokin1991.pages.StaticTestData.*;

public class MainPage {

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

    public MainPage goToWindow2() {
        Selenide.switchTo().window(2);
        return this;
    }
}
