public class PostiveCheck {
    private int a;
    private int b;
    private int c;

    public PostiveCheck(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String checkPositives() {
        StringBuilder result = new StringBuilder();
        if (a > 0) {
            result.append("a is positive\n");
            if (b > 0) {
                result.append("b is positive\n");
            }
        }

        if (c > 0) {
            result.append("c is positive\n");
        }
        return result.toString();
    }

}
