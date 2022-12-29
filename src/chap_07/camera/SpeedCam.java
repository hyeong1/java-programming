package chap_07.camera;

public class SpeedCam extends Camera { // Camera의 자식 클래스
    public SpeedCam() {
        // this.name = "과목단속 카메라";
        super("과목단속 카메라");
    }
    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
    
    public void checkSpeed() {
        // 속도 체크 메소트
        System.out.println("속도를 측정합니다.");
    }
    
    public void recognizeLicensePlate() {
        // 차량 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }
    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 차량 속도 측정, 차량 번호 인식");
    }
}
