package chap_01;

public class _05_VariablesNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능(공백 X)
        // 3. 변수명은 밑줄 또는 문자로 시작
        // 4. 한 단어 도는 2개 이상의 단어 연속으로 지음
        // 5. 변수는 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어 제외)
        // 6. 예약어 사용 불가
        
        // 입국 신고서 예제 
        String nationality = "대한민국"; // 국적
        String firstName = "MinHyeong"; // 이름
        String lastName = "Lee"; // 성
        String dataOfBirth = "2001-11-14"; // 생년월일
        String residentialAddress = "A호첼"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo;
        String _filght_no_2;
        
        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; //체류 기간
        
        String item1 = "시계";
        String item2 = "가방";
        
        // 상수 - 상수는 모두 대문자
        final String CODE = "KOR"; 
    }
}
