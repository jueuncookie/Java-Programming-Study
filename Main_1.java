public class Main_1 {
    public static void main(String[] args) {
        System.out.println("Hello, world! 안녕");  //세미콜론(;)은 하나의 구문이 끝났음을 명시적으로 나타내는 기호다. 다음처럼 한줄에 여러구문을 사용하고 싶을 때 세미콜론이 유용하다.
        System.out.println('생');
        System.out.println(1 + 2);
        System.out.println(1.2 + 1.3);
        System.out.println(2 * 4);
        System.out.println(6 / 3);
        System.out.println('생'); //만약 문자열을 작은 따옴표로 감싸면 에러가 발생한다.

        System.out.println("egoing said \"Welcome programming world\""); //이스케이프, 문자열 안에 큰 따옴표를 넣고 싶다면. 파이썬과 동일
        System.out.println("HTML\nCSS\nJavaScript\n");

        System.out.println("생활"+"코딩");
// New part. 변수에 값을 대입하는 방법  정수편
        int a; //변수 a를 지금부터 사용하겠다고 변수를 선언
        a = 1; //변수 a에 숫자 1을 할당
        System.out.println(a+1); //2

        a = 2;
        System.out.println(a+1); //3
//실수편
        double b = 1.1;
        System.out.println(b+1.1); // 2.2

        b = 2.1;
        System.out.println(b+1.1); // 3.2

        // 문자열
        String first = "coding"; //변수의 값이 꼭  숫자가 와야 하는 것은 아님 문자열을 변수에 담을 때는 위와 같이 변수의 이름 앞에 String을 붙여준다.
        System.out.println(first+" "+"everybody");

        String c, d;
        c = "coding";
        d = " everybody";
        System.out.println(c+d);
// 다음은 자바스크립트에서 변수를 대입하는 장면이다
        a = 10;
        b = 22.2;
        alert(a+b);

        int aa = 100;
        //변수가 없다면 이러한 경우에 일일이 대입해야함.
        System.out.println(aa + 10);
        System.out.println((aa+ 10) / 10);
        System.out.println(((aa + 10) / 10) - 10);
        System.out.println((((aa + 10) / 10) - 10) * 10);
    }

    private static void alert(double v) {
    }

}
