import operations.Division;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class DivisionTest {
    @Autowired
    private Division divisionOperation;

    @Test
    public void testNotNull() {
        Assert.assertNotNull(divisionOperation);
    }

    @Test
    public void testDivisionResult() {
        try {
            Assert.assertEquals(divisionOperation.calculate(), 20);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
