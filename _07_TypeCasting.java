package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로 OR 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((double)score); // 93.0
        System.out.println((float)score); //93.0

        //float, double to int
        float score_f = 93.3F;
        double score_d =93.3;
        System.out.println((int)score_f);  //93
        System.out.println((int)score_d);  //93

        // 정수 + 실수 연산
        score = 93 + (int)98.8;
        System.out.println(score); // 191

        score_d = (double)93+98.8; // 실수를 실수로 더할때 정수는 자동 실수
        System.out.println(score_d); //191.8

        // 변수에 형 변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.8
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)


        // 숫자 데이터를 문자열로
        String s1 = String.valueOf(93); // String.valueOf() 내에 숫자를 넣으면 변환
        s1 = Integer.toString(93); // Integer.toString()
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8


        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); //93
        double D = Double.parseDouble("98.8");
        System.out.println(D);










    }
}