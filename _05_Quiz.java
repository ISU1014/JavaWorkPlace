package chap_03;

public class _05_Quiz {
    public static void main(String[] args) {
        /*
         * 주민등록번호에서 생년월일 및 성별까지만 출력하는
         * 프로그램을 작성하시오
         * */

        String a ="901231-1234567"; // 주민등록번호
        String b ="030708-4567890";
        System.out.println(a.substring(0,8));
        System.out.println(b.substring(0,b.indexOf("-")+2));
    }
}
