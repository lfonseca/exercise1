package operations;

public class Sum implements MathOperation {
    private int a, b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() throws Exception {
        return a+b;
    }
}
