package gmail.salokin1991.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ManualTest1 {

    @Test
    @AllureId("6125")
    @DisplayName("Manual Test 1")
    @Owner("allure8")
    void manualTest1() {
        step("Переход по ссылке url");
        step("Какие-то шаги");
        step("Проверка чего-либо");
    }
}
