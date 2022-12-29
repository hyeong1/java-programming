package chap_07;

import chap_07.Hamburger.CheeseBurger;
import chap_07.Hamburger.Hamburger;
import chap_07.Hamburger.ShrimpBurger;

public class _Quiz_07 {
    // 클래스를 이용하여 햄버거를 자동으로 만드는 프로그램 작성
    // 햄버거의 종류는 햄버거, 치즈버거, 새우버거 3가지
    // 각 버거는 각각의 클래스로 생성
    // 버거 이름을 담기 위한 name 변수 정의
    // 재료 정보를 표시하는 cook() 메소드 정의
    // 공통 부분은 상속 및 메소드 오버라이딩으로 처리
    // 모든 클래스는 하나의 파일에 정의
    public static void main(String[] args) {
        Hamburger[] hamburgers = new Hamburger[3];
        hamburgers[0] = new Hamburger();
        hamburgers[1] = new CheeseBurger();
        hamburgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-----------------------");
        for (Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("-----------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
