package chap_06;

public class _Quiz_06 {
    // 개인 정보 중 일부를 비공개로 전환하는 프로그램 작성
    // 하나의 메소드로 비공개 처리하기
    // 이름: 2번째 글자
    // 주민등록번호: 9번째 글자
    // 전화번호: 10번째 글자 부터 비공개
    public static String getHiddenData(String str, int n) {
        String hiddenStr = str.substring(0, n); // 공개하는 문자만 보여주도록 문자열 잘라서 새로운 문자열 hiddenStr에 저장
        for (int i = n;i < str.length();i++) // 문자열에 비공개 처리할 문자들은 "*"로 추가
            hiddenStr += "*";

        return hiddenStr; // 완성된 문자열 반환
    }
    public static void main(String[] args) {
        String name = "이민형";
        String id = "011114-4012345";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 :" + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
