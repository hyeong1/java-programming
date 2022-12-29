package chap_07.Hamburger;

public class Hamburger {
    // 재료는 양상추, 패티, 피클
    public String name;

    public Hamburger() {
        this.name = "햄버거";
    }
    
    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}
