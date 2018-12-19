package calculator;

import operations.MathOperation;
import java.util.List;

public class Calculator {
    private List<MathOperation> operations;

    public Calculator(List<MathOperation> operations) {
        this.operations = operations;
    }

    public void calculate() {
        for(MathOperation operation: operations) {
            try {
                int result = operation.calculate();
                System.out.println("Resultado: " + result);
            } catch (Exception e) {
                System.out.println("Operação inválida");
            }
        }
    }
}
