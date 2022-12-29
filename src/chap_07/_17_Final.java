package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final - const랑 비슷
        // 메소드 변경하지 못하게 하고 싶을 때 final void ~ 메소드 이름 ...
        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈"; --> lens는 final로 선언되었기 때문에 어디서도 바꿀 수 없음 (고정됨)
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("--------------------------");
        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();;
    }
}
