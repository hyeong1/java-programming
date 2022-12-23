package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환
        int score = 93;
        System.out.println(score);
        System.out.println((double)score);

        double score_d = 93.3;
        System.out.println(score_d);
        System.out.println((int)score_d);
        
        // 변수에 형변환된 데이터 넣기
        double intToDouble = score; // 작은 범위->큰 범위에 넣을 때 자동 형변환
        int DoubleToInt = (int)score_d; // 큰 범위->작은 범위 넣을 때는 수동 형변환

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93); // 정수를 문자열로 바꾸기
        System.out.println(s1);

        // 실수를 문자열로
        String s2 = String.valueOf(98.8); // String 클래스 제공 기능
        s2 = Double.toString(98.8); // Double 클래스 제공 기능
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("99");
        System.out.println(i);

        double d = Double.parseDouble("12.1212");
        System.out.println(d);
    }
}
