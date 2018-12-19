import operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SubtractionTest {
    @Autowired
    private Subtraction subtractionOperation;

    @Test
    public void testNotNull() {
        Assert.assertNotNull(subtractionOperation);
    }

    @Test
    public void testSubtractionResult() {
        try {
            Assert.assertEquals(subtractionOperation.calculate(), 1);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
