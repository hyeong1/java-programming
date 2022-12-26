package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 편리, 높은 재사용성, 모든 것이 객체로 이루어져있다

        // 차량용 블랙박스 예제 - 모댈명, 해상도, 가격, 색상
        // 1
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 20000;
        String color = "black";

        // 2
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 30000;
        String color2 = "white";

        // 3 ... n번째는 ? => 클래스 사용
        // 클래스: 서로 다른 자료형을 모아둔 하나의 형태

        // 3 -BlackBox 클래스로부터 객체 생성
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox는 BlackBox 클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();
    }
}
