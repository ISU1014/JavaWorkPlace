package chap_02;

public class _06_Quiz {
    public static void main(String[] args) {
        /*
        어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램
        조건 1. 키가 120cm 이상인 경우에만 탑승 가능
        조건 2. 삼항 연산자 이용
        */
        int height1 = 115;
        int height2 = 121;

        String a = "키가 115cm 이므로 탑승 불가능합니다";
        String c = "키가 121cm 이므로 탑승 가능합니다";

        String height = (height1 > height2) ? a : c;

        System.out.println(height);
    }
}
