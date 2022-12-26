package chap_06;

public class _02_Parameter {
    public static void power(int x) {
        int result = x * x;
        System.out.println(x + "의 2승은 " + result);
    }

    public static void powerByExp(int x, int exponent) {
        int result = 1;
        for (int i = 0;i < exponent;i++)
            result *= x;
        System.out.println(x + "의 " + exponent + "승은 " + result);
    }
    public static void main(String[] args) {
        // 파라미터, 전달값
        for (int i = 1;i < 10;i++)
            power(i);

        powerByExp(2, 10);
    }
}
