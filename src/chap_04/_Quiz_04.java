package chap_04;

public class _Quiz_04 {
    // 주차 요금 정산 프로그램 작성
    // 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
    // 경차 또는 장애인 차량은 최종 요금에서 50% 할인
    // 예: 일반 차량 5시간 주차 시 20000원, 경차 5시간 주차 시 10000원, 장애인 차량 10시간 주차 시 15000원
    public static void main(String[] args) {
        String carType; // 자동차 유형
        int userTime = 0; // 주차 시간
        int basicBill = 4000; // 기본요금
        int total = 0; // 총 요금

        // 일반 차량이 3시간 주차 했을 경우
        carType = "일반";
        userTime = 10;
        total = basicBill * userTime; // 총 요금은 (기본요금) * (추자 시간)
        if (total > 30000) // 총 요금이 3만원 초과 시
            total = 30000; // 일일 최대 요금은 3만원이므로 총 요금 3만원
        if (carType.equals("경차") || carType.equals(("장애인차량")))
            total /= 2; // 경차 또는 장애인 차량이면 총 요금의 50% 할인이므로 2로 나눠줌

        // 총 요금 출력
        System.out.println(userTime + "시간 이용하셨습니다.");
        System.out.println("주차 요금은 " + total + "원 입니다.");

        // String carType 대신 불 자료형 사용해서 할 수도 있음
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부
    }
}
