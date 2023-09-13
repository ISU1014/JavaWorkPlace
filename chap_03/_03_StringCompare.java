package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); //대 소문자 구별
        //대소문자 구분없이 문자열 내용 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화
        s1 = "1234"; // s1과 s2는 같은 곳을 참조
        s2 = "1234";

        System.out.println(s1.equals(s2)); // 내용비교
        System.out.println(s1 == s2); // 참조하는것을 비교

        s1 = new String( "1234");
        s2 = new String( "1234");
        System.out.println(s1.equals(s2)); //ture
        System.out.println(s1 == s2); //false!!
        //문자열의 내용을 비교할때는 == 등호가 아닌 .equals() 로 비교하자.


    }
}
