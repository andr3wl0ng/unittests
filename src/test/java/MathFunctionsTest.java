import org.junit.Assert;
import org.junit.Test;


public class MathFunctionsTest {
        @Test
        public void multiplyTest(){
            int a = 1; // 2. Steps, assign variables and call method
            int b = 2;
            int expResult = 2;
// 3. Pass/fail criteria: assert that 1*2=2
            Assert.assertEquals(expResult, MathFunctions.multiply(a, b));
        }
    }
// 4. post conditions – JUnit do them instead of us

