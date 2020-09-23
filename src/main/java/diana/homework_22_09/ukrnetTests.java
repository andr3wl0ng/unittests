package diana.homework_22_09;

import java.text.DecimalFormat;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$x;

public class ukrnetTests {

    public static void main(String[] args) {

        Selenide.open("https://www.ukr.net/");

        // Test case #1: Check Currency tab is opened correctly
        SelenideElement currencyTab = Selenide.$x("//li[@class='currency']");
        currencyTab.click();

        SelenideElement currencyContainer = Selenide.$x("//div[@class='right-tabs__tab-body right-tabs__currency']");
        currencyContainer.shouldBe(Condition.visible);

        // Test case #2: Check Currency calculator works correctly
        SelenideElement currentDollarRateEl = Selenide.$x("//div[@id='curr-kalc']/ul/li[3]/div[@class='right']/b");
        String currentDollarRateStr = currentDollarRateEl.text();
        float currentDollarRate = Float.parseFloat(currentDollarRateStr);
        //System.out.println(currentDollarRate);

        $x("//input[@id='usd']").setValue("100");

        float expectedValue = 100 * currentDollarRate;
        DecimalFormat fmt = new DecimalFormat("0.00");

        String expectedValueStr = String.valueOf(fmt.format(expectedValue));

        SelenideElement uahSum = Selenide.$x("//input[@id='grn']");
        String uahSumStr = uahSum.getAttribute("value");
        //System.out.println(uahSumStr);

        Assertions.assertThat(uahSumStr).isEqualTo(expectedValueStr);

        // Test case #3: Check News by region
        $x("//div[@class='feed__section--regions']").click();
        $x("//div[@class='feed__regions--rows d-clear']").shouldBe(Condition.visible);
        $x("//div[@class='feed__regions--rows d-clear']/div/a[text()='Чернігів']").click();

        Selenide.sleep(1500);
        SelenideElement regionNewsHeader = Selenide.$x("//div[@class='feed__section--regions']/a");
        String regionNewsHeaderText = regionNewsHeader.getText();
        Assertions.assertThat(regionNewsHeaderText).isEqualTo("Чернігівські новини");

        $x("//div[@class='feed__section--more']/a[text()='всі новини розділу']").click();
        Selenide.sleep(1500);
        SelenideElement header = Selenide.$x("//main//h2");
        String actualHeaderText = header.getText();
        Assertions.assertThat(actualHeaderText).isEqualTo("Події в Чернігові та області");

        // Test case #4: Check that news is Political section are ordered by time
        Selenide.back();
        ElementsCollection politicNewsItemsTime = Selenide.$$x("//article[@class='feed']/section[2]/div[@class='feed__item']/time");
        List<String> politicNewsItemsTimeList = politicNewsItemsTime.texts();
        List<Integer> politicNewsItemsTimeListInt = politicNewsItemsTimeList.stream().map(el ->
                Integer.parseInt(el.replace(":", ""))).collect(Collectors.toList());
                        for (int i = 0; i < politicNewsItemsTimeListInt.size() - 1; i++) {
                            Assertions.assertThat(politicNewsItemsTimeListInt.get(i)).isGreaterThanOrEqualTo(politicNewsItemsTimeListInt.get(i+1));
        }
        // Test case #5 (draft): Verify search is working
        $x("//input[@id='search-input']").setValue("test").pressEnter();
        //SelenideElement searchURL = Selenide.url();
        //https://selenide.gitbooks.io/user-guide/content/ru/selenide-api/webdriver-runner.html
        //assertThat(new URL(searchURL)).hasQuery("q=тест");



    }
}
