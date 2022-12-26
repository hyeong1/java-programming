package chap_06;

public class _07_Main {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(s);
        }

        // 도서관리 프로그램
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납

        if (args.length == 1) { // 문자열 배열 크기가 1일 때
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("1 ~ 3 중에서 입력해주세요.");
        }
    }
}
