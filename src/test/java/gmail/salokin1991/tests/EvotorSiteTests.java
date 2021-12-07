package gmail.salokin1991.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;
import static io.qameta.allure.Allure.step;

@Tag("evotor")
public class EvotorSiteTests extends TestBase {

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
}
