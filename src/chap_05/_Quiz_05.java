package chap_05;

public class _Quiz_05 {
    // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램 작성
    // 신발 사이즈는 150부터 295까지 5단위로 증가
    // 신발 사이즈 수는 총 10가지
    public static void main(String[] args) {
        int[] shoesSize = new int[10];

        // 배열 요소 초기화
        for (int i = 0;i < shoesSize.length;i++)
            shoesSize[i] = 250 + (i * 5);

        // 출력 - foreach 사용해서 출력
        for (int size: shoesSize) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

    }
}
