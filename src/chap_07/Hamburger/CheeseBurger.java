package chap_07.Hamburger;

public class CheeseBurger extends Hamburger {
    // 재료는 양상추, 패티, 피클, 치즈
    public CheeseBurger() {
        this.name = "치즈버거";
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}
