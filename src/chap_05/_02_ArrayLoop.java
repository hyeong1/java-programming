package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열 순회
        String[] coffee = { "아메리카노", "카페모카", "라떼", "카푸치노" };

        // "라떼" 찾아서 해당 인덱스 출력하기
        for (int i = 0;i < 4;i++) {
            if (coffee[i].equals("라떼")) {
                System.out.println("라뗴는 " + i + "번째");
                break;
            }
        }
    }
}
