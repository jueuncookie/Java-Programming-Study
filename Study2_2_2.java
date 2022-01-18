public class Study2_2_2 {
    public static void main(String[] args) {
        //자동 형 변환 part :  double 타입의 변수 a에 float 타입의 값을 대입. 타입을 변경해도 정보의 손실이 일어나지 않는 경우 가능.
        double a = 3.0F;  //float a = 3.0; 는 안됨. 상수 3.0은 상수인데, 이 상수는 double 형이다. 이 값을 표현 범위가 좁은 float에 넣으려고 하기 때문에
        //즉, 정리하자면 byte 타입은 short가 될 수 있지만 short는 byte 타입이 될 수 없다. long은 float가 될 수 있지만, float는 long이 될 수 없다.

        //수동 형 변환
        float b = (float) 100.0;
        int c = (int) 100.0F;
    }
}