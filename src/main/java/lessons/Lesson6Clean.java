package lessons;

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

public class Lesson6Clean {

    public static void main(String [] args){


        Selenide.open("https://www.ukr.net/");
//        SelenideElement headerImage = Selenide.$x(
//                "//img[@src='//upst.fwdcdn.com/temp/holidays/9093/logo_ua.gif']");
//        headerImage.shouldBe(Condition.visible);
//
//        SelenideElement economyLink = Selenide.$x(
//                "//h2[@class='feed__section--title']/a[@href='//www.ukr.net/news/jekonomika.html']");
//        economyLink.click();
//        SelenideElement header = Selenide.$x("//main//h2");
//        String actualHeaderText = header.getText();
//        Assertions.assertThat(actualHeaderText).isEqualTo("Економіка та бізнес");


//        Selenide.actions().sendKeys(Keys.F1).perform();
//
//
//        Selenide.sleep(10000);
//        header.waitUntil(Condition.visible, 10000);

//        Selenide.back();
//
//        ElementsCollection sideBarHeadersElements = Selenide.$$x("//h3[contains(@class,'block__h3')]");
//        List<String> sideBarHeadersList = sideBarHeadersElements.texts();

//        ElementsCollection timeElements = Selenide.$$x("//time");
//        List<String> timeList = timeElements.texts();
//
//        List<Integer> timeListInt = timeList.stream().map(el ->
//                Integer.parseInt(el.replace(":", ""))).collect(Collectors.toList());
//
//        for (int i = 0; i < timeListInt.size() - 1; i++) {
//            if(timeListInt.get(i) >= timeListInt.get(i+1)) {
//                System.out.println("Vse ok");
//            } else {
//                Assertions.fail("Vse ne ok");
//            }
//        }

//        Selenide.sleep(10000);


        // Test 1
        Selenide.switchTo().frame($x("//iframe[@name='mail widget']"));
        $x("//input[@name='login']").setValue("loginValue");
        $x("//input[@name='password']").setValue("passwordValue");
        $x("//button[text()='Увійти']").click();
        $x("//p[@class='form__error form__error_wrong form__error_visible']")
                .shouldBe(Condition.visible);



        Selenide.open();
    }
}
