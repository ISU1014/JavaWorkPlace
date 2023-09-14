package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용O /(공백사용 불가)
        // 3. _밑줄 또는 문자로 시작 가능 (숫자로 불가)
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어는 사용 불가 (public,static....)

        // 입국 신고서
        String nationality = "대한민국";
        String firstName = "류";
        String lastName = "이수";
        String date_of_birth = "1996-10-14";
        String residentialAdress = "호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
        //예약어 final 은 상수. + 변수는 대문자로

    }
}
