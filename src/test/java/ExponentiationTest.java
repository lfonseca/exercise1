import operations.Exponentiation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ExponentiationTest {
    @Autowired
    private Exponentiation exponentiationOperation;

    @Test
    public void testNotNull() {
        Assert.assertNotNull(exponentiationOperation);
    }

    @Test
    public void testDivisionResult() {
        try {
            Assert.assertEquals(exponentiationOperation.calculate(), 8);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
