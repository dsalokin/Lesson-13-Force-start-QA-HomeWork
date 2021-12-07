package gmail.salokin1991.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static gmail.salokin1991.pages.StaticTestData.*;
import static io.qameta.allure.Allure.step;

@Tag("evotor")
@Owner("dsalokin")
@DisplayName("Тесты сайта https://evotor.ru")
public class EvotorSiteTests extends TestBase {

    @Test
    @Tag("BLOCKER")
    @Tag("evotor_main")
    @DisplayName("Проверка заголовка и наличия пунктов в меню сайта")
    void headerMenuTest() {

        step("Проверяем наличие пунктов меню", () -> {
            mainPage.checkingHeaderItems();
        });
        step("Проверяем логотип", () -> {
            mainPage.checkingLogoImg();
        });
    }

    @Test
    @Tag("MAJOR")
    @Tag("evotor_main")
    @DisplayName("Проверка видимости слайдов контента страницы")
    void contentSlidesTest() {

        step("Проверяем наличие элементов слайдера", () -> {
            mainPage.checkingSliderContent();
        });
        step("Проверяем видимость элементов слайдера при повторной прокрутке", () -> {
            mainPage.checkingSliderItemsVisibility();
        });
    }

    @Test
    @Tag("CRITICAL")
    @Tag("evotor_login")
    @DisplayName("Переход на вкладку входа в личный кабинет и проверка содержимого.")
    void loginTabTest() {

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

    static Stream<Arguments> marketSearchTest() {
        return Stream.of(
                Arguments.of(RESPONSE_0, Arrays.asList(RESULT_0)),
                Arguments.of(RESPONSE_1, Arrays.asList(RESULT_1))
        );
    }

    @MethodSource
    @Tag("MINOR")
    @Tag("evotor_market")
    @ParameterizedTest(name = "Переход на страницу магазина, ввод в поиске {0} и проверка наличия {1} в выдаче.")
    void marketSearchTest(String response, List<String> expectedResult) {

        step("Нажимаем кнопку 'Личный кабинет' и переходим на новую вкладку", () -> {
            mainPage.checkAndClickAccount();
            mainPage.goToWindow1();
        });
        step("Нажимаем на заголовок 'ЭВОТОР'", () -> {
            loginPage.clikLogo();
        });
        step("Вводим запросы в поле поиска", () -> {
            SEARCH_FIELD.setValue(response);
        });
        step("Проверяем таблицу выдач на наличие текста", () -> {
            FAST_SEARCH_RESULT_TAB.shouldHave(text(expectedResult.get(0)));
        });
    }
}
