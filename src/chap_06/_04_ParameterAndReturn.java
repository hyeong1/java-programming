package chap_06;

public class _04_ParameterAndReturn {
    public static int power(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있는 메소드
        System.out.println("2의 2승은 " + power(2));

        int result = power(3);
        System.out.println("3의 2승은 " + result);
    }
}
