package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public은 직접 접근 가능
        //b1.resolution = "FHD"; // defult인 resolution은 같은 패키지 내에서만 직접 접근 가능
        //b1.price = 200000; // private이라 접근 못함
        //b1.color = "white"; // protected 패키지도 다르고 자식 클래스가 아니기때문에 접근 못,함
    }
}
