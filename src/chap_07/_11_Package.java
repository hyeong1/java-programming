package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜점 정수 : " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0~9 사이의 랜덤 정수 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수 값

        // 5.0 이상 10.0 미만의 실수를 뽑으려면
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        System.out.println("--------------------------------------------");
        // 로또 번호 랜덤으로 뽑으려면? 범위: 1~45
        for (int i = 0;i < 5;i++)
            System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
    }
}
