package chap_01;

public class _Quiz_01 {
    // 버스 도착 정보를 출력하는 프로그램
    // 버스 번호는 "1234, "상암08"과 같은 형태
    // 남은 시간은 분 단위
    // 남은 거리는 km단위
    public static void main(String[] args) {
        String bus1 = "612";
        String bus2 = "마을12";
        int bus1Time = 5;
        int bus2Time = 7;
        double bus1Km = 1.5;
        double bus2Km = 0.9;

        // 출력
        System.out.println(bus1 + "번 버스는 " + bus1Time + "분 뒤 도착 예정입니다.");
        System.out.println(bus1 + "번 버스 남은 거리: " + bus1Km + "km");
        System.out.println(bus2 + "번 버스는 " + bus2Time + "분 뒤 도착 예정입니다.");
        System.out.println(bus2 + "번 버스 남은 거리: " + bus2Km + "km");
    }
}
