package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형(Primitive Data Types) : int, float, double, long, boolean, ...
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형(Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...
        String[] s = new String[3];
        System.out.println(s[0]);

        // 참조 -> 가리키는 대상이 달라짐
        Camera c1 = new Camera();
        changeName(c1);
        Camera c2 = new Camera();
        // c1 = c2; --> 이거 하면 c1이 가리키는 대상이 c2가 가리키는 참조로 바뀜
        c2 = null;
    }

    public static void changeName(Camera c) {

    }
}
