package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호 생성하는 역할 (0부터 시작해서 계속 ++1)

    // 클래스 변수 - 모든 객체에 똑같이 적용됨
    static boolean canAutoReport = false; // 자동 신고 기능
    
    // 생성자 - 클래스 명과 똑같이 작성, 반환형은 없음
    BlackBox() {
        //System.out.println("기본 생성자 호출");
        //this.serialNumber = ++counter;
        //System.out.println("새로운 시리얼 번호를 발급받았습니다 : " + this.serialNumber);
        
        // 여기서 아래의 생성자를 호출하고 싶으면
        // this("모델명", "해상도", 가격, "색상"); --> 이렇게 입력하면 됨
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        //this(); // this()는 기본 생성자를 호출함
        
        //System.out.println("사용자 정의 생성자 호출");
        //this.modelName = modelName;
        //this.resolution = resolution;
        //this.price = price;
        //this.color = color;
    }

    // 자동으로 신고하는 메소드 생성
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    // 메모리 카드 인식
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // 영상 개수 반환 - 전달값, 반환값 모두 있는 메소드
    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10; // type을 알 수 없을 때는 전체 영상 개수 10 반환
    }

    // 녹화 메소드 생성 - 매개변수: 날짜정보 포시 유무, 당시 차량속도 포시 유무, 영상 기록 단위
    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    // 모든 객체에 공통적으로 적용되는 클래스 메소드 - 객체 생성하지 않고도 사용 가능한 메소드
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-xxxx)로 연결합니다.");
        // modelName = "test"; // 인스턴스변수는 static 메소드에서 직접 접근 x
        canAutoReport = true; // static으로 선언한 변수는 static 메소드에서 접근 가능 
    }

    // 모델 네임 추가하는 메소드
    void appendModelName(String modelName) {
        this.modelName += modelName; // 인스턴스 변수와 메소드의 파라미터 변수 이름이 같을 때 --> this. 을 붙이면 인스턴스 변수를 말함. (위에서 선언한 modelName)
    }

    // Getter: 값 가져오는 메소드
    // Setter: 값 설정하는 메소드
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) // 값이 아예 없거나 비어있으면
            return "판매자에게 문의하세요.";
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
