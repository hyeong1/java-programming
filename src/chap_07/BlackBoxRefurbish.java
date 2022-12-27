package chap_07;

public class BlackBoxRefurbish {
    public String modelName; // 모델명
    String resolution; // 해상도
    private int price; // 가격 --> private로 선언했으므로 클래스 내에서만 접근 가능 (getter, setter로만 접근 가능)
    protected String color; // 색상

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) // 값이 아예 없거나 비어있으면
            return "판매자에게 문의하세요.";
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
