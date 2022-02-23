package gmail.salokin1991.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ManualTest1 {

    @Test
    @AllureId("7646")
    @DisplayName("Test1")
    @Tags({@Tag("critical"), @Tag("web")})
    @Owner("allure8")
    void manualToAutomate() {
        step("Открываем ссылку url");
        step("Вводим значение в строку поиска", () -> {
            step("Нажимаем на строку поиска allure");
            step("Вводим значение");
            step("Нажимаем на иконку поиска");
        });
        step("Проверяем таблицу выдачи на наличие результата allure");
    }
}
