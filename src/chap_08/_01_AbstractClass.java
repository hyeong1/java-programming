package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 데이터 추상화
        // abstract
        // 추상 메소드 (추상 클래스와 추상 인터페이스에서만 사용 가능한, 껍데기만 있는 메소드)

        //Camera camera = new Camera(); : 추상 클래스는 객체를 생성할 수 없음
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
