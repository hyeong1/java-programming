package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 출력
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 모두 대문자로
        System.out.println(s.toLowerCase()); // 모두 소문자로

        // 문자열에 특정 문자가 포함되어 있는지
        System.out.println(s.contains("Java")); // "Java"라는 글자가 있으면 true, 없으면 false
        System.out.println(s.contains("C++"));

        // 문자열에서 특정 문자가 어디에 위치하는지
        System.out.println(s.indexOf("Java")); // "Java"라는 문자열이 s에 어디에 있는지 출력
        System.out.println(s.indexOf("P"));
        System.out.println(s.indexOf("C#")); // 문자열에 포함되지 않는다면 -1를 반환
        System.out.println(s.indexOf("and")); // 처음 발견되는 "and" 위치 출력
        System.out.println(s.lastIndexOf("and")); // 마지막으로 찾은 "and" 위치 출력

        // 문자열의 시작 문구, 끝 문구 확인
        System.out.println(s.startsWith("I like")); // s라는 문자열이 "I like"으로 시작하는지 -일치하면 true, 아니면 false
        System.out.println(s.endsWith(".")); // 문자열이 "."으로 끝나는지 확인
    }
}
