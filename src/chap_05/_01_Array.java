package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 선언
        // 1
        String[] coffee = new String[4];
        // 2
        String coffe2[] = new String[4];

        /*coffee[0] = "아메리카노";
        coffee[1] = "카페모카";
        coffee[2] = "라떼";
        coffee[3] = "카푸치노";*/

        // 3
        String[] coffee3 = new String[] { "아메리카노", "카페모카", "라떼", "카푸치노" };

        // 4
        String[] coffee4 = { "아메리카노", "카페모카", "라떼", "카푸치노" };

        // 배열 요소 출력
        for (int i = 0;i < 4;i++)
            System.out.println(coffee4[i] + " 하나 주세요.");

        coffee4[2] = "에스프레소"; // 배열 값 변경
        System.out.println("---값 변경 후 다시 출력---");
        for (int i = 0;i < 4;i++)
            System.out.println(coffee4[i] + " 하나 주세요.");

        // 다른 자료형
        int[] i = new int[] {1, 2, 3};
        double[] d = new double[] { 3.0, 1.1};
    }
}
