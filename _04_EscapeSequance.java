package chap_03;

public class _04_EscapeSequance {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        //(Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n 줄바꿈
        System.out.println("자바가\n너무\n재밌어여");

        // \t tab
        System.out.println("해물파전\t9000원");
        System.out.println("부추전\t\t8000원");

        // \\역슬래시 두번 -> \
        System.out.println("c:\\Program Files\\Java");

        // 단비가 야옹이라고 했어요
        System.out.println("단비가 '야옹' 이라고 했어요"); //
        System.out.println("단비가 \"야옹\" 이라고 했어요"); //

        char c ='A'; //char은 작은 따옴표 사용
        c = '\'';
        System.out.println(c);





    }
}
