package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // " and"를 ","로 바꾸기
        System.out.println(s.substring(7)); // 7번 인덱스부터 출력
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 끝 위치 바로 직전까지만 출력

        // 공백 제거
        s = "         I love Java.      ";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 합치기
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        String s3 = s1 + ", " + s2;
        System.out.println(s3);

        System.out.println(s1.concat(",")); // s1과 "," 결합
        System.out.println(s1.concat(", ").concat(s2));
    }
}
