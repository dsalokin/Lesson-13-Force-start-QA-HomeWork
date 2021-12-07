package gmail.salokin1991.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Tag("evotor")
public class EvotorSiteTests extends TestBase {

    @Disabled
    @Test
    void headerMenuTest() {
        step("Открываем страницу https://evotor.ru/", () -> {
            mainPage.openBasePage();
        });
        step("Проверяем наличие пунктов меню", () -> {
            mainPage.checkingHeaderItems();
        });
        step("Проверяем логотип", () -> {
            mainPage.checkingLogoImg();
        });
    }

    @Disabled
    @Test
    void contentSlidesTest() {
        step("Открываем страницу https://evotor.ru/", () -> {
            mainPage.openBasePage();
        });
        step("Проверяем наличие элементов слайдера", () -> {
            mainPage.checkingSliderContent();
        });
        step("Проверяем видимость элементов слайдера при повторной прокрутке", () -> {
            mainPage.checkingSliderItemsVisibility();
        });
    }

    @Test
    void loginTabTest() {
        step("Открываем страницу https://evotor.ru/", () -> {
            mainPage.openBasePage();
        });
        step("Нажимаем кнопку 'Личный кабинет' и переходим на новую вкладку", () -> {
            mainPage.checkAndClickAccount();
            mainPage.goToWindow1();
        });
        step("Проверяем наличие заголовка и отсутствие предупреждающего текста", () -> {
            loginPage.checkingForm();
        });
        step("Проверяем наличие предупреждающего текста", () -> {
            loginPage.checkingAfterLogin();
        });
    }
}
