package gmail.salokin1991.pages;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final String BASE_URL = "https://evotor.ru/";

    public MainPage openBasePage() {
        open(BASE_URL);
        return this;
    }

}
