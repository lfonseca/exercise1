package operations;

public class Multiplication implements MathOperation {
    private int a, b;

    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() throws Exception {
        return a*b;
    }
}
