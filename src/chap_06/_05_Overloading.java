package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static double getPower(double number) {
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0;i < exponent;i++)
            result *= number;
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 (이름이 같은 메소드를 여러 개 만드는 것)
        // 전달값의 타입이 다르거나, 전달값 개수가 다르면 오버로딩 가능
        System.out.println(getPower(2)); // int power(int );
        System.out.println(getPower("4")); // int powerStr(String );

        System.out.println(getPower(3.0)); // double power(double );
    }
}
