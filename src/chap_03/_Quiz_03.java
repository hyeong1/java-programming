package chap_03;

public class _Quiz_03 {
    // 주민등록번호에서 생년월일 및 성별까지말 출력하는 프로그램 작성
    // 예: 901231-1234567 -> 901231-1까지 출력
    public static void main(String[] args) {
        String residentN1 = "901231-1234567";
        String residentN2 = "030708-4567890";
        System.out.println(residentN1.substring(0, 8));
        System.out.println(residentN2.substring(0, 8));
    }
}
