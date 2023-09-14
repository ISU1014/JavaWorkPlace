package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;
        // 셋 중 하나라도 true면 true
        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true 이면 괜찮은 식당
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 셋 중 하나라도 falsㄷ 면 false

        //And 연산
        System.out.println((5 > 3) && (3 > 1)); // 둘중 하나라도 falsㄷ 면 false
        System.out.println((5>3) && (3 <1)); // 둘중 하나라도 falsㄷ 면 false

        //Or 연산
        System.out.println((5>3) || (3>1));
        System.out.println((5>3) || (3<1)); //둘 중 하나라도 true 면 true
        System.out.println((5<3) || (3<1));

        System.out.println(1 < 3 && 3 < 5);
        //System.out.println( 1 < 3 < 5 ); //불가능한 연산

        //논리 부정 연산자
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println( 5 == 5 ); //true
        System.out.println(!(5==5)); //false
        System.out.println(!(5 == 3)); //true


    }
}
