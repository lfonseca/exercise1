package operations;

public class Exponentiation implements MathOperation {
    private int a, b;

    public Exponentiation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() throws Exception {
        return (int)Math.pow(a, b);
    }
}
