package operations;

public class Division implements MathOperation {
    private int a, b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() throws Exception {
        return a/b;
    }
}
