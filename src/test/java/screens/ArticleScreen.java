package screens;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class ArticleScreen {

    @Step("Verification that error displays")
    public static void verifyErrorMessage() {
        assertThat($(id("org.wikipedia.alpha:id/view_wiki_error_text"))
                .getAttribute("text")).isEqualTo("An error occurred");
    }
}

