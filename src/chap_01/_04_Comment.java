package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        // 주석
        System.out.println("이 문장은 10");
//        System.out.println("이 문장은 5");
        System.out.println("지금부터 시작");

        int size = 120; // 어린이 발사이즈
        size += 10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 큰 신발을 구매
        System.out.println("사이즈는 " + size);

        /*여러 줄 주석
        int a = 10;
        int b = 20;
        System.out.println(a + b);*/

//        단축키
        // ctrl + /  --> 한 줄 주석
        // ctrl + shift + /  --> 여러 줄 주석
    }
}
