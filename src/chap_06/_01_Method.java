package chap_06;

public class _01_Method {
    // 메소드 만들기(정의)
    public static void sayHello() {
        System.out.println("안녕하세요. 메소드 생성");
    }
    public static void main(String[] args) {
        // 메소드 사용(호출)
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
