package lessons;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson7 {

    @Test
    public void test1() {
        //        WebDriverRunner.url();
        Set<String> testSet = new HashSet<>();
        testSet.add("advb");
//        testSet.add("advb");
        testSet.add("1234");
//        Arrays.asList(testSet.toArray()).get(0);

        Map<String, String> firstMap = new HashMap<>();
        testSet.forEach(key -> {
            firstMap.put(key, "Value" + key);
        });

        firstMap.put("index1", "firstValue");
        firstMap.put("index2", "secondValue");
    }
}
