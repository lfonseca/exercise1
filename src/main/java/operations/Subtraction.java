package operations;

public class Subtraction implements MathOperation {
    private int a, b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() throws Exception {
        return a-b;
    }
}
