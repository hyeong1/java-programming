package chap_07.Hamburger;

public class ShrimpBurger extends Hamburger {
    // 재료는 양상추, 패티, 피클, 새우

    public ShrimpBurger() {
        this.name = "새우버거";
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
