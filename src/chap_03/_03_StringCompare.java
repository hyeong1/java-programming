package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // s1, s2 문자열이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); // equals()는 대소문자를 구분하기 때문에 false

        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열 내용 비교 -> true

        // 문자열 비교 심화
        s1 = "1234"; // 참조
        s2 = "1234";
        System.out.println(s1.equals(s2)); // 내용비교
        System.out.println(s1 == s2); // 참조하는 곳 비교

        s1 = new String("1234"); // 여기서의 s1과 s2는 서로 다른 공간에 저장됨 (참조되는 곳이 다름)
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // => true
        System.out.println(s1 == s2); // => false
    }
}
