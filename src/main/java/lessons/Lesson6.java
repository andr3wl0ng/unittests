package lessons;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

public class Lesson6 {

    private static Logger logger = LoggerFactory.getLogger(Lesson6.class);

    public static void main(String [] args){
        Selenide.open("https://www.ukr.net/");
        SelenideElement main = $x("//a[@lc='229']");
        String mainText = main.getText();
        logger.error("We will make assertion now!");
        Assertions.assertThat("Головне").isEqualTo(mainText);



    }
}
