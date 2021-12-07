package gmail.salokin1991.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import gmail.salokin1991.config.CredentialConfig;
import gmail.salokin1991.helpers.Attach;
import gmail.salokin1991.pages.LoginPage;
import gmail.salokin1991.pages.MainPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;
import static gmail.salokin1991.pages.StaticTestData.BASE_URL;
import static io.qameta.allure.Allure.step;
import static java.lang.String.format;

public class TestBase {

    public static CredentialConfig credentials =
            ConfigFactory.create(CredentialConfig.class);

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void beforeAll() {

        String selenoidUrl = System.getProperty("url");
        String login = credentials.login();
        String password = credentials.password();

        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.startMaximized = true;
        Configuration.remote = format("https://%s:%s@" + selenoidUrl, login, password);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void beforeEach() {
        step("Открываем страницу https://evotor.ru/", () -> open(BASE_URL));
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWindow();
    }
}
