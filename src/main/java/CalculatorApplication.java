import calculator.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        calculator.calculate();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
