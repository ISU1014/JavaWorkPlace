package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        //문자열 변수

        String name; // ; 선언.
        name = "나도 코딩"; //오른쪽의 변수를 왼쪽의 객체에 넣는다.
        int hour = 5;   //정수형 변수
        System.out.println(name + "님, 택배가 "+hour+"에 도착했습니다");

        double score = 90.5; //실수 double
        char grade = 'A'; //한글자는 '' char + '' 로표시
        name = "류이수"; //name 업데이트
        System.out.println(name+"님의 평균점수는"+score+"점입니다");
        System.out.println("학점은"+" "+grade+"입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.1456789555;
        float f = 3.14456798788F; // float = f or F 입력
        System.out.println(d);
        System.out.println(f);


        int i = 1000000000;
        long l = 10000000000L; //int 보다 긴 long+ l L;
        l = 1_000_000_000_000l;
        System.out.println(l);

        //int, long, float, double, char, String, boolean


    }
}
