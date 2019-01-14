package ch7;

public class assertTest {
    public static void main(String[] args) {
        int n = 1;
        System.out.println("n = " + n);
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(n > 0);
        assert n > 0 : "n is less 0 ";

        System.out.println("hello world");
    }
}
