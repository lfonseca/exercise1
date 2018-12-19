import operations.Multiplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MultiplicationTest {
    @Autowired
    private Multiplication multiplicationOperation;

    @Test
    public void testNotNull() {
        Assert.assertNotNull(multiplicationOperation);
    }

    @Test
    public void testMultiplicationResult() {
        try {
            Assert.assertEquals(multiplicationOperation.calculate(), 20);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
