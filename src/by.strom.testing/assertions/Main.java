package by.strom.testing.assertions;

public class Main {
    public static void main(String[] args) {
        System.out.println(test(0,2));
    }

    private static double test(double a, double b ){
        assert (a!=0);
        return b/a;
    }
}
